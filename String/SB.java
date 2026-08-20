package String;

// public class SB{
//     public static void main (String args[]){
//         StringBuilder builder = new StringBuilder();

//         for(int i = 0; i<26; i++){
//             char ch =(char)('a'+ i);
//             builder.append(ch);
//         }

//         System.out.println(builder.toString());

//     }
// }

import java.util.*;

public class SB {
    public static void main(String args[]) {
        String name = "Ankit";
        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
