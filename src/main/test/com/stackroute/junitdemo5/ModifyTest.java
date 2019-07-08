package com.stackroute.junitdemo5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyTest {
    Modify obj;
    @Before
    public void setup()
    {
        obj=new Modify();
    }
@After
    public void teardown()
{
    obj=null;
}
@Test
    public void testinputstring()
{
    String expected="{val2=java, val1= }";
    Map<String, String> map=new HashMap<>();
    map.put("val1","java");
    map.put("val2","c++");
    String actual=obj.modify(map);
    assertEquals(expected,actual);

}
    @Test
    public void testinputnumbers()
    {
        String expected="{val2=9, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","9");
        map.put("val2","10");
        String actual=obj.modify(map);
        assertEquals(expected,actual);

    }
    @Test
    public void testinputstringanddigit()
    {
        String expected="{val2=prani, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","prani");
        map.put("val2","9");
        String actual=obj.modify(map);
        assertEquals(expected,actual);

    }
    @Test
    public void testinputnull()
    {
        String expected="{val2= , val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1"," ");
        map.put("val2"," ");
        String actual=obj.modify(map);
        assertEquals(expected,actual);

    }
    @Test
    public void testinputspecial()
    {
        String expected="{val2= @, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1"," @");
        map.put("val2"," %");
        String actual=obj.modify(map);
        assertEquals(expected,actual);

    }
}