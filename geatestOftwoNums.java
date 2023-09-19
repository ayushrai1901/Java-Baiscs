/*Find the Greatest of the Two Numbers in Java
Given two integer input Number1 and Number2, the objective is to write a Java code to compare both the Numbers and Find the Greatest of the Two Numbers. To do so we’ll use if-else statements and print the output. Some methods to solve the above-mentioned Problem are given below.

Method 1: Using if-else Statements
Method 2: Using Ternary Operator
Method 3: Using inbuilt max Function */


//Method 1: Using if-else Statements
/*public class geatestOftwoNums {
    public static void main(String [] args){
        int a = 5 ;
        int b=6;
        if(a==b){
            System.out.println(" both are equal: ");
        }
        else if( a>b){
            System.out.println("a is greater than b: "+ a);
        }else{
            System.out.println("b is greater than a : "+ b);
        }
    }
}*/

//Method 2 : using ternary operator
/*public class geatestOftwoNums{
    public static void main(String[] agrs){
        int a= 5;
        int b=6;
        if(a==b){
            System.out.println("both are equal: ");
        }else{
            int temp = a>b ?a:b;
            System.out.println(temp + " is greater");
        }
    }
}*/

//Method 3: using inbuilt max function
public class geatestOftwoNums{
    public static void main(String[] args){
        int a=5;
        int b=6;
        int largest = Math.max(a,b);
        System.out.println(largest);
    }
}
