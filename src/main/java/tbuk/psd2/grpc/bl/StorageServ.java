package tbuk.psd2.grpc.bl;

import org.springframework.stereotype.Service;
import tbuk.psd2.grpc.util.CONSTANTS;
import com.tbuk.grpc.psd2.Storage.*;

@Service
public class StorageServ {
    public EntryUpdated putEntry(Entry e){

        String previousValue="";
        if(CONSTANTS.entries.containsKey(e.getKey())){
            tbuk.psd2.grpc.util.Entry previousEntry=CONSTANTS.entries.get(e.getKey());
            previousValue=previousEntry.value;
            CONSTANTS.entries.replace(e.getKey(),previousEntry,new tbuk.psd2.grpc.util.Entry(e.getKey(),e.getValue(),e.getCategory()));
        }
        else{
            CONSTANTS.entries.put(e.getKey(),new tbuk.psd2.grpc.util.Entry(e.getKey(),e.getValue(),e.getCategory()));
        }

        return EntryUpdated.newBuilder().setPrevious(previousValue).build();
    }

    public EntryResponse getEntry(String key){
        String val="";
        if(CONSTANTS.entries.containsKey(key)){
            tbuk.psd2.grpc.util.Entry entry=CONSTANTS.entries.get(key);
            val=entry.value;
        }
        return EntryResponse.newBuilder().setKey(key).setValue(val).build();
    }
    public void deleteEntry(String key){
        if(CONSTANTS.entries.containsKey(key)){
            CONSTANTS.entries.remove(key);
        }

    }
}
