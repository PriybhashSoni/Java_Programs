import java.util.Scanner;
class reversenum{
    public static void main(String args[])
    {
        int r,s,temp;
      Scanner sc=new Scanner(System.in)
        int n=sc.nextInt();

        
        r=n%10;
        temp = n/10;
        s = temp%10;
        n=n/100;
        
        System.out.print(r+""+s+""+n);

    }
}
