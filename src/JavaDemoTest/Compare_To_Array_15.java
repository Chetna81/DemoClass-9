package JavaDemoTest;

import java.util.ArrayList;

public class Compare_To_Array_15
     {
     // java main method
     public static void main(String [] args )
     {
     // array list string
           ArrayList<String> c1= new ArrayList<String>();
           c1.add("Red");
           c1.add("Green");
           c1.add("Black");
           c1.add("White");
           c1.add("Pink");

           ArrayList<String> c2= new ArrayList<String>();
           c2.add("Red");
           c2.add("Green");
           c2.add("Black");
           c2.add("Pink");
     // storing the comparison output in arrayList<String>
          ArrayList<String> c3 = new ArrayList<String>();
          for (String e : c1)
              c3.add(c2.contains(e) ? "Yes" : "No");
          System.out.println(c3);
     }
     }
