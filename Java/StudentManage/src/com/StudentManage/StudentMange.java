package com.StudentManage;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMange {
    public static void main(String[] args) {
        ArrayList<Student> studentsArr = new ArrayList<>();
        int ch = choose();
        manage(studentsArr, ch);
    }

    public static void manage(ArrayList<Student> array, int type) {
        switch (type) {
            case 1:
                addStudeng(array);
                break;
            case 2:
                delStudent(array);
                break;
            case 3:
//                addStudeng(array);
                break;
            case 4:
                viewStudent(array);
                break;
            case 5:
//                addStudeng(array);
                System.exit(0);
                break;
        }
        if (type != 5){
            int ch = choose();
            manage(array, ch);
        }
    }

    public static int choose() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------欢迎来到学生管理系统------");
        System.out.println("请输入选项：");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看所有学生");
        System.out.println("5.退出");
        int choo = sc.nextInt();
        return choo;
    }

    public static void addStudeng(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生年纪：");
        int grade = sc.nextInt();
        Student s = new Student(name, age, grade);
        array.add(s);
    }

    public static void delStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的姓名：");
        String name = sc.nextLine();
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("没有这个学生！");
        } else {
            array.remove(index);
        }
    }

    public static void viewStudent(ArrayList<Student> array) {
        System.out.print("姓名\t\t年龄\t\t年级");
        System.out.println();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.print(s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getGrade());
            System.out.println();
        }
    }
}
