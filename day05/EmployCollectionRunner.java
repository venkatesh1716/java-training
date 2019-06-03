package com.trimindtech.training.day05;

import java.util.HashSet;
import java.util.Set;

public class EmployCollectionRunner {
    public static void main(String[] args) {
       /* EmployCollection emp = new EmployCollection("employee1", 1001, 10000);
        EmployCollection emp1 = new EmployCollection("employee2", 1002, 10000);
        EmployCollection emp2 = new EmployCollection("employee3", 1003, 10000);
        EmployCollection emp4 = new EmployCollection("employee3", 1003, 10000);
        List<EmployCollection> empList = new ArrayList<>();
        empList.add(emp);
        empList.add(emp1);
        empList.add(emp2);
        for (EmployCollection list : empList)
        {
            System.out.println(list);
        }
        boolean retval = empList.contains(emp4);
        System.out.println(retval);*/
        Set<String> set = new HashSet<>();

        EmployCollection emp1 = new EmployCollection("employee2", 1002, 10000);
        EmployCollection emp2 = new EmployCollection("employee3", 1003, 10000);
        EmployCollection emp3 = new EmployCollection("employee3", 1003, 10000);
        EmployCollection emp4 = new EmployCollection("employee3", 1003, 10000);
        System.out.println(set.toString());

        for (String std:set){
            System.out.println(std);
        }



    }

}

