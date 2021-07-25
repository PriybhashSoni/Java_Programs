package Number;

import java.util.Scanner;

public class reverseAnumber {
    public static void main(String[] args) {
        int reverse=0,number=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no to reverse");
        number=sc.nextInt();
        sc.close();
        while(number!=0)
        {
            reverse=(reverse*10)+(number%10);
            number=number/10;
        }
        System.out.println("result:"+reverse);
    }
}
