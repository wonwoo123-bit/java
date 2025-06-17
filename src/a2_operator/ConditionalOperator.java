package a2_operator;

public class ConditionalOperator {
    public static void main(String[] args) {
//        삼항연산자
//        간단한 조건문
//        예제 : 짝수와 홀수를 구분하는 코드
//        if문을 사용한 예
        int number = 3;
//        if (number % 2 == 0) {
//            System.out.println("짝수");
//        }else {
//            System.out.println("홀수");
//        }
//        삼항연산자를 사용한 예
        System.out.println((number%2==0) ? "짝수" : "홀수");

        int value1 = (3>5) ? 6 : 9;
        System.out.println(value1);

        int value2 = (5>3) ? 10 : 20;
        System.out.println(value2);

    }
}
