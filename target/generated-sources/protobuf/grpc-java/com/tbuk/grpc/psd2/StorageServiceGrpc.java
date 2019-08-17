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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: storage.proto")
public final class StorageServiceGrpc {

  private StorageServiceGrpc() {}

  public static final String SERVICE_NAME = "com.tbuk.grpc.psd2.StorageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Storage.Entry,
      com.tbuk.grpc.psd2.Storage.EntryUpdated> getPutEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "putEntry",
      requestType = com.tbuk.grpc.psd2.Storage.Entry.class,
      responseType = com.tbuk.grpc.psd2.Storage.EntryUpdated.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Storage.Entry,
      com.tbuk.grpc.psd2.Storage.EntryUpdated> getPutEntryMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Storage.Entry, com.tbuk.grpc.psd2.Storage.EntryUpdated> getPutEntryMethod;
    if ((getPutEntryMethod = StorageServiceGrpc.getPutEntryMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getPutEntryMethod = StorageServiceGrpc.getPutEntryMethod) == null) {
          StorageServiceGrpc.getPutEntryMethod = getPutEntryMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2.Storage.Entry, com.tbuk.grpc.psd2.Storage.EntryUpdated>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2.StorageService", "putEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2.Storage.Entry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2.Storage.EntryUpdated.getDefaultInstance()))
                  .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("putEntry"))
                  .build();
          }
        }
     }
     return getPutEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Storage.GetEntryRequest,
      com.tbuk.grpc.psd2.Storage.EntryResponse> getGetEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEntry",
      requestType = com.tbuk.grpc.psd2.Storage.GetEntryRequest.class,
      responseType = com.tbuk.grpc.psd2.Storage.EntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Storage.GetEntryRequest,
      com.tbuk.grpc.psd2.Storage.EntryResponse> getGetEntryMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Storage.GetEntryRequest, com.tbuk.grpc.psd2.Storage.EntryResponse> getGetEntryMethod;
    if ((getGetEntryMethod = StorageServiceGrpc.getGetEntryMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getGetEntryMethod = StorageServiceGrpc.getGetEntryMethod) == null) {
          StorageServiceGrpc.getGetEntryMethod = getGetEntryMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2.Storage.GetEntryRequest, com.tbuk.grpc.psd2.Storage.EntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2.StorageService", "getEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2.Storage.GetEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2.Storage.EntryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("getEntry"))
                  .build();
          }
        }
     }
     return getGetEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Storage.DeleteEntryRequest,
      com.google.protobuf.Empty> getDeleteEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteEntry",
      requestType = com.tbuk.grpc.psd2.Storage.DeleteEntryRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Storage.DeleteEntryRequest,
      com.google.protobuf.Empty> getDeleteEntryMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Storage.DeleteEntryRequest, com.google.protobuf.Empty> getDeleteEntryMethod;
    if ((getDeleteEntryMethod = StorageServiceGrpc.getDeleteEntryMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getDeleteEntryMethod = StorageServiceGrpc.getDeleteEntryMethod) == null) {
          StorageServiceGrpc.getDeleteEntryMethod = getDeleteEntryMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2.Storage.DeleteEntryRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2.StorageService", "deleteEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2.Storage.DeleteEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("deleteEntry"))
                  .build();
          }
        }
     }
     return getDeleteEntryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageServiceStub newStub(io.grpc.Channel channel) {
    return new StorageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StorageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StorageServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StorageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void putEntry(com.tbuk.grpc.psd2.Storage.Entry request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Storage.EntryUpdated> responseObserver) {
      asyncUnimplementedUnaryCall(getPutEntryMethod(), responseObserver);
    }

    /**
     */
    public void getEntry(com.tbuk.grpc.psd2.Storage.GetEntryRequest request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Storage.EntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEntryMethod(), responseObserver);
    }

    /**
     */
    public void deleteEntry(com.tbuk.grpc.psd2.Storage.DeleteEntryRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteEntryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2.Storage.Entry,
                com.tbuk.grpc.psd2.Storage.EntryUpdated>(
                  this, METHODID_PUT_ENTRY)))
          .addMethod(
            getGetEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2.Storage.GetEntryRequest,
                com.tbuk.grpc.psd2.Storage.EntryResponse>(
                  this, METHODID_GET_ENTRY)))
          .addMethod(
            getDeleteEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2.Storage.DeleteEntryRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ENTRY)))
          .build();
    }
  }

  /**
   */
  public static final class StorageServiceStub extends io.grpc.stub.AbstractStub<StorageServiceStub> {
    private StorageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageServiceStub(channel, callOptions);
    }

    /**
     */
    public void putEntry(com.tbuk.grpc.psd2.Storage.Entry request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Storage.EntryUpdated> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEntry(com.tbuk.grpc.psd2.Storage.GetEntryRequest request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Storage.EntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEntry(com.tbuk.grpc.psd2.Storage.DeleteEntryRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteEntryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StorageServiceBlockingStub extends io.grpc.stub.AbstractStub<StorageServiceBlockingStub> {
    private StorageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tbuk.grpc.psd2.Storage.EntryUpdated putEntry(com.tbuk.grpc.psd2.Storage.Entry request) {
      return blockingUnaryCall(
          getChannel(), getPutEntryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tbuk.grpc.psd2.Storage.EntryResponse getEntry(com.tbuk.grpc.psd2.Storage.GetEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEntryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteEntry(com.tbuk.grpc.psd2.Storage.DeleteEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteEntryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StorageServiceFutureStub extends io.grpc.stub.AbstractStub<StorageServiceFutureStub> {
    private StorageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tbuk.grpc.psd2.Storage.EntryUpdated> putEntry(
        com.tbuk.grpc.psd2.Storage.Entry request) {
      return futureUnaryCall(
          getChannel().newCall(getPutEntryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tbuk.grpc.psd2.Storage.EntryResponse> getEntry(
        com.tbuk.grpc.psd2.Storage.GetEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEntryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEntry(
        com.tbuk.grpc.psd2.Storage.DeleteEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteEntryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT_ENTRY = 0;
  private static final int METHODID_GET_ENTRY = 1;
  private static final int METHODID_DELETE_ENTRY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StorageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StorageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT_ENTRY:
          serviceImpl.putEntry((com.tbuk.grpc.psd2.Storage.Entry) request,
              (io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Storage.EntryUpdated>) responseObserver);
          break;
        case METHODID_GET_ENTRY:
          serviceImpl.getEntry((com.tbuk.grpc.psd2.Storage.GetEntryRequest) request,
              (io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Storage.EntryResponse>) responseObserver);
          break;
        case METHODID_DELETE_ENTRY:
          serviceImpl.deleteEntry((com.tbuk.grpc.psd2.Storage.DeleteEntryRequest) request,
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

  private static abstract class StorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tbuk.grpc.psd2.Storage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StorageService");
    }
  }

  private static final class StorageServiceFileDescriptorSupplier
      extends StorageServiceBaseDescriptorSupplier {
    StorageServiceFileDescriptorSupplier() {}
  }

  private static final class StorageServiceMethodDescriptorSupplier
      extends StorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StorageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StorageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorageServiceFileDescriptorSupplier())
              .addMethod(getPutEntryMethod())
              .addMethod(getGetEntryMethod())
              .addMethod(getDeleteEntryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
