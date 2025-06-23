package a4_method;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
//        문자열을 대문자로 변환하는 메서드
//        대소문자가 서로 다른 문자로 인식하기 깨문에
//        문자열을 대문자나 소문자로 통일시킨 후 비교하는 것이 일반적인 방법
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하시오");
        String userName = scanner.nextLine();
        String input = changeToUpperCase(userName);
        System.out.println(input);
//        System.out.println(changeToUpperCase(userName)); < 위 2줄을 줄여서 출력하는것
    }
    public static String changeToUpperCase(String userName){
        return userName.toUpperCase();
    }
}
