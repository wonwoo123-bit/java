package a2_operator;

public class ShiftOperator {
    public static void main(String[] args) {
//        시프트 연산자
//        >>, <<, >>> 3가지 종류만 존재함.
//        앞 숫자의 이진수를 기호 뒤 숫자(2의제곱승)만큼 자리수를 이동한 값, 이동한 공백은 0으로 채움
        System.out.println(2 << 1); // 4
        System.out.println(4 << 1); // 8
        System.out.println(4 >> 1); // 2
        System.out.println(2 >> 1); // 1
        System.out.println(3 << 1);
        System.out.println(3 << 2);
        System.out.println(3 << 3);
        System.out.println(-3 << 1);
        System.out.println(-3 << 2);
        System.out.println(-3 << 3);
//        왼쪽 쉬프트는 2의 제곱승을 곱한는 것과 같고
//        오른쪽 쉬프트는 2의 제곱승을 나눈 것과 같다.
//        곱셈과 나눈셈의 계산을 매우 빠르게 할 수 있음.

        System.out.println(5 >> 1); // 2
        System.out.println(-5 >> 1); // -3
//      오른쪽 쉬프트시 오른쪽 비트값이 사라져 정확한 계산이 불가능하다.
//      정밀한 나누기 계산이 필요한 곳에는 시프트 연산 대신 나누기를 사용해야함.

        System.out.println(Integer.toBinaryString(-3));
        System.out.println(-3 >> 2);
//        >> 오른쪽 산술 시프트는 부호(양수, 음수)비트를 그대로 유지하기 때문에
//        음수의 경우에는 왼쪽자리를 1로 채우고
//        양수의 경우에는 왼쪽자리를 0으로 채운다.

//        >>> 논리 시프트는 부호비트를 유지하지 않는 특징을 가지고 있음.
//        왼쪽 자리를 그냥 0으로 채운다.
        System.out.println(-3 >>> 2);

//        >>, <<의 산술 시프트와 >>> 논리 시프트는 왜 사용할까?
//        1. 산술 시프트는 2의 제곱승의 계산에 자주 사용됨.
//        2. 비트마스크(bit mask)에 사용됨.
//        7654 3210 < 비트 위치
//        1000 1001 : 137
//        기계가 3번째 자리의 문이 열려 있는지의 여부만 확인하고 싶을 때
//        1000 1001 = 137
//        0000 1000 = mask
//        ------------ << &연산
//        0000 1000 = mask와 같은 값(즉, 0이 아닌 값)이 나오면 해당 위치가 1이라는 뜻
        int value = 137; // 1000 1001
        int mask = 1 << 3; // 3번째 위치를 확인하기 위해 3을 시프트 연산함.
        System.out.println(value & mask); // 8 (0이ㅣ 아니면 해당 위치가 1임)
        mask = 1 << 2; // 확인하고 싶은 자리수를 기호 뒤에 작성 후 0인지 아닌지의 값을 확인하면 1인지 0인지 확인 가능
        System.out.println(value & mask); // 0이 나옴
//        마스크를 통해서 특정 비트의 위치의 값을 확인하 수 있음.
//        이를 이용하여 다향한 flag의 세팅값을 확인하는데 사용한다,
//        boolean타입에 비해 8배가 메모리 효율이 좋다 (==관리가 용이함)
    }
}
