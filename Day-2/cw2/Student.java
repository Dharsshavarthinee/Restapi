package com.example.day2.cw2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    
    @JsonProperty("Student created")
    String name;
    @JsonProperty("Age")
    int age;
    

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    

}
