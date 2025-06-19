package a3_control;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException{
//        반복 제어문
//        For
//        기본형태
//        for (초기식; 조건식; 증감식) {
//            실행구문
//        }

        for (int i=0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("반복끝");

        for (int i=10; i>0; i--){
            System.out.println(i);
        }
        System.out.println("반복끝");

//        컴파일에러가 발생하지 않지만 무한루프에 빠지게 되므로 사용하지말자.
//        무한루프를 설계해도 적절한 Sleep과 리소스 관리를 동반한면 문제없음.
//        for ( ; ; ){
//            System.out.println("무한루프");
//        }
//        안전한 무한루프
//        Scanner scanner = new Scanner(System.in);
//        for( ; ;){
//            System.out.println("유저 입력 대기중 : ");
//            String userInput = scanner.nextLine();
//            System.out.println(userInput);
//            if (userInput.equals("exit")){
//                break;
//            }
//            Thread.sleep(1000);
//        }
//        System.out.println("무한루프 탈출");

//        증감식의 변화 (2씩 증가)
        for (int i=0; i<10; i+=2){
            System.out.println(i); // 0 2 4 6 8
        }
        System.out.println("반복끝");


//        iterator(반복자) 여러개인 경우
        for (int i=0, j=0; i<10 && j<10; i++, j++){
            System.out.println(i + " " + j);
        }
//        for문 밖에서 iterator를 참조해야만 한다면 아래처럼
        int i;
        for(i=0; i <10; i++){
            System.out.println();
        }
        System.out.println("iterator의 최종값은?");
        System.out.println(i);
    }
}
