package org.iesvdm.transformer;

import java.util.*;

public class UseTransformers4
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
        Transformer<String> numberer = new NumberAdder();
        ArrayList<String> b=Transformers.applyConst(numberer,a);
        System.out.println("Numbering the words gives: "+b);
        ((NumberAdder) numberer).reset();
        System.out.println("Enter some more words (all on one line, separated by spaces):");
        line = input.nextLine();
        words = line.split(" ");
        ArrayList<String> c = new ArrayList<String>();
        for(int i=0; i<words.length; i++)
            c.add(words[i]);
        ArrayList<String> d=Transformers.applyConst(numberer,c);
        System.out.println("Numbering these words gives: "+d);
    }

}

