package com.demo2;

import java.io.File;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\Code\\Java\\java.txt");
        // 如果文件不存在就创建文件：并且返回True
        // 如果文件存在就不创建文件，并且返回false
        System.out.println(f1.createNewFile());

    }
}
