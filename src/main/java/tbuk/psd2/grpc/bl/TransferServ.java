package tbuk.psd2.grpc.bl;

import com.tbuk.grpc.psd2Account.Account;
import com.tbuk.grpc.psd2Transfer.Transfer.*;
import org.springframework.stereotype.Service;
import tbuk.psd2.grpc.util.CONSTANTS;
import tbuk.psd2.grpc.util.Utils;


@Service
public class TransferServ {

    public TransferResponse transfer(TransferRequest request){

     if(!CONSTANTS.TnxTransferMap.containsKey(request.getTransferId())){
        // add this txn into hash table temp ( daha sonra sorarlarsa diye hashtable a kaydedelim)
        CONSTANTS.transactionId++;
        String txnId=String.valueOf(CONSTANTS.transactionId);
        Account.Transaction tr=Account.Transaction.newBuilder().setId(String.valueOf(CONSTANTS.transactionId))
                .setAmount(Account.Money.newBuilder().setValue(request.getTransactionAmount().getValue()).setCurrency(request.getTransactionAmount().getCurrency()).build())
                .setCreatedAt(Utils.getDateNowInFormat1())
                .setDescription(request.getDescription())
                .setStatus(Account.TransactionStatus.SUCCESS)
                .setType(Account.TransactionType.DEBIT)
                .setTokenId("1")// boyle bir bilgi gondermiyorlar
                .setTokenTransferId(request.getTransferId()).build();

         CONSTANTS.COSTUMER1TRANSACTIONS.put(txnId, tr);
         CONSTANTS.TnxTransferMap.put(request.getTransferId(), txnId); // they ask for transferId in transfer service, txnid in account
         return TransferResponse.newBuilder().setTransactionId(txnId)
                 .setStatus(StatusCode.PROCESSING)
                 .setStatusDescription("Received by TBUK").build();

     }
     else {
         return TransferResponse.newBuilder()
                 .setStatusDescription("TransferId already exist.")
                 .setStatus(StatusCode.FAILURE_GENERIC)
                 .build();
        }

    }

    // su anki hali eger transfer servisten gonderilmisse PROCESSING diye yaziyor.
    public TransferStatusResponse getTransferStatus(String transferId){
        if(CONSTANTS.TnxTransferMap.containsKey(transferId)) {
            String txnId=CONSTANTS.TnxTransferMap.get(transferId);
            return TransferStatusResponse.newBuilder().setTransactionStatus("PROCESSING").build();
        }
        else{return TransferStatusResponse.newBuilder().setTransactionStatus("The specified transfer was not found.").build();}
    }
}
