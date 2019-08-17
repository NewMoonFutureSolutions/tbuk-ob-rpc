package tbuk.psd2.grpc.util;


import com.tbuk.grpc.psd2Account.Account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CONSTANTS {

    public static String BANKID = "TBUK";

    public static ConcurrentHashMap<String, Entry> entries=new ConcurrentHashMap<>();

    public static HashMap<String, String> INFOMAP = new HashMap<>();

    public static ConcurrentHashMap<String, Account.Transaction> COSTUMER1TRANSACTIONS=new ConcurrentHashMap<>();

    public static HashMap<String, String> TnxTransferMap = new HashMap<>();

    public static int transactionId = 0;
}
