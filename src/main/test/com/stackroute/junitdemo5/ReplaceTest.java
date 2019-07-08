package com.stackroute.junitdemo5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReplaceTest {
    Replace rp;
    @Before
    public void setup()
    {
        rp=new Replace();
    }
@After
    public void teardown()
{
    rp=null;
}
@Test
    public void testinput()
{
    List<String> result=rp.replace("i am pranitha",2,"pushpita");
    List<String> h=new ArrayList<String>();
    h.add("i");
    h.add("am");
    h.add("pushpita");
    assertEquals(h,result);
}
}