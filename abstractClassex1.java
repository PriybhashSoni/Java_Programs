package learningEX;

import javax.swing.AbstractAction;

public abstract class abstractClassex1 {
    public String fname="John";
    public int age=63;
    public abstract void study();
}
    class student extends abstractClassex1
    {
        public int GraduationYear=2018;
        public void study()
        {
            System.out.println("Study all along day");

        }
    }

    class second{ 

    public static void main(String[] args) {
     student st=new student();
        System.out.println("name is "+st.fname);
        System.out.println("age is "+st.age);
        System.out.println("graduation year is "+st.GraduationYear);
            st.study();
    }
    }

