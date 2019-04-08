package demo.rpc.grpc.server;

import demo.rpc.grpc.lib.GreeterGrpc;
import demo.rpc.grpc.lib.Helloworld;
import io.grpc.stub.StreamObserver;

/**
 * @description: grpc server demo
 * @author: HanZhonghua
 * @create: 2019-04-07 16:39
 */
public class GreeterImpl extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(Helloworld.HelloRequest request, StreamObserver<Helloworld.HelloBody> responseObserver) {

        Helloworld.HelloBody build = Helloworld.HelloBody.newBuilder().setMessage("Hello " + request.getName()).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();

    }

    @Override
    public void sayHelloServere(Helloworld.HelloRequest request, StreamObserver<Helloworld.HelloBody> responseObserver) {

        Helloworld.HelloBody build = Helloworld.HelloBody.newBuilder().setMessage("Hello " + request.getName()).build();
        responseObserver.onNext(build);
        Helloworld.HelloBody build2 = Helloworld.HelloBody.newBuilder().setMessage("Hello " + request.getName()).build();
        responseObserver.onNext(build2);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Helloworld.HelloRequest> sayHelloClient(StreamObserver<Helloworld.HelloBody> responseObserver) {
        return new StreamObserver<Helloworld.HelloRequest>() {

            StringBuilder sb = new StringBuilder("hello ");
            @Override
            public void onNext(Helloworld.HelloRequest request) {
                sb.append(request.getName()).append(",");
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("recordRoute cancelled");
            }

            @Override
            public void onCompleted() {
                Helloworld.HelloBody build = Helloworld.HelloBody.newBuilder().setMessage(sb.toString()).build();
                responseObserver.onNext(build);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<Helloworld.HelloRequest> sayHelloChat(StreamObserver<Helloworld.HelloBody> responseObserver) {
        return new StreamObserver<Helloworld.HelloRequest>() {
            // 返回结果
            @Override
            public void onNext(Helloworld.HelloRequest request) {
                Helloworld.HelloBody build = Helloworld.HelloBody.newBuilder().setMessage("Hello " + request.getName()).build();
                responseObserver.onNext(build);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("routeChat cancelled");
            }

            // 表示已经完成了和RPC的交互
            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
