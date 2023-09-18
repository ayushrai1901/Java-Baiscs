/*Find the Sum of the Numbers in a Given Range in Java */

/*Find the Sum of the Numbers in a Given Interval in Java
Given the range as integer input, the objective is to find the Sum of all the Numbers that lay in the given interval using different methods. To do so we basically iterate from the base interval to the final interval and keep adding the number. Here are some of the methods to solve the above mentioned problem in Java Language.

Method 1: Using Brute Force
Method 2: Using the Formula
Method 3: Using Recursion */

/*public class SumOfNumInGivenRange{
    public static void main(Stirng[] args){
        int a =5;
        int b=10;
        int sum=0;
        for(int i=a; i<=b;i++){
            sum = sum+i;
        }
        System.out.println(sum);

    }
}*/

/*Method 2: Using the Formula
In this method we’ll use a sequence and series formula to find the sum of n numbers in a series. Formula : N*(N+1)/2.

Working
For the given integer input intervals number1 and number2

Initialize the required variables.
Apply the given formula sum = b*(b+1)/2 – a*(a+1)/2 + a.
Print the sum variable as output. */

public class  SumOfNumInGivenRange
{
	public static void main(String[] args) {
	    int num1 = 2;
	    int num2 = 5;
	    int sum = num2*(num2+1)/2 - num1*(num1+1)/2 + num1;
		System.out.println("The Sum is "+ sum);
	}
}