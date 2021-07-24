package Formula;

import java.util.Scanner;

public class ceciusToFarehneit {
    public static void main (String args[])  
    { float Fahrenheit, Celsius;  
        Scanner sc= new Scanner(System.in) ;
       System.out.println("enter temp in celcius");
        Celsius= sc.nextFloat();  
          Fahrenheit =((Celsius*9)/5)+32;  
          System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
    }  
}
