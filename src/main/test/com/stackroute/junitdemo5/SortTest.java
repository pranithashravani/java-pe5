package com.stackroute.junitdemo5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortTest {
    Sort srt;
    @Before
    public void setup()
    {
         srt=new Sort();
    }
    @After
    public void teardown()
    {
        srt=null;
    }
    @Test
    public void testinputString()
    {
        ArrayList<String> result=srt.sort("Apple Zuzube Canada");
        ArrayList<String> h=new ArrayList<String>();
        h.add("Apple");
        h.add("Canada");
        h.add("Zuzube");
        assertEquals(h,result);
    }
    @Test
    public void testinputWordsanddigits()
    {
        ArrayList<String> result=srt.sort("Apple 2 C");
        ArrayList<String> h=new ArrayList<String>();
        h.add("2");
        h.add("Apple");
        h.add("C");

        assertEquals(h,result);
    }
    @Test
    public void testinputNumbers()
    {
        ArrayList<String> result=srt.sort("3 6 1");
        ArrayList<String> h=new ArrayList<String>();
        h.add("1");
        h.add("3");
        h.add("6");
        assertEquals(h,result);
    }
    @Test
    public void testinputSpecialCharacters()
    {
        ArrayList<String> result=srt.sort("Apple @ Canada");
        ArrayList<String> h=new ArrayList<String>();
        h.add("@");
        h.add("Apple");
        h.add("Canada");

        assertEquals(h,result);
    }
    @Test
    public void testinputnull()
    {
        ArrayList<String> result=srt.sort("");
        ArrayList<String> h=new ArrayList<String>();
        h.add("");

        assertEquals(h,result);
    }

}