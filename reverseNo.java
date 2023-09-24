/*Find the Reverse of a Number in Java Language
Given an integer input as number, the objective is Find the Reverse of a Number in Java Language. To do so we usually break down the number into its individual digits and then rearrange them in reverse order.
Here are a few methods to solve the above-mentioned problem in Java Language, */


/*public class reverseNo {
    public static void main(String[] args){
        int num=123456789;
        int rem ;
        int reverse =0;
        while(num !=0){
            rem = num%10;
            reverse =reverse*10 +rem;
            num = num/10;
        }
        System.out.println(reverse);
    }
}*/


//using recursion

public class reverseNo{
    public static void main(String[] args){
        int num =123456789;
        int reverse =0;
       // int sum;
        System.out.println(reverseRecursion(num,reverse));
    }

    static int reverseRecursion(int num, int reverse){
        if(num==0){
            return reverse;
        }
        int rem = num%10;
        reverse = reverse*10 +rem;

        return reverseRecursion(num/10, reverse);
    }
}
