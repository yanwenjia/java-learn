package com.demo3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("MyFile\\test.txt");
        fos.write(90);
        fos.close();
    }
}
