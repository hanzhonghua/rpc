package demo.rpc.grpc.client;

import demo.rpc.grpc.lib.GreeterGrpc;
import demo.rpc.grpc.lib.Helloworld;
import io.grpc.ManagedChannel;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @description: grpc client
 * 为了调用服务端，需要创建stub，有两种类型的stub
 *  1。阻塞，客户端发起rpc调用后一直等待服务端相应
 *  2。非阻塞，异步响应，通过StreamObserver在响应时回调
 * @author: HanZhonghua
 * @create: 2019-04-07 17:41
 */
@Slf4j
public class HelloWorldClient {

    private final ManagedChannel channel;
    private final GreeterGrpc.GreeterBlockingStub blockingStub;
    private final GreeterGrpc.GreeterStub asyncStub;
    private Random random = new Random();

    public HelloWorldClient(String host, int port){
        channel = NettyChannelBuilder.forAddress(host, port).negotiationType(NegotiationType.PLAINTEXT).build();
        blockingStub = GreeterGrpc.newBlockingStub(channel);
        asyncStub = GreeterGrpc.newStub(channel);
    }

    public void testSayHelloSimple(String name){
        Helloworld.HelloRequest request = Helloworld.HelloRequest.newBuilder().setName(name).build();
        Helloworld.HelloBody response = null;
        try {
            response = blockingStub.sayHello(request);
        }catch (Exception e){

        }
        log.info("单项PRC response: " +response.getMessage());
    }

    // 阻塞stub调用服务端流式RPC
    public void testSayHelloServer(String name){
        Helloworld.HelloRequest request = Helloworld.HelloRequest.newBuilder().setName(name).build();
        Iterator<Helloworld.HelloBody> responses = null;
        try {
            responses = blockingStub.sayHelloServere(request);
            for (int a = 1;responses.hasNext();a++){
                Helloworld.HelloBody body = responses.next();
                log.info("服务端流式RPC response: " + body.getMessage());
            }
        }catch (Exception e){

        }
    }

    // 非阻塞stub调用客户端流式RPC
    public void testSayHelloClient(String name) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        StreamObserver<Helloworld.HelloBody> responseObserver = new StreamObserver<Helloworld.HelloBody>() {

            @Override
            public void onNext(Helloworld.HelloBody value) {
                System.out.println("客户端流式RPC response: " + value.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("RecordRoute Failed");
                countDownLatch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished RecordRoute");
                countDownLatch.countDown();
            }
        };
        // 使用非阻塞式stub
        StreamObserver<Helloworld.HelloRequest> requestStreamObserver = asyncStub.sayHelloClient(responseObserver);
        try {
            for (int a = 0;a<10;a++){
                Helloworld.HelloRequest request = Helloworld.HelloRequest.newBuilder().setName("world" + a).build();
                requestStreamObserver.onNext(request);
                Thread.sleep(random.nextInt(1000));
                if(countDownLatch.getCount()==0){
                    return;
                }
            }
        }catch (Exception e){

        }
        requestStreamObserver.onCompleted();
        if(!countDownLatch.await(1000, TimeUnit.SECONDS)){
            System.out.println("recordRoute can not finidshed within 1minutes");
        }
    }

    // 使用非阻塞stub调用双向流式RPC
    public CountDownLatch testSayHelloChat(){
        CountDownLatch countDownLatch = new CountDownLatch(1);
        StreamObserver<Helloworld.HelloRequest> requestStreamObserver = asyncStub.sayHelloChat(new StreamObserver<Helloworld.HelloBody>() {
            @Override
            public void onNext(Helloworld.HelloBody value) {
                System.out.println("双向流式RPC response: " +value.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Failed Chat...");
                countDownLatch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("finshed Chat...");
                countDownLatch.countDown();
            }
        });

        List<String> strings = Arrays.asList("1 message", "2 message", "3 message", "4 message");
        try {

            for (String req :strings){
                Helloworld.HelloRequest request = Helloworld.HelloRequest.newBuilder().setName(req).build();
                requestStreamObserver.onNext(request);
            }
        }catch (Exception e){

        }
        requestStreamObserver.onCompleted();
        return countDownLatch;
    }

    public void shundown(){
        channel.shutdown();
    }

    public static void main(String[] args) {
        HelloWorldClient client = new HelloWorldClient("localhost", 50051);
        String str = "world";
        try {
            client.testSayHelloSimple(str);
            client.testSayHelloServer(str);
            client.testSayHelloClient(str);
            CountDownLatch countDownLatch = client.testSayHelloChat();
            if(!countDownLatch.await(1000, TimeUnit.SECONDS)){
                System.out.println("Route Chat not finished within 1 minutes");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        client.shundown();
    }
}