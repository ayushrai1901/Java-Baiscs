/*Find the Sum of the Digits of a Number in Java Language
Given an input integer as the number, our objective is to break down the number into it’s individual digits and sum them up together. To do so we’ll use the follow two operators,

Modulo Operator % : We’ll use this to extract the digits from the number.
Divide Operator / : We’ll use it to shorten the number by 1 digit */



//Brute force methode
/*public class sumOfDigitsOfNum {
    public static void main(String[] args){
        int n =123456789;
        int sum =0;
        while(n!=0){
            sum +=n%10;
            n = n/10;
        }

        System.out.println(sum);
    }
}*/


// Using Recursion

public class sumOfDigitsOfNum{
    public static void main(String[] args){
        int num =123456789;
        int sum =0;
        System.out.println(getSumRecursive(num,sum));
    }
    static int getSumRecursive(int num, int sum){
        //base condition
        if(num==0){
            return sum;
        }

        sum += num%10;
        return getSumRecursive(num/10, sum);
    }
}
