package tbuk.psd2.grpc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tbuk.psd2.grpc.util.CONSTANTS;

@SpringBootApplication
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
//    TransactionResponse.builder().id(String.valueOf(CONSTANTS.transactionId))
//            .amount(Amount.builder().currency("GBP").value("800").build())
//            .createdAt(Utils.getDateNowInFormat1())
//            .description("Room rent")
//            .status("PROCESSING")
//            .type("DEBIT")
//            .tokenId("1")
//            .tokenTransferId("1").build();
//
//
//    // CONSTANTS.COSTUMER1TRANSACTIONS.put()
//  }

}