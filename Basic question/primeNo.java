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

/*public class primeNo {
    public static void main(String[] args){
    int n=23;
    checkPrime (n);
    }


    public static void checkPrime(int n){
        int count =0;

        //negative nos , 0 and 1 are not prime number
        if(n<2){
            System.out.println("The given is number " +n + "is not prime");
        }

        for(int i=0;i<=n;i++){
            if(n%1==0){
                count +=1;
            }
        }


        if(count>2)
        System.out.println("The given number is not prime" + n);e
        else
        System.out.println("Given number is prime : "+n);
    }
}*/

//PRIME NUMBER FOR GIVEN RANGE

public class primeNo{
    public static void main(String[] args){
        int lower =1, upper = 20;

        for(int i =lower; i<=upper;i++){
            if(isPrime(i))
            System.out.println(i);
        }
    }

    static boolean isPrime(int n){
       // int count =0;

        if(n<2)
        return false;

        for(int i=2 ; i<n; i++){
            if(n%i==0)
            return false;
        }

        return true;
    }
}
