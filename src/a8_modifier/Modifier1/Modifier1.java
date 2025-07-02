package a8_modifier.Modifier1;

import a8_modifier.Modifier1.pack1.A;
import a8_modifier.Modifier1.pack1.B;
import a8_modifier.Modifier1.pack2.C;
import a8_modifier.Modifier1.pack2.D;

public class Modifier1 {
//    클래스의 피드 접근 예제
//    클래스의 필드에는 4가지 접근지정자를 사용 가능
//    public
//    protected
//    지정안함 (default의 의미)
//    private
    public static void main(String[] args) {
        A a = new A();
        a.print(); // 1 2 3 4
        B b = new B();
        b.print(); // 1 2 3
        C c = new C();
        c.print(); // 1
        D d = new D();
        d.print(); // 1 2
    }
}
