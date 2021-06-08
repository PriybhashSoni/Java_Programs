package Array;

import java.util.Scanner;

public class basicArrayex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
       int size=sc.nextInt();
       int[] arr=new int[size];
       System.out.println("enter elements of array");
       for(int i=0;i<size;i++)
       {
          arr[i]=sc.nextInt();
       }
       System.out.println("elements in the array are ");
       for(int i=0;i<size;i++)
       {
       System.out.println(arr[i]);
       }
    }
}
