package com.trimindtech.training.day05;

public class Student {
    private  String StudentId;
    private  String StudentName;

    public Student(String studentId, String studentName) {
        StudentId = studentId;
        StudentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                '}';
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    @Override
    public boolean equals(Object obj){
        Student student = (Student) obj;
        boolean nameMatched = this.getStudentName().equals(student.getStudentName());
        boolean iDMatched = this.getStudentId().equals(student.getStudentId());
        return  nameMatched && iDMatched;

    }
}
