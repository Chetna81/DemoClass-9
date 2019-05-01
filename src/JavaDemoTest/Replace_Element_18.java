package JavaDemoTest;

import java.util.ArrayList;

public class Replace_Element_18
   {
    //program to replace a particular element in an arrayList with the given element
    //java main method
    public static void main(String [] args)
    {
        //create object
        ArrayList<String> colours = new ArrayList<>();

        //create colour list
        colours.add("Pink");
        colours.add("Green");
        colours.add("Blue");
        colours.add("White");
        colours.add("Yellow");

        //now to replace yellow with purple
        System.out.println("arrayList before replace" + colours);

        //index no 2 where we need replace
        colours.set(2,"purple");

        System.out.println("ArrayList after replace" + colours);
    }
   }
