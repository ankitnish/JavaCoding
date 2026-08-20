 // To find the second largest
import java.util.*;
public class SecondLarg {

    public static void SecondLarge(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;

       
        System.out.println("Second largest :"+ arr[n-2]);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        SecondLarge(arr);

        sc.close();
    }
}
    


