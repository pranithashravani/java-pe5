package com.stackroute.junitdemo5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreaterthantwoTest {
    Greaterthantwo obj;
    @Before
    public void setup()
    {
        obj=new Greaterthantwo();
    }
@After
    public void teardown()
{
    obj=null;
}
//taking characters
@Test
    public void testinputstring()
{
    String result=obj.count("a,a,a,b,c,d");
    assertEquals("{a=true, b=false, c=false, d=false}",result);


}
//taking numbers
    @Test
    public void testinputstringnumbers()
    {
        String result=obj.count("1,1,1,1,1,2,9");
        assertEquals("{1=true, 2=false, 9=false}",result);


    }
    //taking words
    @Test
    public void testinputstringwords()
    {
        String result=obj.count("abc,abc,def,deg");
        assertEquals("{abc=true, def=false, deg=false}",result);


    }
    //taking null
    @Test
    public void testinputstringnull()
    {
        String result=obj.count(" ");
        assertEquals("{ =false}",result);


    }

}