package com.demo3;

import java.util.Calendar;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        int res = getDays(year);
        System.out.println(res);

    }
    public static int getDays(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, 2, 1);
        calendar.add(Calendar.DATE,-1);
        int days = calendar.get(Calendar.DATE);
        return days;
    }

}
