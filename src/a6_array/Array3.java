package a6_array;

public class Array3 {
    public static void main(String[] args) {
//        참조자료형의 값 복사의 특성

        int a =4;;
        int b = a;
        b = 10;
//        기본자료형은 스택에 생성되고 스택의 저장값이 그대로 복사됨
//        값을 그대로 복사하므로 값복사라 하고 b의 저장값만 10으로 변경됨.
        System.out.println("a=" + a); // 4
        System.out.println("b=" + b); // 10

        int[] ints = {1,2,3};
        int[] temp = ints;
        temp[0] = 100;
        System.out.println("ints[0]=" + ints[0]);
        System.out.println("temp[0]=" + temp[0]);

    }
}
