/*write a program which enter the any integer than calculate and print its squre and cube
  if number is less than 5 you can print cube of the given number otherwise
   print squre of the number*/
import java.util.*;
class power//question 24
{
    public static void main(String args[]) 
    {
      int a;
      System.out.println("enter the value of a");
      Scanner sc =new Scanner(System.in);
      a=sc.nextInt();
      if(a<=5)
      {
        int c=a*a*a;
        System.out.println("cube of  "+c);
      }  
      else
      {
        int c=a*a;
        System.out.println("squre of "+c);
      }
    }
}