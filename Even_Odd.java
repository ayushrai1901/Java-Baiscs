/*Given an integer input the objective is to write a Java code to Check Whether a Number is Even or Odd.
To do so the main idea is to divide the number by 2 and check if it’s divisible or not.
It’s an Even number is it’s perfectly divisible by 2 or an Odd number otherwise. */

/*Method 1 : Using Brute Force */

//Algorithm
/*1. Input an integer 
 2. Check wheather the number os divisible by 2 
 3. This means using modulo/remainder(%) operator leaves 0 as a remainder
 do : if(num%2==0){
    s.o.p(" yes")
 }else{
    s.o.p("no")
 }
 */

import java.util.Scanner;

public class Even_Odd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Number is even : " + num);
        }else{
            System.out.println("The number is odd : " + num);
        }

    }
}