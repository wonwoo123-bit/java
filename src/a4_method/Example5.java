package a4_method;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
//        2개의 숫자를 매개변수로 받아서 더 큰 수를 반환하는 메서드
//        유저입력을 두번으로 나누어 받음
        Scanner scanner=new Scanner((System.in));
        System.out.println("첫번째 숫자를 입력해주세요.");
        int first = scanner.nextInt();
        System.out.println("두번째 숫자를 입력해주세요.");
        int second = scanner.nextInt();
        int max = getMax(first, second); //메서드의 호출 이후 계산된 값을 max < 변수안에 저장
        System.out.println(max);
    }
    public static int getMax(int first, int second){
//        return (first >= second) ? first : second;
        if(first >= second) {
            return first;
        }else {
            return second;
        }
    }
}
