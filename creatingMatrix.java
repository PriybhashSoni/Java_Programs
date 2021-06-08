package Array;

import java.util.Scanner;

public class creatingMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows ");
        int rows=sc.nextInt();
        System.out.println("enter number of columns ");
        int columns=sc.nextInt();

        int[][] arr=new int[rows][columns];
        System.out.println("enter elements of matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j]=sc.nextInt();
             }
        }
          //printing the matrix
          System.out.println("the matrix is ");
          for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
               System.out.println("\t"+arr[i][j]);
             }
    
            }
          System.out.println();    
          }
}
