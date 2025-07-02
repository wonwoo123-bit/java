package a9_inheritance.TypeCasting;

class A {
    int a = 3;
    void methodA() {
        System.out.println("A 클래스");
    }
}
class B extends A {
    int b = 4;
    void methodB() {
        System.out.println("B 클래스");
    }
}

public class TypeCasting_1 {
    public static void main(String[] args) {
        // #1. A타입
        A value1 = new A();
        System.out.println(value1.a); // 3
        value1.methodA(); // A 클래스
        
        // #2. B타입
        B value2 = new B();
        System.out.println(value2.a); // 3
        System.out.println(value2.b); // 4
        value2.methodA(); // A 클래스
        value2.methodB(); // B 클래스
//      상속관계시 자식은 부모의 객체값을 그대로 가지고 있음


        // #3. B->A 업캐스팅
        A value3 = new B();
        System.out.println(value3.a); // 3
        value3.methodA(); // A 클래스
        // B를 참조할 수 없음 A 클래스의 값만 참조하고 있기 때문
//        업캐스팅으로 B객체내의 A역영을 참조하게되어서 b를 읽을 수 없음

        // #4. A->B 다운캐스팅
        B value4 = (B)value3;
        System.out.println(value4.a); // 3
        System.out.println(value4.b); // 4
        value4.methodB(); // B 클래스
    }
}








