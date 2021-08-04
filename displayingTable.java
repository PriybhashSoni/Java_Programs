package Miscellaneous;

import java.util.Scanner;

public class displayingTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want to display : ");
        int n=sc.nextInt();
        int x=0;
         lfr(int i=1;i<=10;i++)
         {
              x=n*i;
              System.out.println(n+" x "+i+ " is "+x);
         }
    
      // System.out.println(n+"X 1 is "+n*1);
      // System.out.println(n+"X 2 is "+n*2);
      // System.out.println(n+"X 3 is "+n*3);
      // System.out.println(n+"X 4 is "+n*4);
      // System.out.println(n+"X 5 is "+n*5);
      // System.out.println(n+"X 6 is "+n*6);
      // System.out.println(n+"X 7 is "+n*7);
      // System.out.println(n+"X 8 is "+n*8);
     
    }
}
