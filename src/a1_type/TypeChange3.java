package a1_type;

public class TypeChange3 {
    public static void main(String[] args) {
        // 기본자료형간의 연산
        int value1 = 3 + 5; // int + int = int
        int value2 = 8 / 5; // int / int - int
        // int 포함 그 아래에 있는 byte, short 사이의 연산은 모두 int

        float value3 = 3.0F + 5.0F; // float + float
        double value4 = 8.0 / 5.0; // double + double

        byte data1 = 3;
        byte data2 = 5;
//        byte value5 = data1 + data2; // 에러발생 int + int임으로 byte에 저장불가
//        연산을 할 경우에는 byte와 short 사용하지 않음.
        int value5 = data1 + data2; //8
//        int value6 = 3 + 3.5; < double 을 int로 표기하려 하여 에러 발생임
        // int + double > int 를 업캐스팅해서 double + double
        double value6 = 3 + 3.5;
        int value7 = 3 + (int)3.5;

        double value8 = 5 / 2.0;
        byte data3 = 3;
        short data4 = 5;
        int value9 = data3 + data4; // int + int
        // byte 와 short 타입으로는 연산을 수행하지 않음. int로 업캐스팅해서 연산.

        double value10 = data3 + data4; // double + double

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println(value6);
        System.out.println(value7);
        System.out.println(value8);
        System.out.println(value9);
        System.out.println(value10);

    }
}
