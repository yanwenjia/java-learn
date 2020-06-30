package jiqian;

public class demo {
    public static void main(String[] args) {
        for (int g = 0; g <= 20; g++){
            for (int m = 0; m <= 33; m++){
                for (int c = 0; c<= 100; c += 3){
                    if (g + m + c == 100 & (5*g + 3*m + c/3)==100){
                        System.out.println(g+"只公鸡");
                        System.out.println(m+"只母鸡");
                        System.out.println(c+"只雏鸡");
                    }
                }
            }
        }
    }
}
