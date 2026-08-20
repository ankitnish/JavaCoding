

 //How to give input/output to the array


import java.util.*;
// public class Basics{
//    public static void main (String args[]){
//        int marks[]= new int[100];

//        Scanner sc = new Scanner (System.in);

//        System.out.println("Array length : " + marks.length);

//        marks[0]= sc.nextInt();
//        marks[1]= sc.nextInt();
//        marks[2]= sc.nextInt();

//        System.out.println("Physics : "+ marks[0]);
//        System.out.println("Chemistry : "+ marks[1]);
//        System.out.println("Maths : "+ marks[2]);

//        int percentage = (marks[0]+marks[1]+marks[2]) / 3;

//        System.out.println("Percentaage = " + percentage);


//    }
// }


// public class Basics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String input = sc.nextLine();

//         String arr[]= input.split(",");

//         ArrayList<Integer> result = new ArrayList<>();

//         for(String token: arr){
//             int num= Integer.parseInt(token);
//             result.add(num);
//         }

//         for(int i: result){
//             System.out.println(i+" ");
//         }
//     }
// }


// Adding one the values of marks in an array

// import java.util.*;
// public class Basics{
//        public static void update(int marks[]){
//            for(int i = 0; i<marks.length; i++){
//                marks[i]= marks[i]+1;
//            }
//    }

//    public static void main(String args[]){
//            int marks[] ={55,54,52};
//            update(marks);

//        for(int i = 0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }

//    }
// }

 //print pairs of the number


// public class Basics{

// public static void printpairs(int numbers[]){
//     for(int i = 0; i<numbers.length; i++){
//         int curr=numbers[i];
//         for(int j = i+1; j<numbers.length; j++){
//             System.out.println("{"+curr+","+numbers[j]+"}");
//         }
//         System.out.println();
//     }
// }
//     public static void main (String args[]){
//     int numbers[] ={2,4,6,8,10};

//     printpairs(numbers);


//     }
// }



// import java.util.*;
// public class Basics{
//     public static void main (String args[]){
//         int marks[] = new int[20];

//         Scanner sc = new Scanner(System.in);

//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();
//         marks[3] = sc.nextInt();

//         for(int i=0; i<4; i++){
//         System.out.println(marks[i]);
//         }
//     }
// }



// public class Basics{

//     //function to find the index whose sum is equal to targets

//     public static int[] index(int target, int[] arr){

//         int[] nums = new int[2];

//         int left = 0;
//         int right= arr.length-1;

//         while(left<right){
           
//             int sum = arr[left]+ arr[right];
//             if(target==sum){
//                 nums[0]= left;
//                 nums[1]= right;

//                 return nums;
//             }
//             if(sum<target){
//                 left++;
//             }else{
//                 right--;
//             }
//         }

//         return nums;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 7, 11, 15};
//         int target = 9;

//        System.out.println(Arrays.toString(index(target, arr)));

//     }
// }




// Array is sorted or not

// public class Basics {

//     public static boolean isSorted(int[] arr){

//         for(int i=1; i<arr.length; i++){
//             if(arr[i] < arr[i-1]){
//                 return false;
//             }
//         }

//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println(isSorted(arr));
        

//     }

// }


//2D Array  -- to find the largest element in the array


public class Basics{

    public static void largest(int[][] matrix){
        
        int largest = matrix[0][0];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                
                if(matrix[i][j]>largest){
                    largest = matrix[i][j];
                }

            }
        }
         System.out.print("largest is:" + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        int n= matrix.length; 
        int m= matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        largest(matrix);
    


    }
}
