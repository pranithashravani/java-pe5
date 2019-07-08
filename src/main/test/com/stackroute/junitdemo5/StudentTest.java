package com.stackroute.junitdemo5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testinput()
    {
        List<Student> stu=new ArrayList<>();
        Student stu1 = new Student(1, "Anuha", 27);
        Student stu2 = new Student(2, "Swarna", 33);
        Student stu3 = new Student(3, "Swarnabharathi", 21);

        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);
        Collections.sort(stu,new StudentSorter());

String expected="[Student{id=2, name='Swarna', age=33}, Student{id=1, name='Anuha', age=27}, Student{id=3, name='Swarnabharathi', age=21}]";
assertEquals(expected,stu.toString());
    }
    @Test
    public void testinputsecond()
    {
        List<Student> stu=new ArrayList<>();
        Student stu1 = new Student(1, "Anuha", 2);
        Student stu2 = new Student(2, "bharathi", 3);
        Student stu3 = new Student(3, "CHANDANA", 1);

        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);
        Collections.sort(stu,new StudentSorter());

        String expected="[Student{id=2, name='bharathi', age=3}, Student{id=1, name='Anuha', age=2}, Student{id=3, name='CHANDANA', age=1}]";
        assertEquals(expected,stu.toString());
    }

}