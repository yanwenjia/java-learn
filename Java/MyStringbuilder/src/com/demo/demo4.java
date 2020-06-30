package com.demo;

public class demo4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String res = arrToString(arr);
        System.out.println(res);
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                sb.append(arr[x]);
            } else {
                sb.append(arr[x]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
