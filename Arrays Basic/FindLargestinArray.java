/*Here, we will discuss the following methods to find the maximum element of the array.

Method 1 : Using Iteration
Method 2 : Using recursion Top-down Approach
Method 3 : Bottom-up approach */


//Using Iteration
import java.util.Scanner;

/*public class FindLargestinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of element:\n");
        int n = sc.nextInt();
        int [] arr = new  int[n]; // arr size n
        System.out.println("Enter element in array:\n");
        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        //printing element of arrays
        System.out.println("elements of array:");
        for(int i=0; i<arr.length;i++){
            System.out.println( arr[i]);}

        //maximum of array are as
        int max= arr[0];
        for(int i=0; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Largest element in array: \n" +  max);
        

    }
}*/


//Using recusrion
