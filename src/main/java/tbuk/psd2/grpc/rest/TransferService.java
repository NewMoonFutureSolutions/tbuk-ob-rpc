package tbuk.psd2.grpc.rest;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import tbuk.psd2.grpc.bl.TransferServ;

@GRpcService
public class TransferService extends com.tbuk.grpc.psd2Transfer.TransferServiceGrpc.TransferServiceImplBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(TransferService.class);

    @Autowired
    TransferServ service;
    @Override
    public void transfer(com.tbuk.grpc.psd2Transfer.Transfer.TransferRequest request,
                         io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Transfer.Transfer.TransferResponse> responseObserver) {

        LOGGER.info("Transfer request received {}", request);
        com.tbuk.grpc.psd2Transfer.Transfer.TransferResponse response=service.transfer(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void transferStatus(com.tbuk.grpc.psd2Transfer.Transfer.PaymentStatusRequest request,
                               io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2Transfer.Transfer.TransferStatusResponse> responseObserver) {

        responseObserver.onCompleted();
    }

}
