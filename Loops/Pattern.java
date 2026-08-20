package Loops;

//public class Pattern{
//    public static void main (String args[]){
//        for(int line = 1; line<=4; line++ ){
//            for(int star = 1; star<=line; star++){
//                System.out.print("*");
//            }System.out.println();
//        }
//
//    }
//}

// Print inverted-star pattern

// import java.util.*;

//public class Pattern{
//    public static void main(String args[]){
//        int n = 4;
//        for (int line = 1; line<=n; line++){
//            for(int star = 1; star<= n-line+1; star++ ){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

// To print the half pyramid

import java.util.*;

public class Pattern{
    public static void main(String args[]){
        int n = 4;
        for (int line = 1; line<=n; line++){
            for(int number = 1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}