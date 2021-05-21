package Area;

import java.util.Scanner;

public class areaofSquare {
  public static void main(String[] args) {
      System.out.println("enter the side of square");
    Scanner in =new Scanner(System.in);
    int side=in.nextInt();
    int area=side*side;
    System.out.println("area is "+area);
   
    }  
}
