package learningEX;

public class constructorParameter {
    int x;
    public constructorParameter(int y)//creating constructor
    {
          x=y;
    }
    public static void main(String[] args) {
        constructorParameter sp=new constructorParameter(5);
        System.out.println(sp.x);
    }
}
