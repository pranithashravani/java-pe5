package com.stackroute.junitdemo5;

import java.util.ArrayList;
import java.util.TreeSet;

public class Sort {
    public ArrayList<String> sort(String str)
    {
        //by using treeset it is already sorted
        TreeSet<String> test=new TreeSet<String>();
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            test.add(arr[i]);
        }
        ArrayList<String> a=new ArrayList<String>(test);
        return a;
    }
}
