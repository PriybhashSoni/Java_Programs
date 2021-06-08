package Array;
import java.util.*;
public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter # no of rows");
        int rows=sc.nextInt();
        System.out.println("enter # no of columns");
        int columns=sc.nextInt();
        int[][] a=new int[rows][columns];//a syntax of multidensional array
        System.out.println("enter "+rows+"X"+columns+"="+(rows*columns)+" integers: ");
        for(int i=0;i<rows;i++)             
        {
            for(int j=0;j<columns;j++)         //using loop for taling inputs
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Here ar those 6 integers in a "+rows+"X"+columns+"2D ARRAY :");
       System.out.println(Arrays.deepToString(a));//. This method is designed for converting multidimensional arrays to strings.
    }
}
