package a6_array;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        // 사용자로부터 입력받은 문자열을 거꾸로 출력하는 메서드
        // 예) hello 를 입력하면 olleh 를 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요.");
        String str = scanner.nextLine();
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str) {
        // 힌트! String을 charArray로 변형하여 거꾸로 담은 다음
        // 그걸 다시 String 으로 변환하여 반환하세요.
        return null;
    }
}
