package BitManipulation;


//binary AND &

//public class Practice {
//    public static void main(String[] args) {
//        System.out.println(5&6);
//    }
//}

//Bianry OR |

//public class Practice {
//    public static void main(String[] args) {
//        System.out.println(5 | 6);
//    }
//}

// Binary XOR ^

//public class Practice {
//    public static void main(String[] args) {
//        System.out.println(5^6);
//    }
//}


// one's complement

//public class Practice {
//    public static void main(String[] args) {
//        System.out.println(~5);
//    }
//}

// Binary left shift

//public class Practice {
//    public static void main(String[] args) {
//        System.out.println(5<<2);
//    }
//}


//print the number is odd or even

public class Practice {
    public static void oddEven(int n){
        int bitMask = 1;

        if((n & bitMask) == 0) {
            System.out.println("Even number");
        }
            else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {

        oddEven(4);
        oddEven(55);
        oddEven(5180);
        oddEven(74);
        oddEven(51);


    }
}





