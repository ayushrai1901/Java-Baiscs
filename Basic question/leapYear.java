/*Check Whether or Not the Year is a Leap Year in Java
Given an integer input for the year, the objective is to check whether or not the user given input “year” is a Leap year or not. In order to do so we check if the integer input satisfies the conditions for a leap year mentioned below. Therefore, we write a Java code to check and tell if it’s a leap year or not. Some of the methods to check for leap year are mentioned below

Method 1: Using if-else Statements 1
Method 2: Using if-else Statements 2
Method 3: Using Ternary Operator
Method 4: Bonus Boolean method*/


//method 1
/*Working
For the input integer “year” we perform the following

Check if the year variable is divisible by 400.
Check if the year variable is divisible by 4 but not by 100.
If the above conditions are satisfied, print it’s a Leap year. It’s not a Leap Year otherwise */


/*public class leapYear {
    public static void main(String [] args){
        int year = 2047;
        if(year % 400==0){
            System.out.println(year + " is leap year");
        }else if(year%4==0 && year%100!=0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not leap year");
        }
    }
}*/


//method 2
/*For a given integer variable “year”, we check for the following

If the year variable is divisible by 400 or is it divisible by 4 but not 100.
Print it’s a Leap Year if true, Print it’s not a Leap year otherwise. */


/*public class leapYear
 {
   public static void main (String[]args)
   {

     int year = 2020;

     if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
       System.out.println (year + " is a Leap Year");

     //not leap year
     else
         System.out.println (year + " is not a Leap Year");

   }
 }*/

//method 3
 public class leapYear
{
  public static void main (String[]args)
  {

    int year = 2019;
    
     int flag = (year%400 == 0) || (year%4==0 && year%100!=0 ) ? 1 : 0;
    if (flag ==1)
    {
        System.out.println (year + " is a Leap Year");
    }
    else
    {
         System.out.println (year + " is not a Leap Year");
    }
  }
}