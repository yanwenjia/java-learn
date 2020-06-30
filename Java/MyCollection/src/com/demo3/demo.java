package com.demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<>();

        Student s1 = new Student("老马",30);
        Student s2 = new Student("老凯",33);

        c.add(s1);
        c.add(s2);

        Iterator it = c.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
