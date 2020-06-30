package com.demo1;

import java.util.Calendar;

public class demo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        int year =  calendar.get(Calendar.YEAR);
        int month =  calendar.get(Calendar.MONTH) + 1;
        int date =  calendar.get(Calendar.DATE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
    }
}
