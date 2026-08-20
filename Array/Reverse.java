import java.util.*;
public class Reverse{

    public static void Rev(int[] arr){
        int left = 0; 
        int right =arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }



    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();        

        int[] arr = new int[n];
        System.out.println("Enter array elements:");

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        
        Rev(arr);
        System.out.println("Reversed:");
       

        for(int num: arr){
            System.out.println(num+" ");
        }
        sc.close();
       
    }
}

