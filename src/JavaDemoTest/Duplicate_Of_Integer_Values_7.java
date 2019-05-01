package JavaDemoTest;

import java.util.Scanner;

public class Duplicate_Of_Integer_Values_7
      {
      //wap to find the duplicate values of an array integer values
      //java main method
      public static void main(String [] args)
      {
          Scanner s = new Scanner(System.in);

          System.out.println("Enter no.of elements you want in array:");

          int n = s.nextInt();
          int a[] = new int[n];

          System.out.println("Enter all the elements:");

          //int = i
          for (int i = 0; i < n; i++)
          {
              a[i] = s.nextInt();
          }
          System.out.println("Array elements:" );
          for (int i = 0; i < a.length; i++)
          {
              System.out.println(a[i] + ",");
          }
          System.out.println();

          int dup = a[0];

          for (int i = 0; i < a.length; i++)
          {
              for (int j = i+1; j <a.length; j++)
              {

                  if (a[i]==(a[j]))
                  {
                      System.out.println(a[j] +"Is duplicate elements in array:");
                  }
              }
          }
      }
      }




