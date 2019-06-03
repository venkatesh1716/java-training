package com.trimindtech.training.day05;

public class StudentRunner {

    public static void main(String[] args) {
        Student student1 = new Student("001", "std1");
        Student student2 = new Student("002", "std2");
        Student student3 = new Student("003", "std3");
        Student student4 = new Student("123", "std34");

        Student[] students = {student1, student2, student3 };
        System.out.println(studentExists(students, student4));
    }
    public static boolean studentExists(Student[] existingStudents,Student newstudent) {
        for (Student student :existingStudents) {
            if (student.equals(newstudent)){
                return true;
            }
        }
        return false;
    }
        /*Student[] studentA = new Student[4];
        studentA[0] = new Student(123,"venkatesh");
        studentA[1] = new Student(001,"james");
        studentA[2] = new Student(002,"jones");*/
    }

