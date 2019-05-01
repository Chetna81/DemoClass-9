package JavaDemoTest;

import java.util.Arrays;
import java.util.HashSet;

public class Common_Elements_In_Arrays_8
  {
      //wap to find the common element between two arrays
      //java main method
    public static void main(String [] args )
    {
      //array string values array1
      String[] a1 = {"mango", "apple","kiwi", "orange", "banana", "cherry","apricots"};
      //array string values array2
      String[] a2 = {"mango","blackberry","fig","lemon","lime","grape","plum","peach","pear"};
      //printing the array1
      System.out.println("Array1 :"  +Arrays.toString(a1));
      //printing the array2
      System.out.println("Array2 :" +Arrays.toString(a2));

      HashSet<String> set = new HashSet<String>();
      //int = i
      for (int i = 0; i < a1.length; i++)
      {
        //int = j
        for (int j = 0; j < a2.length; j++)
        {
          if (a1[i].equals(a2[j]))
          {
            set.add(a1[i]);

          }
        }
      }
      //printing the common element
      System.out.println("Common element :" +(set));
    }
  }
