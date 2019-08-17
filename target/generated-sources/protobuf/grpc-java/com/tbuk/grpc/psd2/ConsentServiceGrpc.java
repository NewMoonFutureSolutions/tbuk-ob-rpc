package com.tbuk.grpc.psd2;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Void meselesi haric tamam
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: consent.proto")
public final class ConsentServiceGrpc {

  private ConsentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.tbuk.grpc.psd2.ConsentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Consent.ConsentRequest,
      com.google.protobuf.Empty> getCreatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "created",
      requestType = com.tbuk.grpc.psd2.Consent.ConsentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Consent.ConsentRequest,
      com.google.protobuf.Empty> getCreatedMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Consent.ConsentRequest, com.google.protobuf.Empty> getCreatedMethod;
    if ((getCreatedMethod = ConsentServiceGrpc.getCreatedMethod) == null) {
      synchronized (ConsentServiceGrpc.class) {
        if ((getCreatedMethod = ConsentServiceGrpc.getCreatedMethod) == null) {
          ConsentServiceGrpc.getCreatedMethod = getCreatedMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2.Consent.ConsentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2.ConsentService", "created"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2.Consent.ConsentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ConsentServiceMethodDescriptorSupplier("created"))
                  .build();
          }
        }
     }
     return getCreatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Consent.ConsentRequest,
      com.google.protobuf.Empty> getRevokedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "revoked",
      requestType = com.tbuk.grpc.psd2.Consent.ConsentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Consent.ConsentRequest,
      com.google.protobuf.Empty> getRevokedMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Consent.ConsentRequest, com.google.protobuf.Empty> getRevokedMethod;
    if ((getRevokedMethod = ConsentServiceGrpc.getRevokedMethod) == null) {
      synchronized (ConsentServiceGrpc.class) {
        if ((getRevokedMethod = ConsentServiceGrpc.getRevokedMethod) == null) {
          ConsentServiceGrpc.getRevokedMethod = getRevokedMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2.Consent.ConsentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2.ConsentService", "revoked"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2.Consent.ConsentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ConsentServiceMethodDescriptorSupplier("revoked"))
                  .build();
          }
        }
     }
     return getRevokedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConsentServiceStub newStub(io.grpc.Channel channel) {
    return new ConsentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConsentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConsentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConsentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConsentServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Void meselesi haric tamam
   * </pre>
   */
  public static abstract class ConsentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void created(com.tbuk.grpc.psd2.Consent.ConsentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatedMethod(), responseObserver);
    }

    /**
     */
    public void revoked(com.tbuk.grpc.psd2.Consent.ConsentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRevokedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2.Consent.ConsentRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CREATED)))
          .addMethod(
            getRevokedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2.Consent.ConsentRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_REVOKED)))
          .build();
    }
  }

  /**
   * <pre>
   * Void meselesi haric tamam
   * </pre>
   */
  public static final class ConsentServiceStub extends io.grpc.stub.AbstractStub<ConsentServiceStub> {
    private ConsentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsentServiceStub(channel, callOptions);
    }

    /**
     */
    public void created(com.tbuk.grpc.psd2.Consent.ConsentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revoked(com.tbuk.grpc.psd2.Consent.ConsentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRevokedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Void meselesi haric tamam
   * </pre>
   */
  public static final class ConsentServiceBlockingStub extends io.grpc.stub.AbstractStub<ConsentServiceBlockingStub> {
    private ConsentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty created(com.tbuk.grpc.psd2.Consent.ConsentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty revoked(com.tbuk.grpc.psd2.Consent.ConsentRequest request) {
      return blockingUnaryCall(
          getChannel(), getRevokedMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Void meselesi haric tamam
   * </pre>
   */
  public static final class ConsentServiceFutureStub extends io.grpc.stub.AbstractStub<ConsentServiceFutureStub> {
    private ConsentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> created(
        com.tbuk.grpc.psd2.Consent.ConsentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> revoked(
        com.tbuk.grpc.psd2.Consent.ConsentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRevokedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATED = 0;
  private static final int METHODID_REVOKED = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConsentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConsentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATED:
          serviceImpl.created((com.tbuk.grpc.psd2.Consent.ConsentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REVOKED:
          serviceImpl.revoked((com.tbuk.grpc.psd2.Consent.ConsentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ConsentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConsentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tbuk.grpc.psd2.Consent.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConsentService");
    }
  }

  private static final class ConsentServiceFileDescriptorSupplier
      extends ConsentServiceBaseDescriptorSupplier {
    ConsentServiceFileDescriptorSupplier() {}
  }

  private static final class ConsentServiceMethodDescriptorSupplier
      extends ConsentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConsentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ConsentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConsentServiceFileDescriptorSupplier())
              .addMethod(getCreatedMethod())
              .addMethod(getRevokedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
