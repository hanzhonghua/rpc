namespace java demo.rpc.thrift.Hello

/**
* Thrift是对IDL(Interface Definition Language)描述性语言的具体实现，因此服务接口需要使用IDL语法编写
* 在控制台进入该文件目录使用thrift -gen java Hello.thrift编译,会生成Java文件，该文件包含了Hello.thrift
* 文件定义的接口，还包含了客户端调用类Hello.Client以及服务端处理逻辑类Hello.Processor,包含体层调用通信逻辑等
*
**/
service Hello{

    string helloString(1:string param);
    i32 helloInt(1:i32 param);
    bool helloBollean(1:bool param);
    void helloVoid();
    string helloNull();
}
