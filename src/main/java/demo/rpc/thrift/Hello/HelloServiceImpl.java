package demo.rpc.thrift.Hello;

import org.apache.thrift.TException;

/**
 * @description: impl
 * @author: HanZhonghua
 * @create: 2019-04-06 10:22
 */
public class HelloServiceImpl implements Hello.Iface {

    @Override
    public String helloString(String param) throws TException {
        return param;
    }

    @Override
    public int helloInt(int param) throws TException {
        return param;
    }

    @Override
    public boolean helloBollean(boolean param) throws TException {
        return param;
    }

    @Override
    public void helloVoid() throws TException {

        System.out.println("Hello World");
    }

    @Override
    public String helloNull() throws TException {
        return null;
    }
}
