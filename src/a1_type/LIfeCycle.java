package a1_type;

public class LIfeCycle {
    public static void main(String[] args) {
        // 변수의 생명주기
        // 중괄호{}로 감싸진 블록 범위에 따라 결정된다.
        /*
        * 1. 지역변수 메서드, if문, for문 등의 블록 내부
        -해당블록이 실행될때 생성되고 블록 종료시 즉시 소멸
        */
        int x = 100;
        if(true) {
            int y = 50;
        }
        int y = 60;
        System.out.println(x);
        System.out.println(y);
    }
}
