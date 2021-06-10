package Number;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print its factorial : ");
        int x=sc.nextInt();
        int n=0;
        double fac=1;
        for(int i=1;i<=x;i++)
        {
            fac=i*fac;
            
        }
        System.out.println("the factorial of "+x+" is "+fac);
    }
}
