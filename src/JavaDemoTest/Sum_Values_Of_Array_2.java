package JavaDemoTest;

public class Sum_Values_Of_Array_2
     {
     //wap to sum values of array
     //java main method
     public static void main(String [] args )
     {
     //int sum values array
     int my_array[] = {1,2,3,4,5,6,7,8,9,10};
     int sum = 0;

     for (int i : my_array)
         sum += i;
     //string method sum
     System.out.println("The sum is" + sum);
     }
     }
