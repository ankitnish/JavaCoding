import java.util.*;

//Print subarrays in java



public class SubArrays{

    public static void MaxSubarraySum(int numbers[]){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+numbers[i];
        }



        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;

                curSum = start ==0 ? prefix[end]: prefix[end]-prefix[start-1];
                if(maxSum<curSum){
                    maxSum=curSum;
                }
                }

            }
            System.out.println("MaxSum is = "+maxSum);

        }
    public static void main (String args[]){
    int numbers[] = {2,4,6,8,10};

    MaxSubarraySum(numbers);
}
}






