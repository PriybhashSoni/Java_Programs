package Array;

public class arraysofArrays {
    public static void main(String[] args) {
        String[][] animals={{"ant","cat","dog"},{"tiger","lion","cheetah"},{"fish","shark","whale",},{"eagle","sparrow","pigeon"}};
        for(int i=0;i<animals.length;i++)
        {
            System.out.println(animals[i][0]+":");
            for(int j=1;j<=animals[i].length;j++)
            {
            System.out.println(animals[i][j]+" ");
            }
            System.out.println();
        }


    }
}
