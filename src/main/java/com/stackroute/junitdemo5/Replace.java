package com.stackroute.junitdemo5;

import java.util.ArrayList;
import java.util.List;

public class Replace {
    public List<String> replace(String str,int index,String s)
    {
        //replacing by splitting with given index
        List<String> l=new ArrayList<String>();
        String[] another=str.split(" ");
        for(int i=0;i<another.length;i++) {
            l.add(another[i]);
        }
            l.set(index, s);
        return l;
    }
}
