package demo.rpc.thrift.Hello;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TBinaryProtocol.Factory;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * @description: 启动Thrift服务器
 * @author: HanZhonghua
 * @create: 2019-04-06 10:25
 */
public class HelloServiceServer {

    public static void main(String[] args) {
        try {
            // 设置服务端口
            TServerSocket socket = new TServerSocket(7911);
            // 设置协议工厂为TBinaryProtocol.Factory
            Factory factory = new TBinaryProtocol.Factory();
            // 关联处理器与Hello服务实现
            TProcessor processor = new Hello.Processor(new HelloServiceImpl());
            TServer tServer = new TSimpleServer(new TServer.Args(socket).processor(processor));
            System.out.println("Start Server On Port 7911...");
            tServer.serve();

        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }
}
