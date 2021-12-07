package Sorting.example;

import javax.lang.model.element.Element;

public class javaex1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,45,4};
        int num=43;
        boolean isarray=false;
        for(int element:arr)
        {
          if(num==element)
          {
              isarray=true;
              break;
          }
        }
        if(isarray)
        {
          System.out.println("element is present");
        }
        else
        {
            System.out.println("element is not present");
        }
    }
    
}
