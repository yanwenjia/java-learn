package com.demo;

public class demo3 {
    public static void main(String[] args) {
        // Strinbuilder 砖 string toString
        StringBuilder sb = new StringBuilder();
        String s = sb.toString();
        // string 转 stringBuilder
        String str = "hello";
        StringBuilder sb2 = new StringBuilder(str);
        System.out.println(sb2);
    }
}
