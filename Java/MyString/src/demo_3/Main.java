package demo_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        int big = 0;
        int small = 0;
        int num = 0;

        for (int x = 0; x < line.length(); x++) {
            char ch = line.charAt(x);
            if (ch >= 'A' && ch <= 'Z') {
                big++;
            } else if (ch >= 'a' && ch <= 'z') {
                small++;
            } else if (ch >= '0' && ch <= '9') {
                num++;
            }
        }
        System.out.println("大写字母有：" + big);
        System.out.println("小写字母有：" + small);
        System.out.println("数字有：" + num);
    }
}
