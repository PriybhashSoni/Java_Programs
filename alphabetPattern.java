package Pattern;

import java.util.Scanner;

public class alphabetPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of lines ");
        int lines=sc.nextInt();
        char ch='A';
       // int ch=1;
        for(int i=1;i<=lines;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(""+ch);

            }
            System.out.println();
            ch++;//this will increment chracter
        }
    }
}
