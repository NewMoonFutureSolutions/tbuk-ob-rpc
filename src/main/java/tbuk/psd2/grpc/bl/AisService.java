package tbuk.psd2.grpc.bl;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.tbuk.grpc.psd2Account.Account.*;
import tbuk.psd2.grpc.util.CONSTANTS;
import tbuk.psd2.grpc.util.Utils;

@Service
public class AisService {

    // 1 - account post for link info
    public CreateAccountResponse createAccountResponse(LinkedBankAccount linkedAccount){
        //String accountId=env.getProperty("");
        return CreateAccountResponse.newBuilder().setAccountId(CONSTANTS.INFOMAP.get("customer1.account1.tbukID")).build();
    }

    // 2 - balance enquiry
    public BalanceResponse balance(){

        return BalanceResponse.newBuilder().setCurrent(Money.newBuilder().setCurrency("GBP").setValue("200").build())
                .setAvailable(Money.newBuilder().setCurrency("GBP").setValue("200").build())
                .setUpdatedAt(Utils.getDateNowInFormat1())
                .build();
    }

    //3
    public TransactionsPage transactions(){
        TransactionsPage.Builder responseBuilder=TransactionsPage.newBuilder().setOffset("1");

        List<Transaction> list=new ArrayList<>();
        Iterator it = CONSTANTS.COSTUMER1TRANSACTIONS.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            responseBuilder.addTransactions((Transaction) pair.getValue());

        }
        return responseBuilder.build();

    }
    //4
    public Transaction transactionDetail(String bankAccountId,String txnId){

        if(CONSTANTS.COSTUMER1TRANSACTIONS.containsKey(txnId)) {return CONSTANTS.COSTUMER1TRANSACTIONS.get(txnId);}
        // if not meaningfull then
        return Transaction.newBuilder().setId("1").setTokenId("1")
                .setAmount(Money.newBuilder().setCurrency("GBP").setValue("800").build())
               .setCreatedAt(Utils.getDateNowInFormat1())
               .setDescription("Room rent")
                .setStatus(TransactionStatus.PROCESSING)
                .setType(TransactionType.DEBIT)
                .setTokenTransferId("1").build();
    }

    // 5 - destinations
    public TransferDestinations destinations(){
        List<TransferDestination> destinations=new ArrayList<>();

        String accountNo=CONSTANTS.INFOMAP.get("customer1.account1.accountNumber");
        String sortcode=CONSTANTS.INFOMAP.get("customer1.account1.sortcode");
        String bic=CONSTANTS.INFOMAP.get("customer1.account1.bic");
        String iban=CONSTANTS.INFOMAP.get("customer1.account1.iban");

        return TransferDestinations.newBuilder().addDestinations(
                TransferDestination.newBuilder().setFasterPayments(TransferDestination.FasterPayments.newBuilder().setAccountNumber(accountNo).setSortCode(sortcode).build()).build())
                .addDestinations(
                TransferDestination.newBuilder().setSwift(TransferDestination.Swift.newBuilder().setAccount(iban).setBic(bic).build()).build())
                .build();

    }
    // 6
    public AccountDetails accountDetails(String bankAccountId){


        return AccountDetails.newBuilder().setStatus("Active")
                                          .setAccountType(AccountType.CHECKING)
                                          .setIdentifier(CONSTANTS.INFOMAP.get("customer1.account1.tbukID"))
                                          .build();
    }
    // 7
    public void unlinkAccount(String bankAccountId){

    }
}
