package com.demo1;

import java.io.File;

public class demo {
    public static void main(String[] args) {
        File f1 = new File("E:\\java\\java.txt");
        System.out.println(f1);

        File f2 = new File("E:\\Java", "Java.txt");
        System.out.println(f2);

        File f3 = new File("E:\\Java");
        File f4 = new File(f3, "java.txt");
        System.out.println(f4);
    }
}
