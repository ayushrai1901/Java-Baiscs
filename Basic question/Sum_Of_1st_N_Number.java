/*Find the Sum of First N Natural Numbers in Java
Given an integer input of N, the objective is to find the sum of all the natural numbers until the given input integer. To do so we can use different approaches to write the Java code and some such methods are mentioned below,

Method 1: Using for Loop
Method 2: Using Formula for the Sum of Nth Term
Method 3: Using Recursion */


/*Method 1: Using for Loop */

/*Given an integer input N, the objective is to calculate the sum of all the natural numbers until the integer N. To do so we iterate through all the numbers that lay within N and keep incrementing the sum value.

The algorithm for the below code is as follows,

In the main() function initialize the required variables.
Run a for loop with range as N+1.
Keep adding the iter values to the Sum variable.
Print Sum variable.
The output for the above mentioned code is the sum of all the natural numbers until the given value. */

/*import java.util.Scanner;
public class Sum_Of_1st_N_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number : ");
        int n = sc.nextInt();
        //decalare sum =0;
        int sum =0;

        for(int i =1; i<=n ; i++){
            sum = sum +i;
        }
        System.out.println("Sum of n natural number: "+ sum);
    }
}*/


/*Method 2 : Using Formula for the Sum of Nth Term */

/*Formula to Find the Sum of N terms
Sum = ( Num * ( Num + 1 ) ) / 2 */

import java.util.Scanner;

/*public class Sum_Of_1st_N_Number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum =(n*(n+1))/2;
        System.out.println("Sum of  n number is: " + sum);
    }
}*/


/*Method 3 : Using Recursion
 */
public class Sum_Of_1st_N_Number{
    public static void main(String[] args){
        int n = 5;
        int sum = getSum(n);

        System.out.println(sum);
    }
    static int getSum(int n){
        if(n==0){
            return n;
        }

        return n +getSum(n-1);
    }
}

