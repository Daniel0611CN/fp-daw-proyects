package org.iesvdm.transformer;

import java.util.*;

public class UseTransformers1
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some numbers (all on one line, separated by spaces):");
        String line = input.nextLine();
        String[] numbers = line.split(" ");
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++)
            a.add(new Integer(numbers[i]));
        System.out.println("The numbers are stored in an ArrayList: "+a);
        Transformer<Integer> trans = new TenTimes();
        ArrayList<Integer> b=Transformers.applyConst(trans,a);
        System.out.println("Multiplying the contents by 10 gives: "+b);
    }

}

