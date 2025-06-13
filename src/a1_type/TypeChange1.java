package a1_type;

import java.awt.desktop.AboutEvent;

public class TypeChange1 {
    public static void main(String[] args) {
        // 타입캐스팅 > 타입 변환 하는것
        int value1 = (int)5.99;
        System.out.println(value1); // 5가 나옴.
        long value2 = (long) 10; // 명시적으로 타입변환을 써주는게 좋다.
        long value2_1 = 10L; // < 효율적임 L < (long) 줄여서 표기한거임.
        System.out.println(value2);
        float value3 = (float) 5.8;
        System.out.println(value3);
        float value3_1 = 5.8F;
        System.out.println(value3_1);
        double value4 = (double) 10;
        System.out.println(value4);
        double value4_1 = 10D;
        System.out.println(value4_1);

    }
}
