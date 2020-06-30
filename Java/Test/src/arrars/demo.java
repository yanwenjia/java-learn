package arrars;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,954,236,1682,62};
        System.out.println("排序前："+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后："+ Arrays.toString(arr));
    }
}
