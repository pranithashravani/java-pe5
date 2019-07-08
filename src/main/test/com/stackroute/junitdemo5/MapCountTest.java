package com.stackroute.junitdemo5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapCountTest {
    MapCount map;
    @Before
    public void setup()
    {
        map=new MapCount();
    }
    @After
    public void teardown()
    {
        map=null;
    }
    @Test
    public void testinputwithstring()
    {
        Map<String,Integer> mp=new HashMap<String, Integer>();
        Map<String,Integer> result=map.count("one_one");
        mp.put("one",2);


        assertEquals(mp,result);

    }
    @Test
    public void testinputwithstring1()
    {
        Map<String,Integer> mp=new HashMap<String, Integer>();
        Map<String,Integer> result=map.count("one_one@two!two#three");
        mp.put("one",2);
        mp.put("two",2);
        mp.put("three",1);


        assertEquals(mp,result);

    }
}