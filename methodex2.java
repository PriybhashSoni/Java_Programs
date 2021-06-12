package learningEX;

public class methodex2 {
    static void mymethod(String fname,int age)//passing arguments in method(multiple)
    {
       System.out.println("my name is "+fname+age);
    }
    public static void main(String[] args) {
        mymethod("shree ",4);
        mymethod("shree2 ",5);
        mymethod("shree1 ",7);
    }
}
