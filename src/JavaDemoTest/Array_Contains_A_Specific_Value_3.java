package JavaDemoTest;

import java.util.Scanner;

public class Array_Contains_A_Specific_Value_3
   {
       //wap to test if an array contains a specific value
       // java main method
       public static void main(String [] args )
       {
           Scanner scanner = new Scanner(System.in);

           System.out.println("Please enter any value:");

           int n = scanner.nextInt();
           //int a[] = value
           int a[] ={10,15,25,30,35};

           if(a[0] == n || a[1] == n || a[2] == n || a[3] == n || a[4] == n)
           {
               //string value is array
               System.out.println("Input Value is in Array");
           }
           else
           {
               //string value is not array
               System.out.println("Input value is not in Array");

           }
       }
   }
