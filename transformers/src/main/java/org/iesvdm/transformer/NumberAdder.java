package org.iesvdm.transformer;

public class NumberAdder implements Transformer<String>
{
    int number;

    public void reset()
    {
        number=0;
    }

    public String transform(String str)
    {
        number++;
        return number+") "+str;
    }
}

