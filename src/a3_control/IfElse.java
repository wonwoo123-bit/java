package a3_control;
import java.util.Scanner; // 외부라이브러리를 사용하려면 먼저 import 해야함.

public class IfElse {
    public static void main(String[] args) {
        // if 조건문 (선택 제어문)
        int a = 10;
//          if문의 기본형태1: if() {} < 불리언값이 false면 출력 x
        if (a>5) { // 조건이 거짓이면 실행되는 코드가 없음
            System.out.println(a);
        }

//        if문의 기본형태2: if() {} else {} < 불리언값이 참,거짓으로 나뉘어 출력
        if (a>5) {
            System.out.println(a);
        }else {
            System.out.println("조건은 거짓");
        }

//        if문의 기본형태3: if() {} else if{} else {}
//        나이를 입력하면 연령대를 출력하는 조건문
//        나이 입력을 동적(=유저입력)으로 하기 위해 외부 라이브러리가 필요함.
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력해 주세요: ");
        int userAge = scanner.nextInt();
        if (userAge >= 20 && userAge <= 29) {
            System.out.println("20대");
        } else if (userAge >= 30 && userAge <= 39) {
            System.out.println("30대");
        } else if (userAge >= 40 && userAge <= 49) {
            System.out.println("40대");
        } else {
            System.out.println("나머지");
        }
        scanner.nextLine(); // Scanner가 가지고 있는 엔터버퍼를 비워주는 역할

        // 이름 입렵
        System.out.println("이름을 입력해 주세요: ");
        String userName = scanner.nextLine();
        System.out.println("끝");
        scanner.close(); // 스캐너 객체를 메모리에서 삭제시킴

//        if문의 중복
        int value1 = 5;
        int value2 = 3;
        if(value1 > 4){
            if(value2 < 2){
                System.out.println("실행1");
            }else {
                System.out.println("실행2");
            }
        }else {
            System.out.println("실행2");
        }

//        if문의 code drilling 이슈
        if(true){
            if(true){
                if (true){
                    if(true){
                        if(true){
                            // 가독성을 떨어뜨리므로 좋지 않은 코딩방법
//                            가능하다면 논리연산자를 이용하여 묶어 사용고, 최대한 중복은 피하기
                        }
                    }
                }
            }
        }
    }
}
