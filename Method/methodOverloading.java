package learningEX;
public class methodOverloading {
    static int mymethod(int x, int y)
    {
        return x+y;

    }
    static double mymethod(double x, double y)
    {
        return x+y;

    }
    static float mymethod(float x, float y)
    {
        return x+y;

    }
  public static void main(String[] args) {
      System.out.println(mymethod(2, 4)); 
      System.out.println(mymethod(2.23, 4.343)); 
      System.out.println(mymethod(2.32456, 4.325)); 
    
  }  
}
