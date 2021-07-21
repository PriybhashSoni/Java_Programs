package learningEX;

public class addingNumberUsingReccurssion {
    static int method(int n)
    {
        if(n>0)
        {
            return n+method(n-1);
        }
        else{
            return 0;
        }

        }
        public class Class{
           int x;
           
        
        public static void main(String[] args) {
            System.out.println(method(10));
    }
}
}
