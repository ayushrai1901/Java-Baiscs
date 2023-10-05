package Recursion;

import java.security.PublicKey;

import javax.print.DocFlavor.STRING;

/*  public class powerOfNum{
    public static void main(String[] args){
        int base = 5, x=3;
        System.out.println("Required Power is "+power(base,x));
    }

    //recursive function
    static int power(int base, int x){
        if(x==0){
            return 1;
        }
        return (base*power(base, x-1));
    }
}*/


//using for loop

public class powerOfNum{
    public static void main(String [] args){
        int base =5, x=3;
        System.out.println("Required Power is " + power(base, x));
    }
    static int power(int base, int x) {
        int result = 1;
        while (x > 0) {
            result *= base;
            x--;
        }
        return result;
    }
}

