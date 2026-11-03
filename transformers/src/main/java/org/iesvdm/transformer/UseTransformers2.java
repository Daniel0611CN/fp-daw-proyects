package org.iesvdm.transformer;

import java.util.*;

public class UseTransformers2
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some words (all on one line, separated by spaces):");
        String line = input.nextLine();
        String[] words = line.split(" ");
        ArrayList<String> a = new ArrayList<String>();
        for(int i=0; i<words.length; i++)
            a.add(words[i]);
        System.out.println("The words are stored in an ArrayList: "+a);
        Transformer<String> hello = new HelloAdder();
        ArrayList<String> b=Transformers.applyConst(hello,a);
        System.out.println("Adding \"hello\" to the words gives: "+b);
    }

}