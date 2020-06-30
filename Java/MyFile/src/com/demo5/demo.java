package com.demo5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class demo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("MyFile\\game.txt");
        prop.load(fr);
        fr.close();

        String count = prop.getProperty("count");
        int i = Integer.parseInt(count);
        if (i>=3){
            System.out.println("游戏结束");
        } else {
            Game.start();
            i++;
            prop.setProperty("count",String.valueOf(i));
            FileWriter fw = new FileWriter("MyFile\\game.txt");
            prop.store(fw,null);
            fw.close();
        }
    }
}
