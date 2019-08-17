package tbuk.psd2.grpc.util;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;

public class StatementBase64Utils {
	// Dosyayi Base64'a cevirir
	public static String convertToBase64(String filePath) throws IOException {
		byte[] fileContent = FileUtils.readFileToByteArray(new File(filePath));
		String encodedString = Base64.getEncoder().encodeToString(fileContent);
	    return encodedString;
	}
	//  Base64'u dosyaya cevirir
	public static byte[] convertToFile(String encodedBase64String) throws IOException {
		byte[] decodedBytes = Base64
		          .getDecoder()
		          .decode(encodedBase64String);
	// FileUtils.writeByteArrayToFile("c://test.pdf", decodedBytes); Base64.getEncoder().encodeToString(fileContent);
	    return decodedBytes;
	}
	
}
