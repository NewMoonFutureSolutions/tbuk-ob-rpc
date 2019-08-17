package tbuk.psd2.grpc.rest;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tbuk.psd2.grpc.bl.StorageServ;

@GRpcService
public class StorageService extends com.tbuk.grpc.psd2.StorageServiceGrpc.StorageServiceImplBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageService.class);

    @Autowired
    StorageServ service;

    @Override
    public void putEntry(com.tbuk.grpc.psd2.Storage.Entry request,
                         io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Storage.EntryUpdated> responseObserver) {

        com.tbuk.grpc.psd2.Storage.EntryUpdated entryUpdated=service.putEntry(request);
        responseObserver.onNext(entryUpdated);
        responseObserver.onCompleted();

    }

    @Override
    public void getEntry(com.tbuk.grpc.psd2.Storage.GetEntryRequest request,
                         io.grpc.stub.StreamObserver<com.tbuk.grpc.psd2.Storage.EntryResponse> responseObserver) {

        com.tbuk.grpc.psd2.Storage.EntryResponse resp=service.getEntry(request.getKey());
        responseObserver.onNext(resp);
        responseObserver.onCompleted();

    }

    @Override
    public void deleteEntry(com.tbuk.grpc.psd2.Storage.DeleteEntryRequest request,
                            io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
        service.deleteEntry(request.getKeyToDelete());
        responseObserver.onCompleted();
    }
}
