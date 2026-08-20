import java.util.*;
public class EvenOdd {
    public static void Count(int[] arr){
    int EvenCount = 0;
    int OddCount = 0;
    
    for(int i=0; i<arr.length; i++){

        if(arr[i]%2==0){
            EvenCount++;
        }else{
            OddCount++;
        }
        }
        System.out.println("Even : " + EvenCount);
        System.out.println("Odd  : " + OddCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];


        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Count(arr);

        sc.close();
    }
    
}
