package com.stackroute.junitdemo5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCount {
    //counting the words
    public Map<String,Integer> count(String str)
    {
        String[] arr=str.split("[_@!#$%&*]");
        Map<String,Integer> map= new HashMap<String,Integer>() ;
            for(int i=0;i<arr.length;i++)
            {
                //if word doesnt exist
                if(!map.containsKey(arr[i]))
                    map.put(arr[i],1);
                //if word already exists
                else
                {
                    int count=map.get(arr[i]);
                    map.put(arr[i],count+1);
            }
        }
            return map;
        }




}
