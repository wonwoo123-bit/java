package a8_modifier.Modifier2;

import a8_modifier.Modifier2.pack.AA;
import a8_modifier.Modifier2.pack.CC;
//import a8_modifier.Modifier2.pack.BB; // 오류 (동일 패키지가 아니므로 import 불가)

public class Modifier2 {
//    클래스에 직접 지정하는 접근지정자 예제
//    클래스에는 2가지 접근지정자만 사용 가능
//    public
//    지정안함 ( = default 지정자를 명시x)
    public static void main(String[] args) {
//        AA, BB, CC 클래스 인스턴스화 (=객체화)
//        new 키워드로 클래스의 객체를 생성하는것을 "인스턴스화" 라고 함
        AA aa = new AA(); // 인스턴스화 가능
//        BB bb = new BB(); 인스턴스화 불가
//        CC cc = new CC(); // 인스턴스화 불가
    }
}
