package tbuk.psd2.grpc.rest;

import com.tbuk.grpc.psd2Account.AccountServiceGrpc;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import tbuk.psd2.grpc.bl.AisService;


@GRpcService
public class AccountService extends AccountServiceGrpc.AccountServiceImplBase {

    private static final Logger LOGGER =LoggerFactory.getLogger(AccountService.class);
    @Autowired
    AisService service;

    @Override
    public void accounts(com.tbuk.grpc.psd2Account.Account.LinkedBankAccount request,
                         io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.CreateAccountResponse> responseObserver) {

        responseObserver.onNext(service.createAccountResponse(request));
        responseObserver.onCompleted();
    }

    @Override
    public void balance(com.tbuk.grpc.psd2Account.Account.BalanceRequest request,
                        io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.BalanceResponse> responseObserver) {

        responseObserver.onNext(service.balance());
        responseObserver.onCompleted();
    }

    @Override
    public void getTransactions(com.tbuk.grpc.psd2Account.Account.TransactionsRequest request,
                                io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.TransactionsPage> responseObserver) {

        responseObserver.onNext(service.transactions());
        responseObserver.onCompleted();
    }

    @Override
    public void getTransaction(com.tbuk.grpc.psd2Account.Account.TransactionRequest request,
                               io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.Transaction> responseObserver) {
        responseObserver.onNext(service.transactionDetail(request.getBankAccountId(),request.getTransactionId()));
        responseObserver.onCompleted();
    }

    @Override
    public void destinations(com.tbuk.grpc.psd2Account.Account.DestinationRequest request,
                             io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.TransferDestinations> responseObserver) {
        responseObserver.onNext(service.destinations());
        responseObserver.onCompleted();
    }

    @Override
    public void getAccountDetails(com.tbuk.grpc.psd2Account.Account.AccountDetailsRequest request,
                                  io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Account.Account.AccountDetails> responseObserver) {

        responseObserver.onNext(service.accountDetails(request.getBankAccountId()));
        responseObserver.onCompleted();
    }

    @Override
    public void unlink(com.tbuk.grpc.psd2Account.Account.UnlinkRequest request,
                       io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
        service.unlinkAccount(request.getBankAccountId());
        responseObserver.onCompleted();
    }
}
