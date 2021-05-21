package Area;

import java.util.Scanner;
import java.lang.Math;
class areaOfCircle{
    public static void main(String[] args) {
        System.out.println("Enter radius of Circle");
        Scanner sc=new Scanner (System.in);
        float r=sc.nextInt();
        double area=Math.PI*r*r;
        System.out.println("area of circle is :"+area);
    }
}