import java.util.*;
public class Smallest {
    public static void small(int[] arr){
        Arrays.sort(arr);
        int n =arr[0];
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         small(arr);
         sc.close();

    }
    
}
