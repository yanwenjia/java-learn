package demo1;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        String s = "24 56 23 51 65 66 42 55 44";
        String[] s1 = s.split(" ");
        System.out.println(s1);
        int[] intArr = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            intArr[i] = Integer.parseInt(s1[i]);
        }
        Arrays.sort(intArr);

        StringBuilder sb = new StringBuilder();
        for (int x = 0; x<intArr.length;x++){
            if (x==intArr.length-1){
                sb.append(intArr[x]);
            } else {
                sb.append(intArr[x]).append(" ");
            }
        }
        String res = sb.toString();
        System.out.println(res);

    }
}
