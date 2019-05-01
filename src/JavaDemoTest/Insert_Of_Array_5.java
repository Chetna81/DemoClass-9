package JavaDemoTest;

import java.util.Scanner;

public class Insert_Of_Array_5
   {
    //wep to insert an element specific position in to array
    //java main method
    public static void main(String [] args)
    {
        int n, pos, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of element you want in array:");
        n = sc.nextInt();
        int a[] = new int[n+1];
        System.out.print("Enter all the element:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        //enter the specific position
        System.out.print("Enter the position where you want to insert element:");
        pos = sc.nextInt();
        //enter the insert
        System.out.print("Enter the element you want to insert:");
        x = sc.nextInt();
        //int i
        for (int i = (n-1); i>=(pos-1); i--)
        {
            a[i+1] = a[i];
        }
        //position x
        a[pos-1] = x;
        //String is after inserting
        System.out.print("After inserting");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
          System.out.print(a[n]);
       }
       }
