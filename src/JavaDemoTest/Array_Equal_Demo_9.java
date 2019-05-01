package JavaDemoTest;

import java.util.Arrays;

public class Array_Equal_Demo_9
  {
      //wap to test the equality of two arrays
      //java main method
      public static void main(String [] args)
      {
       //let us create different integers arrays
       int[] array1 = new int[]{2,3,4,5,6,7};

       int[] array2 = new int[]{2,3,4,5,6,7};

       int[] array3 = new int[]{4,5,6,7,8,9};

       System.out.println("is array1 equals to array2 : " + Arrays.equals(array1,array2));

       System.out.println("is array1 equals to array3 : " + Arrays.equals(array1,array3));
      }
  }
