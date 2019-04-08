package demo.rpc.thrift.Hello;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * @description: Thrift客服端
 * @author: HanZhonghua
 * @create: 2019-04-06 11:04
 */
public class HelloServiceClient {

    public static void main(String[] args) {
        try {
            // 设置调用的服务
            TTransport tTransport = new TSocket("localhost", 7911);
            tTransport.open();
            // 设置传输协议为TBinaryProtocol
            TProtocol protocol = new TBinaryProtocol(tTransport);
            // 创建客服端链接
            Hello.Client client = new Hello.Client(protocol);
            // 调用服务方法
            client.helloVoid();
            tTransport.close();
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        }


    }
}
