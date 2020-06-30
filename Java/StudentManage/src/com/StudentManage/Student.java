package com.StudentManage;

public class Student {
    private String name;
    private int age;
    private int grade;

    public Student(){}
    public Student(String name,int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
