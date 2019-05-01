package JavaDemoTest;

public class String_Demo_13
    {
     //wap to enter ant String and count total number
     //java main method
     public static void main(String [] args )
     {
         //int word
         int word=1;
         //String value of number and spaces
         String str="banana mango lemon lime pear apple";

         for (int i=0; i<str.length(); ++i) {
             if (str.charAt(i) == ' ')
                 word++;
         }
         //printing the words
         System.out.print("Number of words="+word);
         //printing the spaces
         System.out.print("Number of spaces="+(word-1));
     }
     }
