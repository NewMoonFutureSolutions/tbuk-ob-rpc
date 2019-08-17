package tbuk.psd2.grpc.util;

import java.time.LocalDateTime;

public class Utils {

    public static String getDateNowInFormat1(){
        LocalDateTime now=LocalDateTime.now();
        return now.toString();

    }
}
