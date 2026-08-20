package Loops;


//To print the Hello world 100 times

// import java.util.*;
// public class Counting{
//     public static void main(String[] args) {
//         int counter = 0;
//         while (counter<100) {
//             System.out.println("Hello world");
//             counter ++;
//         }
//         System.out.println("Ankit");
//     }
// }



// To print the number from 1 to 10.

// import java.util.*;
// public class Counting{
//     public static void main(String[] args) {
//         int number = 1;
//         while(number<=10){
//             System.out.println(number);
//             number++;
//         }
//     }
// }


//to print the sum of n natural number


// import java.util.*;
// public class Counting{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;

//         int i = 1;
//         while(i<=n){
//             sum +=i ;
//             i++;
//         }
//         System.out.println(sum);

//     }
// }


// FOR LOOP

// import java.util.*;

// public class Counting{
//     public static void main(String args[]){
//         for(int i = 1; i<=10; i++){
//             System.out.println("Hello world");
//         }
//     }
// }

//TO PRINT THE 4 BY 4 SQUARE PATTERN

// import java.util.*;

// public class Counting{
//     public static void main (String args[]){
//         for(int line = 1; line<=4; line++){
//             System.out.println("****");
//         }
//     }
// }

// import java.util.*;

// public class Counting{
//     public static void main(String args[]){
//         int n = 5428256;

//         while(n>0){
//             int lastdigit = n%10;
//             System.out.print(lastdigit);
//             n = n/10;

//         }
//     }
// }

// Do while loop

// import java.util.*;
// public class Counting{
//     public static void main (String args[]){
//         int i = 1;
//         do{
//             System.out.println("hello world");
//             i++;
//         }while(i<=10);
//     }
// }

// BREAK STATEMENT

//import java.util.*;

//public class Counting{
//    public static void main(String args[]){
//        for(int i=1; i<=10; i++)
//        {
//            if(i==3){
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("i am out of the loop");
//    }


// keep entering the number till users enters a multiple of 10

//import java.util.*;
//public class Counting{
//    public static void main (String args[]){
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println(" Enter your number : ");
//            int n = sc.nextInt();
//            if (n % 10 == 0) {
//                break;
//            } System.out.println(n);
//        }while (true);
//    }
//}

//import java.util.*;
//public class Counting{
//    public static void main (String args[]) {
//        for(int i = 1; i <=5; i++){
//            if(i==3){
//                continue;
//            }System.out.println(i);
//
//        }
//    }
//}

// check if the number prime or not

import java.util.*;
public class Counting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2){
            System.out.println(" n is prime ");
        }else{
            boolean isPrime= true;
            for(int i = 2; i<=n-1; i++){
                if(n%i == 0){
                    isPrime = false;
                }
            }
            if(isPrime = true){
                System.out.println("n is prime");
            }else{
                System.out.println("n is not prime");
            }
        }

    }
}
