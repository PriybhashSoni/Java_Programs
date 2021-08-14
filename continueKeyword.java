package Loops;

public class continueKeyword {
    public static void main(String[] args) {
        int n[]={10,20,30,40,50,60};
        for(int x:n)
        {
            if(x=40)
            {
                continue;
            }
            System.out.println(x);
        }
}
}
