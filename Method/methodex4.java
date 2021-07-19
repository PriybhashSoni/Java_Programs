package learningEX;

public class methodex4 {
    static void method(int x)
    {
        if(x<18)
        {
            System.out.println("access granted");
        }
        else
        {
            System.out.println("access denied");
        }
    
    }
    public static void main(String[] args) {
       method(20);
    } 
}
