package org.iesvdm.transformer;

public class HelloAdder implements Transformer<String>
{
    public String transform(String str)
    {
        return "Hello "+str;
    }
}
