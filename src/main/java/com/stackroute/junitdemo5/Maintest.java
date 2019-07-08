package com.stackroute.junitdemo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Maintest {
    public static String implementer(ArrayList<Student> students) {


        Comparator<Student> comparator = new StudentSorter();
        Collections.sort(students,comparator);

        return students.toString();
    }
}