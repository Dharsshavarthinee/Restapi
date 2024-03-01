package com.example.day1.cw5;

public class Student{
    String studentName;
    String message;
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Student(String studentName, String message) {
        this.studentName = studentName;
        this.message = message;
    }
}

