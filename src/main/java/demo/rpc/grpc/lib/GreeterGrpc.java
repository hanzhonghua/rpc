package demo.rpc.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.*;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.*;

/**
 * <pre>
 * 定义grpc服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: helloworld.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "demo.rpc.grpc.Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Helloworld.HelloRequest,
      Helloworld.HelloBody> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHello",
      requestType = Helloworld.HelloRequest.class,
      responseType = Helloworld.HelloBody.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Helloworld.HelloRequest,
      Helloworld.HelloBody> getSayHelloMethod() {
    io.grpc.MethodDescriptor<Helloworld.HelloRequest, Helloworld.HelloBody> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<Helloworld.HelloRequest, Helloworld.HelloBody>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "demo.rpc.grpc.Greeter", "sayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Helloworld.HelloBody.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("sayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Helloworld.HelloRequest,
      Helloworld.HelloBody> getSayHelloServereMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHelloServere",
      requestType = Helloworld.HelloRequest.class,
      responseType = Helloworld.HelloBody.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Helloworld.HelloRequest,
      Helloworld.HelloBody> getSayHelloServereMethod() {
    io.grpc.MethodDescriptor<Helloworld.HelloRequest, Helloworld.HelloBody> getSayHelloServereMethod;
    if ((getSayHelloServereMethod = GreeterGrpc.getSayHelloServereMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloServereMethod = GreeterGrpc.getSayHelloServereMethod) == null) {
          GreeterGrpc.getSayHelloServereMethod = getSayHelloServereMethod =
              io.grpc.MethodDescriptor.<Helloworld.HelloRequest, Helloworld.HelloBody>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "demo.rpc.grpc.Greeter", "sayHelloServere"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Helloworld.HelloBody.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("sayHelloServere"))
                  .build();
          }
        }
     }
     return getSayHelloServereMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Helloworld.HelloRequest,
      Helloworld.HelloBody> getSayHelloClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHelloClient",
      requestType = Helloworld.HelloRequest.class,
      responseType = Helloworld.HelloBody.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<Helloworld.HelloRequest,
      Helloworld.HelloBody> getSayHelloClientMethod() {
    io.grpc.MethodDescriptor<Helloworld.HelloRequest, Helloworld.HelloBody> getSayHelloClientMethod;
    if ((getSayHelloClientMethod = GreeterGrpc.getSayHelloClientMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloClientMethod = GreeterGrpc.getSayHelloClientMethod) == null) {
          GreeterGrpc.getSayHelloClientMethod = getSayHelloClientMethod =
              io.grpc.MethodDescriptor.<Helloworld.HelloRequest, Helloworld.HelloBody>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "demo.rpc.grpc.Greeter", "sayHelloClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Helloworld.HelloBody.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("sayHelloClient"))
                  .build();
          }
        }
     }
     return getSayHelloClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Helloworld.HelloRequest,
      Helloworld.HelloBody> getSayHelloChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHelloChat",
      requestType = Helloworld.HelloRequest.class,
      responseType = Helloworld.HelloBody.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<Helloworld.HelloRequest,
      Helloworld.HelloBody> getSayHelloChatMethod() {
    io.grpc.MethodDescriptor<Helloworld.HelloRequest, Helloworld.HelloBody> getSayHelloChatMethod;
    if ((getSayHelloChatMethod = GreeterGrpc.getSayHelloChatMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloChatMethod = GreeterGrpc.getSayHelloChatMethod) == null) {
          GreeterGrpc.getSayHelloChatMethod = getSayHelloChatMethod =
              io.grpc.MethodDescriptor.<Helloworld.HelloRequest, Helloworld.HelloBody>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "demo.rpc.grpc.Greeter", "sayHelloChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Helloworld.HelloBody.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("sayHelloChat"))
                  .build();
          }
        }
     }
     return getSayHelloChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   * 定义grpc服务
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 定义单向的rpc
     * </pre>
     */
    public void sayHello(Helloworld.HelloRequest request,
                         io.grpc.stub.StreamObserver<Helloworld.HelloBody> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * 定义服务端流式rpc
     * </pre>
     */
    public void sayHelloServere(Helloworld.HelloRequest request,
                                io.grpc.stub.StreamObserver<Helloworld.HelloBody> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloServereMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Helloworld.HelloRequest> sayHelloClient(
        io.grpc.stub.StreamObserver<Helloworld.HelloBody> responseObserver) {
      return asyncUnimplementedStreamingCall(getSayHelloClientMethod(), responseObserver);
    }

    /**
     * <pre>
     * 双向流式rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<Helloworld.HelloRequest> sayHelloChat(
        io.grpc.stub.StreamObserver<Helloworld.HelloBody> responseObserver) {
      return asyncUnimplementedStreamingCall(getSayHelloChatMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Helloworld.HelloRequest,
                Helloworld.HelloBody>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayHelloServereMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                Helloworld.HelloRequest,
                Helloworld.HelloBody>(
                  this, METHODID_SAY_HELLO_SERVERE)))
          .addMethod(
            getSayHelloClientMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                Helloworld.HelloRequest,
                Helloworld.HelloBody>(
                  this, METHODID_SAY_HELLO_CLIENT)))
          .addMethod(
            getSayHelloChatMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                Helloworld.HelloRequest,
                Helloworld.HelloBody>(
                  this, METHODID_SAY_HELLO_CHAT)))
          .build();
    }
  }

  /**
   * <pre>
   * 定义grpc服务
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub> {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * 定义单向的rpc
     * </pre>
     */
    public void sayHello(Helloworld.HelloRequest request,
                         io.grpc.stub.StreamObserver<Helloworld.HelloBody> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 定义服务端流式rpc
     * </pre>
     */
    public void sayHelloServere(Helloworld.HelloRequest request,
                                io.grpc.stub.StreamObserver<Helloworld.HelloBody> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSayHelloServereMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Helloworld.HelloRequest> sayHelloClient(
        io.grpc.stub.StreamObserver<Helloworld.HelloBody> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSayHelloClientMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 双向流式rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<Helloworld.HelloRequest> sayHelloChat(
        io.grpc.stub.StreamObserver<Helloworld.HelloBody> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSayHelloChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * 定义grpc服务
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub> {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 定义单向的rpc
     * </pre>
     */
    public Helloworld.HelloBody sayHello(Helloworld.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 定义服务端流式rpc
     * </pre>
     */
    public java.util.Iterator<Helloworld.HelloBody> sayHelloServere(
        Helloworld.HelloRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSayHelloServereMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 定义grpc服务
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub> {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 定义单向的rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Helloworld.HelloBody> sayHello(
        Helloworld.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLO_SERVERE = 1;
  private static final int METHODID_SAY_HELLO_CLIENT = 2;
  private static final int METHODID_SAY_HELLO_CHAT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((Helloworld.HelloRequest) request,
              (io.grpc.stub.StreamObserver<Helloworld.HelloBody>) responseObserver);
          break;
        case METHODID_SAY_HELLO_SERVERE:
          serviceImpl.sayHelloServere((Helloworld.HelloRequest) request,
              (io.grpc.stub.StreamObserver<Helloworld.HelloBody>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO_CLIENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHelloClient(
              (io.grpc.stub.StreamObserver<Helloworld.HelloBody>) responseObserver);
        case METHODID_SAY_HELLO_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHelloChat(
              (io.grpc.stub.StreamObserver<Helloworld.HelloBody>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Helloworld.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayHelloServereMethod())
              .addMethod(getSayHelloClientMethod())
              .addMethod(getSayHelloChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
