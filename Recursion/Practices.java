package Recursion;

public class Practices {
    public static void main(String[] args) {
        print(0);

    }
    static void print(int n){
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}


// find the nth fibonnaci number