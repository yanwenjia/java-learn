package com.demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> aClass = Class.forName("com.demo2.Student");

//        Constructor<?> con = aClass.getConstructor(String.class, int.class, String.class);

        Constructor<?> con2 = aClass.getDeclaredConstructor(String.class);
        con2.setAccessible(true);
//        Object obj = con.newInstance("另请下", 30, "西安");
        Object o = con2.newInstance("林青霞");
        System.out.println(o);
//        System.out.println(obj);
    }
}
