package Mathematics;

import java.util.Scanner;

public class lengthofHypotenese {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   System.out.println("enter side1 and side2");
    int side1=sc.nextInt(),side2=sc.nextInt();
    System.out.println("length of hypotenese is : "+Math.hypot(side1, side2));
   }
    
}
