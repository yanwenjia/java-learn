package demo;

public class demo {
    public static void main(String[] args) {
        /*System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);*/
       /* Integer i1 = new Integer(100);
//        System.out.println(i1);


        Integer i2 = new Integer(100);
//        System.out.println(i1);


        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf("2000");
//        Integer i5 = Integer.valueOf("abc"); // 报错
        System.out.println(i3);
        System.out.println(i4);
//        System.out.println(i5);*/

        int n1 = 100;
        String s1 = "" + n1;
        System.out.println(s1);

        String s2 = String.valueOf(n1);
        System.out.println(s2);

        String s3 = "100";
        Integer i = Integer.valueOf(s3);
        int x = i.intValue();
        System.out.println(x);
    }
}
