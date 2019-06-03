package com.trimindtech.training.day04;

public class StudentRunner {
    private static int a = 1;
    public StudentRunner(){
        System.out.println("object created with number"+" "+a);
        a++;
    }
    public static void main(String[] args) {
        StudentRunner std1 = new StudentRunner();
        StudentRunner std2 = new StudentRunner();
        StudentRunner std3 = new StudentRunner();


    }
}
