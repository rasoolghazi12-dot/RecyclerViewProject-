package com.example.studentlist;

public class StudentModel {

    String name, rollNo, course;

    public StudentModel(String name, String rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getCourse() {
        return course;
    }
}
