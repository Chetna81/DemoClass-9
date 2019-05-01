package JavaDemoTest;

import java.util.Arrays;

public class Numeric_And_String_Array_1
     {
      //wap to sort a numeric array and a string array.
      //java main method
         public static void main(String [] args )
      {
      //m1= int values
      int[] m1 = {20,13,40,41,60,12};

      //string values
      String[] m2 = {"raj", "amit", "vijay", "ketan", "malay"};
      System.out.println("numeric array:" + Arrays.toString(m1));

      //m1 method
      Arrays.sort(m1);
      System.out.println("Sorted numeric array:"+ Arrays.toString(m1));

      //m2 string method
          System.out.println("String array:"+ Arrays.toString(m2));
          Arrays.sort(m2);

      System.out.println("Sorted array:" + Arrays.toString(m2));
      }
      }
