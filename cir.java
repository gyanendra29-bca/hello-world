// write program a to print the area of the circle from user input.
import java.util.*;
public class cir{
    public static void main(String[] args) {
         float area;
         float r;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the radius:");
         r=sc.nextFloat();
         area=(22/7)*r*r;
         System.out.println("area of the circle="+area);
    }
}

