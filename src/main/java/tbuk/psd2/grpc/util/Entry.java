package tbuk.psd2.grpc.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "key",
    "value",
    "category"
})

public class Entry {

    @JsonProperty("key")
    public String key;
    @JsonProperty("value")
    public String value;
    @JsonProperty("category")
    public String category;

    public Entry(String key,String val,String cat){
        this.key=key;
        this.value=val;
        this.category=cat;
    }

}
