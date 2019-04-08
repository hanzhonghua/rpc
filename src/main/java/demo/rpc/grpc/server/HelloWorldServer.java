package demo.rpc.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.netty.NettyServerBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @description: grpc server start
 * @author: HanZhonghua
 * @create: 2019-04-07 17:24
 */
@Slf4j
public class HelloWorldServer {

    private Server server;

    private void start() throws Exception {
        int port = 50051;
        server = NettyServerBuilder.forPort(port).addService(new GreeterImpl()).build().start();
        log.info("Server started, listening on "+port);
        // 等待服务器终止，如果不加加载完之后就关闭链接了
        server.awaitTermination();
        // jvm关闭时调用钩子程序关闭grpc服务端
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                log.info("Shutting down grpc server since JVM is shutting down");
                HelloWorldServer.this.stop();
            }
        });
    }

    private void stop() {

        if (server != null){
            server.shutdown();
        }
    }

    public static void main(String[] args) {

        HelloWorldServer server = new HelloWorldServer();
        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
