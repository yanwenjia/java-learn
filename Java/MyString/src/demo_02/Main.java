package demo_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int x = 0; x < input.length(); x++) {
            System.out.println(input.charAt(x));
        }
    }
}
