package learningEX;

public class ststicVSNonStatic {
    static void method()
    {
        System.out.println("hii everyone");
    }
    public void mymethod()
    {
        System.out.println("namaste");
    }
    public static void main(String[] args) {
        //method();
        ststicVSNonStatic sp=new ststicVSNonStatic();
        sp.mymethod();
        sp.method();
    }
}
