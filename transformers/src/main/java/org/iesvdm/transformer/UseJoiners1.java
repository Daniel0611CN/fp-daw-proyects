package org.iesvdm.transformer;

import java.util.Scanner;

public class UseJoiners1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        LispList<Integer> ls1,ls2,ls3;
        System.out.print("Enter a list (of integers): ");
        String str = in.nextLine();
        ls1 = parseIntLispList(str);
        System.out.print("Enter another list (of integers): ");
        str = in.nextLine();
        ls2 = parseIntLispList(str);
        Joiner<Integer> adder = new JoinByAdding();
        ls3 = Joiners.zipLists(adder,ls1,ls2);
        System.out.println("Adding corresponding integers in the lists gives:\n"+ls3);
    }

    public static LispList<Integer> parseIntLispList(String str)
    {
        String line = str.trim();
        String contents = line.substring(1,line.length()-1).trim();
        if(contents.length()==0)
            return LispList.empty();
        String[] nums = contents.split(",");
        LispList<Integer> list = LispList.empty();
        for(int i=nums.length-1; i>=0; i--)
        {
            String num = nums[i].trim();
            list = list.cons(Integer.parseInt(num));
        }
        return list;
    }

}
