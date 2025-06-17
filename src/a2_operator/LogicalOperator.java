package a2_operator;

public class LogicalOperator {
    public static void main(String[] args) {
        //논리연산자 (&&, ||, ^, !)
        //발음 순서대로 앰퍼샌드, 파이프, 캐럿, 니게이션
        // ampersand , pipe, caret, negation(=not)

        // AND && 논리연산자 < 모든 값이 true이여야 true 값 출력됨.
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false
        System.out.println(true && (5<3)); // false
        System.out.println((5<=5) && (7>=2)); // true
        System.out.println();
        // OR 논리연산자 < 하나의 값이라도 true에 속하면 true로 출력됨.
        System.out.println(true || true); //t
        System.out.println(true || false); //t
        System.out.println(false || true); // t
        System.out.println(false || false); //f
        System.out.println(false || (5<3)); //f
        System.out.println((5<=5 || (7>2))); //t
        System.out.println();
        // NOT 논리연산자 < 그냥 반대로
        System.out.println(!true); //false
        System.out.println(!false); // true
        System.out.println();
        // XOR (exclusive OR 배타적논리합)
        // 두개의 값이 다르면 true(=1), 같으면 false(=0)
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false
        System.out.println();

        // 실제예시 1) NOT 연산자의 사용법
        // 보통 토글장치를 구현할 때 사용함.
        boolean capsButton = false;
        capsButton = !capsButton;
//        if(capsButton == true) {
            capsButton = false;
//        }else {
            capsButton = true;
 //       }
        System.out.println();

        // 실제예시 2) XOR연산자의 사용법
        // 기본적인 암호화 / 복호화 구현에 사용됨.
        // step1. 보내려는 문자와 키를 이진수로 변환
        //보내려는 문자는 'A'. 키는 숫자 7
        // 01000001 = 'A'
        // 00000111 = 7
        //--------------------
        // 01000110 = 암호화된 데이터 값
        // 00000111 = 7 < 키 값
        // 01000001 = 'A' < 복호화 성공

//        ********쇼트서킷(short circuit)**********중요함
//        AND 와 OR 논리연산자에 사용됨
//        && (AND) < 첫번째 조건이 false일 경우면 두번째 조건은 실행하지 않음 => 무조건 false
//        || (OR) < 첫번째 조건이 true면 두번째 조건을 계산하지 않음 => 무조건 true
        int value1 = 3;
        System.out.println(false && ++value1 > 6);
//        두번째 조건 ++value1 >6 을 계산할 필요 없음. 결과는 무조건 false
    }
}
