/*Check Whether or Not the Number is a Palindrome in Java Language
Given an input integer as a number, the objective is to check whether or not the given number integer is a Palindrome or not in Java Language. To do so we’ll reverse the the number using the modulo and divide operators and check if the reversed number matches the original number. Here are few methods to Check Whether or Not the Number is a Palindrome in Java Language,

Method 1: Using Iteration
Method 2: Using Recursion */


/*public class palindrome {
    public static void main(String[] args){
        int  num = 1221;
        int reverse =0;
        int rem ;
        int temp;
        temp = num;

        while(num!=0){
            rem = temp%10;
            reverse = reverse*10+rem;
            temp =temp/10;
        }

        if(num==reverse){
            System.out.println(num+ "is palindrome");
        }else
        System.out.println(num  + "not palindrome");

    }
}*/


//using recursion

public class palindrome{
    public static void main(String [] args){
        int num = 12021, reverse =0;
        int rem ;

        if(getReverse(num, reverse)==num){
            System.out.println(num + " is palindrome");
        }else{
            System.out.println(num + "is not Palindrome");
        }

    }


    static int getReverse(int num , int rev){
        if(num==0){
            return rev;
        }

        int rem = num%10;
        rev=rev*10 +rem;

        return getReverse(num/10, rev);
    }
}
