package tbuk.psd2.grpc.rest;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import tbuk.psd2.grpc.bl.LinkingServ;


@GRpcService
public class LinkingService extends com.tbuk.grpc.psd2.AccountLinkingServiceGrpc.AccountLinkingServiceImplBase {

    @Autowired
    LinkingServ service;

    @Override
    public void getBankAuthorization(com.tbuk.grpc.psd2.Linking.GetBankAuthorizationRequest request,
                                     io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Linking.BankAuthorization> responseObserver) {

        com.tbuk.grpc.psd2.Linking.BankAuthorization resp=service.authorisationResponse(request.getAccessToken());
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}
