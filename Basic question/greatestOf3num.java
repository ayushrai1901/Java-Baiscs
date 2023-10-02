/*Find the Greatest of the Three Numbers in Java
Given Three integer inputs num1, num2 and num3, the objective is ti write a code to Find the Largest of the Three Numbers in Java Language. In this article we will see a  Java program to Find Greatest of three numbers. We will use if else conditions and ternary operator too to find the same. Here are some of the methods to solve the above mentioned problem,

Method 1: Using if-else Statements 2
Method 2: Using Ternary Operator */

//Method 1: usinf if else statement
/*public class greatestOf3num {
    public static void main(String[] args){
        int a=5;
        int b=6;
        int c=7;
        if(a>b && a>c){
            System.out.println(a + " a is greater than b & c");
        }else if(b>a && b>c){
            System.out.println(b + " b is greater than a & c");
        }else{
            System.out.println(c + " c is greater than a & b");
        }
    }
}*/


//Method 2 : ternary operator
public class greatestOf3num {
    public static void main(String[] args){
        int a=5;
        int b=6;
        int c=7;
        
        // compaere two and store largest in temp 
        int temp = a>b?a:b;

        //compare wtih 3rd element
        int result = temp>c?temp:c;
        System.out.println(result + " c i greater than a & b");
    }
}
