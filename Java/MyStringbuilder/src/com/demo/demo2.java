package com.demo;

public class demo2 {
    public static void main(String[] args) {
        /*StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb.append("hello");
        System.out.println("sb:"+sb);
        System.out.println("sb2:"+ sb2);
        System.out.println(sb==sb2);*/

        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        sb.append("world ");
        sb.append(100);
        sb.append(200).append(300).append(4000);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
