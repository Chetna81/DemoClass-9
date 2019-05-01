package JavaDemoTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_0r_Not_16
  {
      //program check to whether the given element is present ArrayList or not
      //java main method
      public static void main(String [] args ) {
          List aList = new ArrayList();
          aList.add("A");
          aList.add("B");
          aList.add("C");
          aList.add("D");
          aList.add("E");

          if (aList.contains("C"))
              System.out.println("The element C is available in the ArrayList");

          else
              System.out.println("The element C is not available in the ArrayList");

          if (aList.contains("H"))
              System.out.println("The element H is available in the ArrayList");

          else
              System.out.println("The element H is not available in the ArrayList");
      }
      }
