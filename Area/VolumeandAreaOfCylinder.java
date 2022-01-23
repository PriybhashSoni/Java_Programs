package Area;
import java.util.Scanner;

public class VolumeandAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pi=3.14;
        System.out.println("enter r and h");
        double r=sc.nextDouble();
        double h=sc.nextDouble();
        double area=2*pi*r*(r+h);
        double volume=pi*r*r*h;
        System.out.println("Vol is "+volume+" area is "+area);
    }
}
