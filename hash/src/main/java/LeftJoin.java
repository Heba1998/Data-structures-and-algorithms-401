import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeftJoin {

    public static List<String> leftJoin(HashMap hashMap1, HashMap hashMap2){
        List<String> Keylist = new ArrayList<>();
        for(Object i : hashMap1.keySet()){
            if(hashMap1.containsKey(i)){
                Keylist.add("{"+i +  ": " + hashMap1.get(i)+ ", " + hashMap2.get(i)+"}");
            } else{
                Keylist.add(i + ": " + hashMap1.get(i) + ", " + null);
            }
        }
        return Keylist;
    }
}
