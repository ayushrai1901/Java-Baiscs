/*Method 1: Simple iterative solution
Method 2: Optimization by break condition 
Method 3: Basic Recursion technique*/

/*Working
In this method, we’ll iterate through all the numbers that lay in the interval [1, number] and check if any of them is a factor of the number, if so it’s not a Prime.

For a given integer input we check for the following,

If the count of factors for this number is > 2 then
It’s not prime else it’s prime
A prime number must only be divisible by 1 and the number itself. */

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("Number is prime: " + a);
        }else{
           System.out.println("Number is not prime: " + a); 
        }
    }
}
