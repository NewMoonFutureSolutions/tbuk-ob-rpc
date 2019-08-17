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
    comments = "Source: linking.proto")
public final class AccountLinkingServiceGrpc {

  private AccountLinkingServiceGrpc() {}

  public static final String SERVICE_NAME = "com.tbuk.grpc.psd2.AccountLinkingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Linking.GetBankAuthorizationRequest,
      com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse> getGetBankAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBankAuthorization",
      requestType = com.tbuk.grpc.psd2.Linking.GetBankAuthorizationRequest.class,
      responseType = com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Linking.GetBankAuthorizationRequest,
      com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse> getGetBankAuthorizationMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2.Linking.GetBankAuthorizationRequest, com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse> getGetBankAuthorizationMethod;
    if ((getGetBankAuthorizationMethod = AccountLinkingServiceGrpc.getGetBankAuthorizationMethod) == null) {
      synchronized (AccountLinkingServiceGrpc.class) {
        if ((getGetBankAuthorizationMethod = AccountLinkingServiceGrpc.getGetBankAuthorizationMethod) == null) {
          AccountLinkingServiceGrpc.getGetBankAuthorizationMethod = getGetBankAuthorizationMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2.Linking.GetBankAuthorizationRequest, com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2.AccountLinkingService", "GetBankAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2.Linking.GetBankAuthorizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountLinkingServiceMethodDescriptorSupplier("GetBankAuthorization"))
                  .build();
          }
        }
     }
     return getGetBankAuthorizationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountLinkingServiceStub newStub(io.grpc.Channel channel) {
    return new AccountLinkingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountLinkingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccountLinkingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountLinkingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccountLinkingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AccountLinkingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBankAuthorization(com.tbuk.grpc.psd2.Linking.GetBankAuthorizationRequest request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBankAuthorizationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBankAuthorizationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2.Linking.GetBankAuthorizationRequest,
                com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse>(
                  this, METHODID_GET_BANK_AUTHORIZATION)))
          .build();
    }
  }

  /**
   */
  public static final class AccountLinkingServiceStub extends io.grpc.stub.AbstractStub<AccountLinkingServiceStub> {
    private AccountLinkingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountLinkingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountLinkingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountLinkingServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBankAuthorization(com.tbuk.grpc.psd2.Linking.GetBankAuthorizationRequest request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBankAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountLinkingServiceBlockingStub extends io.grpc.stub.AbstractStub<AccountLinkingServiceBlockingStub> {
    private AccountLinkingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountLinkingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountLinkingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountLinkingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse getBankAuthorization(com.tbuk.grpc.psd2.Linking.GetBankAuthorizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBankAuthorizationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountLinkingServiceFutureStub extends io.grpc.stub.AbstractStub<AccountLinkingServiceFutureStub> {
    private AccountLinkingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountLinkingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountLinkingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountLinkingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse> getBankAuthorization(
        com.tbuk.grpc.psd2.Linking.GetBankAuthorizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBankAuthorizationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BANK_AUTHORIZATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountLinkingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountLinkingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BANK_AUTHORIZATION:
          serviceImpl.getBankAuthorization((com.tbuk.grpc.psd2.Linking.GetBankAuthorizationRequest) request,
              (io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse>) responseObserver);
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

  private static abstract class AccountLinkingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountLinkingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tbuk.grpc.psd2.Linking.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountLinkingService");
    }
  }

  private static final class AccountLinkingServiceFileDescriptorSupplier
      extends AccountLinkingServiceBaseDescriptorSupplier {
    AccountLinkingServiceFileDescriptorSupplier() {}
  }

  private static final class AccountLinkingServiceMethodDescriptorSupplier
      extends AccountLinkingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountLinkingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountLinkingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountLinkingServiceFileDescriptorSupplier())
              .addMethod(getGetBankAuthorizationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
