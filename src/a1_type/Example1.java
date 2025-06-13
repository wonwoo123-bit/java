package a1_type;

public class Example1 {
    public static void main(String[] args) {
        // byte타입의 크기(1바이트)만큼 메모리를 할당받고 그 주소를 a라고 부르고
        // a 의 위치에 숫자 1을 저장한다.
        byte a = 1;
        byte b = 2;
        System.out.println(b); //위 설정한 값2니까 2가 나옴
        b = 3; // 기존 b의 위치에 3을 덮어쓴다.
        System.out.println(b); // 바로 위쪽 3으로 다시 설정하여 3으로 출력됨.

        // 변수 사용시 중복된 값으로 사용 불가능임 ex: byte b < 사용했으면, byte b 는 다시 사용 할 수 없음
        // 10번라인 처럼 값을 변경할 경우에는 새롭게 변수를 만드는 것이 아니고 byte b의 값을 바꾸는 것임으로 가능한것
        // 사칙연산 (+,-,*,/) < 산술연산자

        System.out.println(a-b); // 값 지정 이후에는 사칙연산으로 계산하여 출력 가능함.
        int c = a+b ;
        System.out.println(c);
        float z = 3;
        float v = 6;
        System.out.println(z/v);
        // float , double 사용 후 변환시 3 < 작성하여도 자동적으로 3.0 < 처럼 소수점 적용

        char ch1 = 'A'; //문자 지정시 char은 문자 하나만 저장하고 ' < 만 사용한다.
        char ch2 = 'B';
        System.out.println(ch1);

        System.out.println(ch1+ch2);
        // ^ 131 나온거는 유니코드를 더해서 나옴 (자바는 기본적으로 숫자로 치환하려함)
        // 산술연산자 + 때문에 숫자로 변환하여 덧셈을 수행한다.
        System.out.println("" + ch1 + ch2); // "" < 사용하면 문자라고 인식시킴
        System.out.println(+ch1); // + < 붙혀서 사용하면 숫자로 출력해줌 (+ch1 < 이렇게 옆으로 바로 붙혀야 함)
        // +기호는 문자형 변수를 숫자로 인식하게 만든다
        System.out.println(+ch1 + "" + ch2);

        String name = "Steve";
        String c1 = "abc"; // String < 대문자 주의 , 문자열은 String으로 생성한다 < "" 사용하여 문자값 작성
        System.out.println(name);
        System.out.println(name.length());
        String str1 = "한글";
        System.out.println(str1.length()); // 한글은 1글자당 2byte 사용임. 영어는 한자당 2byte

        boolean bool = true; //true는 참을 의미하는 예약어 (키워드). 숫자로는 1을 뜻함
        System.out.println(bool);
        bool = false;
        System.out.println(false); // false 거짓의 의미이고 숫자로는 0을 뜻함.

        long tea = 10l;
        System.out.println(tea);
        byte k;
        k = 5;
        System.out.println(k);

    }
}
