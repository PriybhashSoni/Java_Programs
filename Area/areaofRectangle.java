package Area;

import java.util.Scanner;

public class areaofRectangle {
    public static void main(String[] args) {
        System.out.println("enter l and b");
        Scanner in= new Scanner(System.in);
        int l=in.nextInt();
        int b=in.nextInt();
        int z=l*b;
        System.out.println("area is "+z);
    }
    
}
