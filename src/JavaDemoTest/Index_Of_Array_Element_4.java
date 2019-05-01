package JavaDemoTest;

import java.util.Scanner;

public class Index_Of_Array_Element_4
     {
         //program to find the index of an array element
         //java main method
         public static void main(String [] args )
         {

             Scanner s = new Scanner(System.in);
             // String value in num
             System.out.println("Enter the number 10,15,18,25,35 or 78 to find it is index:");

             int n=s.nextInt();
             //create int num value
             int a[]={10,15,18,25,35,78};

             for (int i = 0; i<a.length; i++)
             {
                 if(a[i]==n)
                 {
                     //string is on array index number
                     System.out.println(a[i]+ "is on array index number" + i);
                     break;
                 }
             }


         }
     }


