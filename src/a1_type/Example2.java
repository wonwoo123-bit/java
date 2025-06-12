package a1_type;

public class Example2 {
    public static void main(String[] args) {
        //정수형 변수 생성 연습
        byte a= 1;
        short b = 128;
        int c = 1000; // int < 정수형의 기본형
        long d = 10000000L; // 뒤에 l 또는 L을 명시적으로 붙히기도 한다.
        //실수형 flort
        float e = 3.5f; // float < 소수점의 기본타입 x 기본타입 = double
        // 기본적으로 소수점 사용시 실수형 기본타입인 double로 인식하여 float < 사용하면 뒤에 f(대, 소문자 구분x)를 붙혀 인식시켜줘야함
        double f = 3.144372894742; // 뒤 d 또는 D 명시적으로 붙히기도 함.

        // 실수(소수점) 사용시 float 안쓰고, double만 써도 ㄱㅊ, 정수 사용시 int 사용,
        // long 사용하는것은 숫자가 계속해서 늘어나는 경우에 사용 함. 사용시 뒤쪽에 L 붙히기
        System.out.println(a + b + c);

        //문자형
        char g = 'A';
        String h = "안녕하세요"; // 참조자료형으로 char를 여러개 모아놓은 형태

        //불리언형
        boolean i = false;
        boolean j = true;

        // 진법에 따른 표기법 연습 (10진법, 2진법 b ,16진법 x)
        System.out.println(c);
        c = 15;
        System.out.println(c);
        c = 0b1111;
        System.out.println(c);
        c = 0xF;
        System.out.println(c);
    }
}
