package a5_class;

public class Constructor1 {
    public static void main(String[] args) {
        A a = new A();
        a.work();
        B b = new B();
        b.work();
//        C c = new C(); < 에러 기본생성자가 없음
        C c = new C(100); // 선언한 생성자를 반드시 사용해야함.
        c.work();
    }
}

// 보통 클래스는 외부파일(.java)에 만드는 것이 일반적임 (Student, User 클래스처럼)
// 예외적으로 하나의 파일에 여러개의 클래스를 선언하는 경우에는
// public 제어자는 오직 하나의 클래스에만 붙일 수 있음.
//public class A{} < 에러남 public 사용하면 안됨
class A{
    int m;
//    생성자가 없음 => 생성자 선언이 없으면 자동으로 기본생성자를 만듬
    void work(){
        System.out.println(m);
    }
}
class B{
    int m;
    B(){// 기본생성자를 명시적으로 선언했음. 자동으로 만들어지지 않음.
        System.out.println("B의 기본 생성자");
    }
    void work(){
        System.out.println(m);
    }
}
class C{
    int m;
//    기본 생성자가 없음. 하지만 다른 생성자가 있으므로 자동으로 기본 생성자를 만들지 않음.
//    C 클래스를 생성하려면 반드시 이 생성자를 사용해야 함.
    C(int a){
        m = a;
    }
    void work(){
        System.out.println(m);
    }
}
