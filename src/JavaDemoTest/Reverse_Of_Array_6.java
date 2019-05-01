package JavaDemoTest;

import java.util.Arrays;
import java.util.Stack;


public class Reverse_Of_Array_6
    {
        // Basic java program that reverses an array
       // java main method
        public static void main(String [] args )
        {
            Stack<Integer> stack = new Stack<Integer>();
            //int = num value
            int[] myArray ={25,24,14,36,56,39,52,49,21,55};
            int size = myArray.length;
            for (int i=0; i<size; i++){
             stack.push(myArray[i]);
            }
            int[] reverseArray = new int[size];
            for (int i=0; i<size; i++)
            {
                reverseArray[i] = stack.pop();
            }
            //printing the reversed
            System.out.println("Reversed array is::" + Arrays.toString(reverseArray));

        }


    }
