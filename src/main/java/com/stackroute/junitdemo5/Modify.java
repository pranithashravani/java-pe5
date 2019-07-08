package com.stackroute.junitdemo5;

import java.util.Map;

public class Modify {
    public String modify(Map<String,String> map)
    {
        if (map == null) {
            return null;
        }
        //assigning value and replacing it with value2
        String val1 = map.get("val1");
        map.replace("val2", val1);
        map.replace("val1", " ");
        return map.toString();
    }
}
