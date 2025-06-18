package a3_control;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        // switch ~ case - 구문
//        기본형태 if와 다르게 하나의 중괄호안에 실행코드를 모두 작성해둠. 값의 비교가 아닌 동일여부만 확인함.
//        switch case 문은 범위조건을 구하지 못함.
//        switch(비교할 값) {
//          case 값1: 실행코드 break;  case 안에는 괄호를 사용하지 않음.
//          case 값2: 실행코드 break;
//          default: 실행코드
//        }
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }

        Scanner scanner = new Scanner(System.in); // Scanner 기능을 활성화
        System.out.println("요일을 입력해 주세요");
        String day = scanner.nextLine(); // 문자열 유저입력
        switch (day){
            case "월", "월요일":
                System.out.println("월요일 입니다."); break;
            case "화":
            case "화요일":
                System.out.println("화요일 입니다."); break;
            case "수":
            case "수요일":
                System.out.println("수요일 입니다."); break;
            case "목":
            case "목요일":
                System.out.println("목요일 입니다."); break;
            case "금":
            case "금요일":
                System.out.println("금요일 입니다."); break;
            case "토":
            case "토요일":
            case "일":
            case "일요일":
                System.out.println("휴일입니다."); break;
            default: System.out.println("올바른 요일을 입력해 주세요.");
        }
        scanner.close(); // 스캐너 객체를 메모리에서 삭제시킴
//        참조자료형이 생성되는 Heap 메모리의 경우 필요없는 메모리는 삭제하자
//        남아있으면 GC(Garbage Collector)에 의해 자동으로 삭제되지만,
//        코드상에서 명시적으로 삭제시킨는 것이 좋은 습관임.
    }
}
