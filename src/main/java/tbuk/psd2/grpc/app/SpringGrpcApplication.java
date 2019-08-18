package tbuk.psd2.grpc.app;

import com.tbuk.grpc.psd2Account.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tbuk.psd2.grpc.util.CONSTANTS;
import tbuk.psd2.grpc.util.Utils;
@SpringBootApplication
@ComponentScan({"tbuk.psd2.grpc","com.tbuk.grpc"})
public class SpringGrpcApplication {

  public static void main(String[] args) {
    LoadData();
    SpringApplication.run(SpringGrpcApplication.class, args);

  }

  private static void LoadData(){
    // Customer 1
    CONSTANTS.INFOMAP.put("customer1.name","Test");
    CONSTANTS.INFOMAP.put("customer1.lastname","User");
    CONSTANTS.INFOMAP.put("customer1.address","");
    // Account 1
    CONSTANTS.INFOMAP.put("customer1.account1.tbukID","08347883");
    CONSTANTS.INFOMAP.put("customer1.account1.sortcode","405198");
    CONSTANTS.INFOMAP.put("customer1.account1.accountNumber","08347883");
    CONSTANTS.INFOMAP.put("customer1.account1.bic","TUBAGB2L");
    CONSTANTS.INFOMAP.put("customer1.account1.iban","GB95TUBA40519808347883");

    //LoadTransactions();
  }

//  private static void LoadTransactions(){
//    CONSTANTS.transactionId++;
//    Account.Transaction.newBuilder().setId(String.valueOf(CONSTANTS.transactionId))
//            .setAmount(Account.Money.newBuilder().setCurrency("GBP").setValue("800").build())
//            .setCreatedAt(Utils.getDateNowInFormat1())
//            .setDescription("Room rent")
//            .setStatus(Account.TransactionStatus.PROCESSING)
//            .setType(Account.TransactionType.DEBIT)
//            .setTokenId("1")
//            .setTokenTransferId("100").build();
//
//
//     CONSTANTS.COSTUMER1TRANSACTIONS.put();
//  }

}