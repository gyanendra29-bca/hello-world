//Addition of two numbers from user input.
import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        int a,b,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integer :");
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println(a+" + "+b+" = "+sum);

    }
    
}
