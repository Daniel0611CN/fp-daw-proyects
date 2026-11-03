package org.iesvdm.transformer;

public class TenTimes implements Transformer<Integer>
{
    public Integer transform(Integer n)
    {
        return n*10;
    }
}
