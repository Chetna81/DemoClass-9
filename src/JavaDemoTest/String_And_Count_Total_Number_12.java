package JavaDemoTest;

import java.util.Scanner;

public class String_And_Count_Total_Number_12
      {
          // java program  to count number in a string.
          //java main method
      public static void main(String [] args )
      {
          String text;
          int countWords=0;
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter string: ");
          text = sc.nextLine();
          //word count
          for (int i=0; i<text.length()-1; i++)
          {
              if (text.charAt(i)==' ' && text.charAt(i+1)!=' ')
                  countWords++;
          }
          System.out.print(" Total number of words in string are:" + (countWords+1));
          //since last number does not contain and character after that
      }
      }
