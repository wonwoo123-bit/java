package a2_operator;

public class BitwiseOperator {
    public static void main(String[] args) {
//        비트연산자 (비트를 다루는 연산자)
        int data = 13;
        // 십진수 > 진수별로 변환방법
        System.out.println(Integer.toBinaryString(data));
        System.out.println(Integer.toOctalString(data));
        System.out.println(Integer.toHexString(data));
        System.out.println();

        // 각 진수별 > 십진수 변환
        System.out.println(Integer.parseInt("1101",2));
        System.out.println(Integer.parseInt("15",8));
        System.out.println(Integer.parseInt("d",16));
        System.out.println();

        System.out.println(13); //10진수는 그대로
        System.out.println(0b1101); //2진수는 0b 붙히기
        System.out.println(015); // 8진수는 0 붙히기
        System.out.println(0xd); // 16진수는 0x 붙히기
        System.out.println();

//        & 비트연산자는 1개만 사용
//        두개의 비트가 모두 1인경우에만 결과가 1
        System.out.println(3 & 10);

//        | < 두 비트중 한개만 1이어도 1
        System.out.println(3 | 10);

//        ^ < 두 비트가 다르면 1
        System.out.println(3 ^ 10);
//        0000 0011 =3
//        0000 1010 =10
//        ------------
//        0000 1001 = 9

//        ~ < 비트연산자의 NOT은 논리연산자(!)와 다름
//        모든 비트(부호비트 포함)의 값을 반대로 바꿈
//        음수 / 양수 변환할 때 사용
        System.out.println(~3);
//        0000 0011 = 3
//        1111 1100 = -4
//        ~ 연산자는 컴퓨터의 음수표현에 사용됨
//        N의 음수는 ~N + 1 로 계산 가능하다.
        System.out.println(Integer.toBinaryString(-3)); // 1111 1101

    }
}
