package ConditionalStatement;

// import java.util.*;
// public class Basic {
//     public static void main (String args[]){
//         int x = 2;
//         int y = 5;
//         int exp1 = (x*y/x);
//         int exp2 = (x*(y/x));
//         System.out.println(exp1 + ",");
//         System.out.println(exp2);
//     }

// }

import java.util.*;

public class Basic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if( income < 500000){
            tax = 0;
        }
        else if(income >= 500000 && income <1000000){
            tax = (int)(income*0.2);
        }
        else{
            tax = (int)(income*0.3);
        }
        System.out.println("Your tax is :" + tax);
        sc.close();
    }
}