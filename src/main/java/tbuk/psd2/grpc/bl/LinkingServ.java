package tbuk.psd2.grpc.bl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.jwk.OctetKeyPair;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import com.tbuk.grpc.psd2.Linking.*;
import tbuk.psd2.grpc.util.CONSTANTS;


@Service
public class LinkingServ {

    private String jwtToken="";
    // 1 - account post for link info
    public BankAuthorization authorisationResponse(String accessToken){
        jwtToken=accessToken;
       return BankAuthorization.newBuilder().setBankId(CONSTANTS.BANKID).addAccounts(getSealedMesageAccount1()).build();
    }

    private SealedMessage getSealedMesageAccount1() {

        ObjectMapper mapper=new ObjectMapper();
        // Bu iki banka hesabinin json haline getirdim
        String bankAccount1_AsJson = "";
        try {
            bankAccount1_AsJson = mapper.writeValueAsString(getPlaintextBankAuthorization(1));
        }catch (Exception ex){}
        System.out.println(bankAccount1_AsJson);
        String encodedString = Base64.getEncoder().encodeToString(bankAccount1_AsJson.getBytes());
        // simdi yukardaki hesaplari sealed message icine atacagiz. Her account u sealed mesaj ile ortecegiz
        return SealedMessage.newBuilder().setCiphertext(encodedString).setNoop(SealedMessage.NoopMethod.newBuilder().build()).build();

    }

    private PlaintextBankAuthorization getPlaintextBankAuthorization(int op){
        String memberId= "";
        try {
            memberId = getMemberId();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return PlaintextBankAuthorization.newBuilder().setAccount(getBankAccount(1))
                .setAccountName("GBP Current Account (7883)")
                .setExpirationMs(500000)
                .setMemberId(memberId)
                .build();

    }
    private String getMemberId() throws Exception{
        String private_jsonObject="{\"kty\":\"OKP\",\"d\":\"jXU4ZZUnqnNmDAwtm_0tpse80erzQfADBZIpgXczI70\",\"crv\":\"Ed25519\",\"x\":\"GGo29vo73dE296fO8-PT3ywf-clI3KBjS0_3DoKvYm4\"}";
        OctetKeyPair jwk=OctetKeyPair.parse(private_jsonObject);
        OctetKeyPair publicJWK = jwk.toPublicJWK();
        JWSObject jwsObject=JWSObject.parse(jwtToken);
        String line=jwsObject.getPayload().toString();
        String[] str=line.split(";");
        String[] str2=str[1].split("=");
        return str2[1];
    }
    private  BankAccount getBankAccount(int op){
        // tum cakma banka hesaplarini DummyResponses da topladim.. sen buraya gercek implementasyon yapacaksin
        return BankAccount.newBuilder().setCustom(Custom.newBuilder().setBankId(CONSTANTS.BANKID).setPayload(CONSTANTS.INFOMAP.get("customer1.account1.tbukID")).build()).build();
           //     .builder().custom(Custom.builder().bankId(CONSTANTS.BANKID).payload(CONSTANTS.INFOMAP.get("customer1.account1.tbukID")).build()).build();

    }




}
