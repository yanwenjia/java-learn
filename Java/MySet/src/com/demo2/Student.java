package com.demo2;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    @Override
    public int compareTo(Student o) {
        //大于0 升序
        //小于0 降序
        //等于0 不存储
//        return 0;
        System.out.println(this.name.compareTo(o.name));
        int ageDis = this.age - o.age;
        return ageDis == 0?this.name.compareTo(o.name):ageDis;
//        System.out.println();
//        return this.getAge() - o.getAge();
    }
}
