import java.util.Scanner;

public class add2no {
   public static void main(String[] args) {
       int x,y,z;
       System.out.println("Enter Two numbers:");
       Scanner in= new Scanner (System.in);
       x=in.nextInt();
       y=in.nextInt();
       z=x+y;
       System.out.println("Sum of two no is : "+z);
   } 
}
