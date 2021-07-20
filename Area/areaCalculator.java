package Area;

import java.util.Scanner;

public class areaCalculator {
    float l,b,side,base,height,var,areaR,areaS,areaT;
    double r,areaC;

    public static void main(String[] args) {
        areaCalculator ac=new areaCalculator();
        ac.option();
    }
    public void option()
    {
        System.out.println("Enter the object of which area is to be calculated \n 1.Rectangle\n 2.Square \n 3.Triangle \n 4.Circle");
        Scanner sc=new Scanner (System.in);   
        var=sc.nextFloat();
        if(var==1)
        {
            System.out.println("enter length and breath of rectangle");
            l=sc.nextFloat();
            b=sc.nextFloat();
            areaR=l*b;
            System.out.println("area is :"+areaR);
        }
        else if(var==2)
        {
            System.out.println("enter side of square");
            side=sc.nextFloat();
            areaS=side*side;
            System.out.println("area is : "+areaS);
        }
        else if(var==3)
        {
            System.out.println("enter base and height of triangle");
            base=sc.nextFloat();
            height=sc.nextFloat();
            areaT=1/2f*base*height;
            System.out.println("area is :"+areaT);
        }
        else if(var==4)
        {
            System.out.println("enter radius of circle");
            r=sc.nextFloat();
           
            areaC=3.14*r*r;
            System.out.println("area is :"+areaC);
        }
        option();
    }
       
   
    }

