package tbuk.psd2.grpc.rest;

import org.lognet.springboot.grpc.GRpcService;


@GRpcService
public class LinkingService extends com.tbuk.grpc.psd2.AccountLinkingServiceGrpc.AccountLinkingServiceImplBase {

    @Override
    public void getBankAuthorization(com.tbuk.grpc.psd2.Linking.GetBankAuthorizationRequest request,
                                     io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse> responseObserver) {

        com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse resp=
                com.tbuk.grpc.psd2.Linking.GetBankAuthorizationResponse.newBuilder().build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}
