package com.bootcamp.day2;

public class Student {
    public String name;
    public double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public void getInfo(){
        System.out.println("Student: " + name + " - Grade: " + grade);
    }
}
