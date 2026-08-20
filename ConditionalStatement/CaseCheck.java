package ConditionalStatement;

// import java.util.*;
// public class CaseCheck{
// public static void main(String args[]){

//     int age = 22;
//     if(age <= 18){
//         System.out.println("Vote,Drive");
//     }
//     else{
//         System.out.println("not adult");
//     }
//   }
// }




// import java.util.*;
// public class CaseCheck{
//     public static void main(String args[]){
//         int A = 1;
//         int B = 3;
//         if(A>=B){
//             System.out.println("A");
//         }
//         else{
//             System.out.println("B");
//         }
//     }
// }

// import java.util.*;
// public class CaseCheck{
// public static void main(String args[]){

//     Scanner sc = new Scanner(System.in);
//     int number = sc.nextInt();

//     if ( number%2 == 0){
//         System.out.println("EVEN");
//     }
//     else{
//         System.out.println("ODD");
//     }


// // }
// // }

// import java.util.*;

// public class CaseCheck{
//     public static void main(String args[]){
//         int age = 22;
//         if(age >=18){
//             System.out.println("Adult");
//         }
//         else if( age <=18 && age >=13){
//             System.out.println("Teenager");
//         }
//         else{
//             System.out.println("Not adult");
//         }
//     }
// }

// import java.util.*;

// public class CaseCheck {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;

//     if( income < 500000){
//         tax = 0;
//     }
//     else if(income >= 500000 && income <1000000){
//         tax = (int)(income*0.2);
//     }
//     else{
//         tax = (int)(income*0.3);
//     }
//     {
//          System.out.println("Your tax is :" + tax);
//     }
// }
// }


import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
        in.close();

    }
}
