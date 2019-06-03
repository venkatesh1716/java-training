package com.trimindtech.training.day05;

import java.util.HashSet;
import java.util.Set;

public class StudentListRunner {

    public static void main(String[] args) {
       /* List<String> student = new ArrayList<String>();
        student.add("vicky");
        student.add("john");
        student.add("hales");
        student.add(1, "james");
        for (String s : student) {
            System.out.println(s);
        }*/
        Set<String> student = new HashSet<String>();
        System.out.println("enter values without duplicates");
        student.add("viky");
        student.add("james");
        student.add("Hales");
        student.add("jones");
        for(String st:student){
            System.out.println(st);
        }
    }
}



