//Check if a Number is Positive or Negative in Java

/*N > 0 then, number is Positive.
N < 0 then, number is Negative.
N = 0 then, number is Zero. */

/*To solve the above problem we write a Java code using three different methods.

Method 1: Using Brute Force
Method 2: Using Nested if-else Statements
Method 3: Using Ternary Operators */
import java.util.*;
import java.util.Scanner;


class positiveNegative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to choose: ");
        int num = sc.nextInt();
        //conditions to check if the number is -ve or +ve
        if(num>0){
            System.out.println("The number is positive : " + num);
        }else if(num<0){
            System.out.println("The number is negative : " + num);
        }else{
            System.out.println("The number is zero : "+ num);
        }
    }
}