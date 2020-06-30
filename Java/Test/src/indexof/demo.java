package indexof;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = {5222,23,23,26,56,33,63,2,65,9,54,65,6545};
        int index = -1;
        for (int x = 0; x < arr.length; x++){
            if (arr[x] == input){
                System.out.println(x);
            }
        }
    }
}
