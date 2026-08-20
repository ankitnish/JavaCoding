package ConditionalStatement;

//Cases

//public class Switch {
//    public static void main(String[] args) {
//        int number = 3;
//        switch (number) {
//            case 1 : System.out.println("Burger");
//                break;
//            case 2 : System.out.println("momos");
//                break;
//            case 3 : System.out.println("mango shake");
//                break;
//            default : System.out.println("we are just dreaming");
//        }
//    }
//}


// Calculator

import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter operator; ");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+' : System.out.println(a+b);
                break;
            case '-' : System.out.println(a-b);
                break;
            case '*' : System.out.println(a*b);
                break;
            case '/' : System.out.println(a/b);
                break;
            case '%' : System.out.println(a%b);
                break;
            default : System.out.println("Didn't find");
        }
            sc.close();
    }
}
