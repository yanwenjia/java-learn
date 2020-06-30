package com.demo5;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void start() {
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜得数字：");
            int guessNumber = sc.nextInt();

            if (guessNumber > number){
                System.out.println("你猜得数字大了！");
            } else if (guessNumber < number){
                System.out.println("你猜得数字小了！");
            } else {
                System.out.println("恭喜你猜中了！");
                break;
            }
        }
    }
}
