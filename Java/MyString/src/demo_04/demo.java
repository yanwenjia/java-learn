package demo_04;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.nextLine();
        String res = reverseStr(input);
        System.out.println(res);
    }
    /**
     * @param str
     * @return str
     */
    public static String reverseStr(String str){
        String s = "";
        for (int x = str.length()-1; x >= 0; x--){
            s += str.charAt(x);
        }
        return s;
    }
}
