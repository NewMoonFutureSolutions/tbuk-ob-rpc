package com.tbuk.grpc.psd2Account;

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
    comments = "Source: account.proto")
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final String SERVICE_NAME = "com.tbuk.grpc.psd2Account.AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.LinkedBankAccount,
      com.tbuk.grpc.psd2Account.Account.CreateAccountResponse> getAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "accounts",
      requestType = com.tbuk.grpc.psd2Account.Account.LinkedBankAccount.class,
      responseType = com.tbuk.grpc.psd2Account.Account.CreateAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.LinkedBankAccount,
      com.tbuk.grpc.psd2Account.Account.CreateAccountResponse> getAccountsMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.LinkedBankAccount, com.tbuk.grpc.psd2Account.Account.CreateAccountResponse> getAccountsMethod;
    if ((getAccountsMethod = AccountServiceGrpc.getAccountsMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getAccountsMethod = AccountServiceGrpc.getAccountsMethod) == null) {
          AccountServiceGrpc.getAccountsMethod = getAccountsMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2Account.Account.LinkedBankAccount, com.tbuk.grpc.psd2Account.Account.CreateAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2Account.AccountService", "accounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2Account.Account.LinkedBankAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2Account.Account.CreateAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("accounts"))
                  .build();
          }
        }
     }
     return getAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.BalanceRequest,
      com.tbuk.grpc.psd2Account.Account.BalanceResponse> getBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "balance",
      requestType = com.tbuk.grpc.psd2Account.Account.BalanceRequest.class,
      responseType = com.tbuk.grpc.psd2Account.Account.BalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.BalanceRequest,
      com.tbuk.grpc.psd2Account.Account.BalanceResponse> getBalanceMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.BalanceRequest, com.tbuk.grpc.psd2Account.Account.BalanceResponse> getBalanceMethod;
    if ((getBalanceMethod = AccountServiceGrpc.getBalanceMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getBalanceMethod = AccountServiceGrpc.getBalanceMethod) == null) {
          AccountServiceGrpc.getBalanceMethod = getBalanceMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2Account.Account.BalanceRequest, com.tbuk.grpc.psd2Account.Account.BalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2Account.AccountService", "balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2Account.Account.BalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2Account.Account.BalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("balance"))
                  .build();
          }
        }
     }
     return getBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.TransactionsRequest,
      com.tbuk.grpc.psd2Account.Account.TransactionsPage> getGetTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactions",
      requestType = com.tbuk.grpc.psd2Account.Account.TransactionsRequest.class,
      responseType = com.tbuk.grpc.psd2Account.Account.TransactionsPage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.TransactionsRequest,
      com.tbuk.grpc.psd2Account.Account.TransactionsPage> getGetTransactionsMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.TransactionsRequest, com.tbuk.grpc.psd2Account.Account.TransactionsPage> getGetTransactionsMethod;
    if ((getGetTransactionsMethod = AccountServiceGrpc.getGetTransactionsMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetTransactionsMethod = AccountServiceGrpc.getGetTransactionsMethod) == null) {
          AccountServiceGrpc.getGetTransactionsMethod = getGetTransactionsMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2Account.Account.TransactionsRequest, com.tbuk.grpc.psd2Account.Account.TransactionsPage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2Account.AccountService", "GetTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2Account.Account.TransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2Account.Account.TransactionsPage.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetTransactions"))
                  .build();
          }
        }
     }
     return getGetTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.TransactionRequest,
      com.tbuk.grpc.psd2Account.Account.Transaction> getGetTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransaction",
      requestType = com.tbuk.grpc.psd2Account.Account.TransactionRequest.class,
      responseType = com.tbuk.grpc.psd2Account.Account.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.TransactionRequest,
      com.tbuk.grpc.psd2Account.Account.Transaction> getGetTransactionMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.TransactionRequest, com.tbuk.grpc.psd2Account.Account.Transaction> getGetTransactionMethod;
    if ((getGetTransactionMethod = AccountServiceGrpc.getGetTransactionMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetTransactionMethod = AccountServiceGrpc.getGetTransactionMethod) == null) {
          AccountServiceGrpc.getGetTransactionMethod = getGetTransactionMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2Account.Account.TransactionRequest, com.tbuk.grpc.psd2Account.Account.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2Account.AccountService", "GetTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2Account.Account.TransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2Account.Account.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetTransaction"))
                  .build();
          }
        }
     }
     return getGetTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.DestinationRequest,
      com.tbuk.grpc.psd2Account.Account.TransferDestinations> getDestinationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "destinations",
      requestType = com.tbuk.grpc.psd2Account.Account.DestinationRequest.class,
      responseType = com.tbuk.grpc.psd2Account.Account.TransferDestinations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.DestinationRequest,
      com.tbuk.grpc.psd2Account.Account.TransferDestinations> getDestinationsMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.DestinationRequest, com.tbuk.grpc.psd2Account.Account.TransferDestinations> getDestinationsMethod;
    if ((getDestinationsMethod = AccountServiceGrpc.getDestinationsMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getDestinationsMethod = AccountServiceGrpc.getDestinationsMethod) == null) {
          AccountServiceGrpc.getDestinationsMethod = getDestinationsMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2Account.Account.DestinationRequest, com.tbuk.grpc.psd2Account.Account.TransferDestinations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2Account.AccountService", "destinations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2Account.Account.DestinationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2Account.Account.TransferDestinations.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("destinations"))
                  .build();
          }
        }
     }
     return getDestinationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.AccountDetailsRequest,
      com.tbuk.grpc.psd2Account.Account.AccountDetails> getGetAccountDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountDetails",
      requestType = com.tbuk.grpc.psd2Account.Account.AccountDetailsRequest.class,
      responseType = com.tbuk.grpc.psd2Account.Account.AccountDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.AccountDetailsRequest,
      com.tbuk.grpc.psd2Account.Account.AccountDetails> getGetAccountDetailsMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.AccountDetailsRequest, com.tbuk.grpc.psd2Account.Account.AccountDetails> getGetAccountDetailsMethod;
    if ((getGetAccountDetailsMethod = AccountServiceGrpc.getGetAccountDetailsMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetAccountDetailsMethod = AccountServiceGrpc.getGetAccountDetailsMethod) == null) {
          AccountServiceGrpc.getGetAccountDetailsMethod = getGetAccountDetailsMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2Account.Account.AccountDetailsRequest, com.tbuk.grpc.psd2Account.Account.AccountDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2Account.AccountService", "GetAccountDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2Account.Account.AccountDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2Account.Account.AccountDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetAccountDetails"))
                  .build();
          }
        }
     }
     return getGetAccountDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.UnlinkRequest,
      com.google.protobuf.Empty> getUnlinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unlink",
      requestType = com.tbuk.grpc.psd2Account.Account.UnlinkRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.UnlinkRequest,
      com.google.protobuf.Empty> getUnlinkMethod() {
    io.grpc.MethodDescriptor<com.tbuk.grpc.psd2Account.Account.UnlinkRequest, com.google.protobuf.Empty> getUnlinkMethod;
    if ((getUnlinkMethod = AccountServiceGrpc.getUnlinkMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getUnlinkMethod = AccountServiceGrpc.getUnlinkMethod) == null) {
          AccountServiceGrpc.getUnlinkMethod = getUnlinkMethod = 
              io.grpc.MethodDescriptor.<com.tbuk.grpc.psd2Account.Account.UnlinkRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.tbuk.grpc.psd2Account.AccountService", "unlink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tbuk.grpc.psd2Account.Account.UnlinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("unlink"))
                  .build();
          }
        }
     }
     return getUnlinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountServiceStub newStub(io.grpc.Channel channel) {
    return new AccountServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccountServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccountServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AccountServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 1
     * </pre>
     */
    public void accounts(com.tbuk.grpc.psd2Account.Account.LinkedBankAccount request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.CreateAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 2 (Token ready)
     * </pre>
     */
    public void balance(com.tbuk.grpc.psd2Account.Account.BalanceRequest request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.BalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * 3 (Token ready)
     * </pre>
     */
    public void getTransactions(com.tbuk.grpc.psd2Account.Account.TransactionsRequest request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.TransactionsPage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 4 (Token ready)
     * </pre>
     */
    public void getTransaction(com.tbuk.grpc.psd2Account.Account.TransactionRequest request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 5 (Token ready)
     * </pre>
     */
    public void destinations(com.tbuk.grpc.psd2Account.Account.DestinationRequest request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.TransferDestinations> responseObserver) {
      asyncUnimplementedUnaryCall(getDestinationsMethod(), responseObserver);
    }

    /**
     */
    public void getAccountDetails(com.tbuk.grpc.psd2Account.Account.AccountDetailsRequest request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.AccountDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 7 (Token ready)
     * </pre>
     */
    public void unlink(com.tbuk.grpc.psd2Account.Account.UnlinkRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlinkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2Account.Account.LinkedBankAccount,
                com.tbuk.grpc.psd2Account.Account.CreateAccountResponse>(
                  this, METHODID_ACCOUNTS)))
          .addMethod(
            getBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2Account.Account.BalanceRequest,
                com.tbuk.grpc.psd2Account.Account.BalanceResponse>(
                  this, METHODID_BALANCE)))
          .addMethod(
            getGetTransactionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2Account.Account.TransactionsRequest,
                com.tbuk.grpc.psd2Account.Account.TransactionsPage>(
                  this, METHODID_GET_TRANSACTIONS)))
          .addMethod(
            getGetTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2Account.Account.TransactionRequest,
                com.tbuk.grpc.psd2Account.Account.Transaction>(
                  this, METHODID_GET_TRANSACTION)))
          .addMethod(
            getDestinationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2Account.Account.DestinationRequest,
                com.tbuk.grpc.psd2Account.Account.TransferDestinations>(
                  this, METHODID_DESTINATIONS)))
          .addMethod(
            getGetAccountDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2Account.Account.AccountDetailsRequest,
                com.tbuk.grpc.psd2Account.Account.AccountDetails>(
                  this, METHODID_GET_ACCOUNT_DETAILS)))
          .addMethod(
            getUnlinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tbuk.grpc.psd2Account.Account.UnlinkRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UNLINK)))
          .build();
    }
  }

  /**
   */
  public static final class AccountServiceStub extends io.grpc.stub.AbstractStub<AccountServiceStub> {
    private AccountServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 1
     * </pre>
     */
    public void accounts(com.tbuk.grpc.psd2Account.Account.LinkedBankAccount request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.CreateAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 2 (Token ready)
     * </pre>
     */
    public void balance(com.tbuk.grpc.psd2Account.Account.BalanceRequest request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.BalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 3 (Token ready)
     * </pre>
     */
    public void getTransactions(com.tbuk.grpc.psd2Account.Account.TransactionsRequest request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.TransactionsPage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 4 (Token ready)
     * </pre>
     */
    public void getTransaction(com.tbuk.grpc.psd2Account.Account.TransactionRequest request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 5 (Token ready)
     * </pre>
     */
    public void destinations(com.tbuk.grpc.psd2Account.Account.DestinationRequest request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.TransferDestinations> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDestinationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountDetails(com.tbuk.grpc.psd2Account.Account.AccountDetailsRequest request,
        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.AccountDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 7 (Token ready)
     * </pre>
     */
    public void unlink(com.tbuk.grpc.psd2Account.Account.UnlinkRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountServiceBlockingStub extends io.grpc.stub.AbstractStub<AccountServiceBlockingStub> {
    private AccountServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 1
     * </pre>
     */
    public com.tbuk.grpc.psd2Account.Account.CreateAccountResponse accounts(com.tbuk.grpc.psd2Account.Account.LinkedBankAccount request) {
      return blockingUnaryCall(
          getChannel(), getAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 2 (Token ready)
     * </pre>
     */
    public com.tbuk.grpc.psd2Account.Account.BalanceResponse balance(com.tbuk.grpc.psd2Account.Account.BalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 3 (Token ready)
     * </pre>
     */
    public com.tbuk.grpc.psd2Account.Account.TransactionsPage getTransactions(com.tbuk.grpc.psd2Account.Account.TransactionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 4 (Token ready)
     * </pre>
     */
    public com.tbuk.grpc.psd2Account.Account.Transaction getTransaction(com.tbuk.grpc.psd2Account.Account.TransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 5 (Token ready)
     * </pre>
     */
    public com.tbuk.grpc.psd2Account.Account.TransferDestinations destinations(com.tbuk.grpc.psd2Account.Account.DestinationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDestinationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tbuk.grpc.psd2Account.Account.AccountDetails getAccountDetails(com.tbuk.grpc.psd2Account.Account.AccountDetailsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 7 (Token ready)
     * </pre>
     */
    public com.google.protobuf.Empty unlink(com.tbuk.grpc.psd2Account.Account.UnlinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnlinkMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountServiceFutureStub extends io.grpc.stub.AbstractStub<AccountServiceFutureStub> {
    private AccountServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 1
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tbuk.grpc.psd2Account.Account.CreateAccountResponse> accounts(
        com.tbuk.grpc.psd2Account.Account.LinkedBankAccount request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 2 (Token ready)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tbuk.grpc.psd2Account.Account.BalanceResponse> balance(
        com.tbuk.grpc.psd2Account.Account.BalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 3 (Token ready)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tbuk.grpc.psd2Account.Account.TransactionsPage> getTransactions(
        com.tbuk.grpc.psd2Account.Account.TransactionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 4 (Token ready)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tbuk.grpc.psd2Account.Account.Transaction> getTransaction(
        com.tbuk.grpc.psd2Account.Account.TransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 5 (Token ready)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tbuk.grpc.psd2Account.Account.TransferDestinations> destinations(
        com.tbuk.grpc.psd2Account.Account.DestinationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDestinationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tbuk.grpc.psd2Account.Account.AccountDetails> getAccountDetails(
        com.tbuk.grpc.psd2Account.Account.AccountDetailsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 7 (Token ready)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> unlink(
        com.tbuk.grpc.psd2Account.Account.UnlinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACCOUNTS = 0;
  private static final int METHODID_BALANCE = 1;
  private static final int METHODID_GET_TRANSACTIONS = 2;
  private static final int METHODID_GET_TRANSACTION = 3;
  private static final int METHODID_DESTINATIONS = 4;
  private static final int METHODID_GET_ACCOUNT_DETAILS = 5;
  private static final int METHODID_UNLINK = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACCOUNTS:
          serviceImpl.accounts((com.tbuk.grpc.psd2Account.Account.LinkedBankAccount) request,
              (io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.CreateAccountResponse>) responseObserver);
          break;
        case METHODID_BALANCE:
          serviceImpl.balance((com.tbuk.grpc.psd2Account.Account.BalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.BalanceResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTIONS:
          serviceImpl.getTransactions((com.tbuk.grpc.psd2Account.Account.TransactionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.TransactionsPage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION:
          serviceImpl.getTransaction((com.tbuk.grpc.psd2Account.Account.TransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.Transaction>) responseObserver);
          break;
        case METHODID_DESTINATIONS:
          serviceImpl.destinations((com.tbuk.grpc.psd2Account.Account.DestinationRequest) request,
              (io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.TransferDestinations>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_DETAILS:
          serviceImpl.getAccountDetails((com.tbuk.grpc.psd2Account.Account.AccountDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.AccountDetails>) responseObserver);
          break;
        case METHODID_UNLINK:
          serviceImpl.unlink((com.tbuk.grpc.psd2Account.Account.UnlinkRequest) request,
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

  private static abstract class AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tbuk.grpc.psd2Account.Account.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountService");
    }
  }

  private static final class AccountServiceFileDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier {
    AccountServiceFileDescriptorSupplier() {}
  }

  private static final class AccountServiceMethodDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountServiceFileDescriptorSupplier())
              .addMethod(getAccountsMethod())
              .addMethod(getBalanceMethod())
              .addMethod(getGetTransactionsMethod())
              .addMethod(getGetTransactionMethod())
              .addMethod(getDestinationsMethod())
              .addMethod(getGetAccountDetailsMethod())
              .addMethod(getUnlinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
