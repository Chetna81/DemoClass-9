package JavaDemoTest;

import java.util.ArrayList;

public class My_Array_List_Clone_14
   {
       //clone array list
       //java main method
       public static void main(String [] args )
       {
           ArrayList<String> arr1 = new ArrayList<String>();
           //adding elements to the end
           arr1.add("Red");
           arr1.add("Green");
           arr1.add("Black");
           arr1.add("White");
           arr1.add("Pink");

           System.out.println("Actual ArrayList:" + arr1);

           ArrayList<String> copy = (ArrayList<String>) arr1.clone();

           System.out.println("Cloned ArrayList : " +copy);

       }
   }
