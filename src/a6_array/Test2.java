package a6_array;

import java.util.Arrays;

class AA {
    void abc(int m) {
        m = 8;
    }
    void bcd(int[] n) {
        n[0] = 4; n[1] = 5; n[2] = 6;
    }
}

public class Test2 {
    public static void main(String[] args) {
        AA a = new AA();
        int m = 5;
        int[] n= {1, 2, 3};
        a.abc(m);
        a.bcd(n);
        System.out.println(m); // 5
        System.out.println(Arrays.toString(n)); // [4,5,6]
    }
}
