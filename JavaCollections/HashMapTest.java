package JavaCollections;
import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {

        String s = "leetcode";

        HashMap<Character, Integer> f = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            f.put(ch, f.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(f.get(ch) == 1){
                System.out.println("Index: " + i);
                return ;
            }
        }

        System.out.println(-1);
    }
}