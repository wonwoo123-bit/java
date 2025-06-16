package a2_operator;

public class ArithmeticOperator {
    public static void main(String[] args) {
//        산술연산자 (+,-,*,/,%)
        System.out.println(2+3);
        System.out.println(8-5);
        System.out.println(7*2);
        System.out.println(7/2);
        System.out.println(8%5); // % < 나머지를 나타냄
        System.out.println(); // 띄워쓰기 용도로 사용 가능

        //증감연산자 (++, --)
        int value1 = 3;
        System.out.println(value1);
//        value1 = value1 + 1;
//        value1++;
        value1++;
        System.out.println(value1);

        int value2 = 3;
        ++value2;
        System.out.println(value2);

        int value3 = 3;
        int value4 = value3++; // ++ 의미는 value3 = value3 + 1
        // 1번. int value4 = value3; > 2번. value3 = value3 + 1 : ++는 옆 두가지 코드를 함축한 코드임.
        System.out.println(value3);
        System.out.println(value4);

        int value5 = 3;
        int value6 = ++value5; // 계산순서는 아래와 같음
        // value5 = value5 + 1
        // value6 = value5

        // 기호가 앞에 있다면 먼저 계산 후 대입
        // 기호가 뒤에 있다면 대입 후 계산

        // 절대 이런짓 하지 말자 ! (풀어서 읽기 쉽게 쓰기)
        int value7 = 3;
        int value8 = 4;
        int value9 = 2 + value7-- + ++value8;
        //계산순서
        // value8 = value8 + 1
        // int value9 = 2 + value7 + value8
        //value7 = value7 - 1
        System.out.println(value7); //2
        System.out.println(value8); //5
        System.out.println(value9); //10



    }
}
