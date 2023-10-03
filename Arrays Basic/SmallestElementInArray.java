/*We will discuss different methods to find the smallest element among the elements of the given array.

Methods Covered :
Method 1: Using Iteration
Method 2: Top-down Recursion.
Method 3: Bottom-up Approach */

/* Method 1 :
Objective: Find the Smallest element in array Java

Declare a variable say min and initialize it with array first element.
Run a loop from index 1 to N, and check
If arr[i]<min, then set min = arr[i]
After complete iteration print min.*/

import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array: \n");
        int n = sc.nextInt();
        int [] arr = new int[n]; //decalaration of array and its size is n


        System.out.println("Insert element in array: \n");

        for(int i =0 ; i<n;i++){
            arr[i]=sc.nextInt(); //insering element in history
        }


        System.out.println("element in array:\n");
        for(int i =0; i<arr.length;i++){ //printing element
            System.out.println(arr[i]);
        }

        int min = arr[0];
        for(int i =0; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum element in array:\n"+min);

    }
}
