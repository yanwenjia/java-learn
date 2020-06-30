package demo_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "root";
        String password = "ps";
        for (int x = 2; x < 3 & x >= 0; x--) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String inputName = sc.nextLine();
            System.out.println("请输入密码：");
            String inputPs = sc.nextLine();
            if (inputName.equals(name) & inputPs.equals(password)) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.print("登录失败！你还有" + x + "次机会");
            }
        }
    }
}
