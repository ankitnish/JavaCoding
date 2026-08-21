
import java.util.*;
public class Practice {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 200);
        hm.put("Indonesia", 10);
        hm.put("Brazil", 10);

       

        Set<String> keys = hm.keySet();

         System.out.println(keys);

         for (String k : keys) {
            System.out.println("Key="+k+", value="+hm.get(k));
            
         }





    }

    
}
