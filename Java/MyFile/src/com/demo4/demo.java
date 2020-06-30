package com.demo4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class demo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<>();

        array.add("Hello");
        array.add("World");
        array.add("Java");

        BufferedWriter BW = new BufferedWriter(new FileWriter("MyFile\\array.txt"));

        for (String s:array){
            BW.write(s);
            BW.newLine();
            BW.flush();
        }
        BW.close();
    }
}
