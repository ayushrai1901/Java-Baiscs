/*Find the Sum of the Numbers in a Given Range in Java */

/*Find the Sum of the Numbers in a Given Interval in Java
Given the range as integer input, the objective is to find the Sum of all the Numbers that lay in the given interval using different methods. To do so we basically iterate from the base interval to the final interval and keep adding the number. Here are some of the methods to solve the above mentioned problem in Java Language.

Method 1: Using Brute Force
Method 2: Using the Formula
Method 3: Using Recursion */

public class SumOfNumInGivenRange{
    public static void main(Stirng[] args){
        int a =5;
        int b=10;
        int sum=0;
        for(int i=a; i<=b;i++){
            sum = sum+i;
        }
        System.out.println(sum);

    }
}