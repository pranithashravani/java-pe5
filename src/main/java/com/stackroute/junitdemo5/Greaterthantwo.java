package com.stackroute.junitdemo5;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Greaterthantwo {
    //counting the words
    public String count(String str) {
        String[] arr = str.split(",");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i]))
                map.put(arr[i], 1);
            else {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            }
        }
//returning true or false

        Map<String, Boolean> define = new HashMap<>();
        for (String each : map.keySet()) {
            if (map.get(each) >= 2) {
                define.put(each, true);
            } else {
                define.put(each, false);
            }
        }
        return define.toString();

    }
}
