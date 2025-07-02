package a8_modifier.Static;

class A{
    int m =3; // 인스턴스 필드
    static int n = 5; // 스태틱 필드 (정적 필드)
}

public class Static1 {
    /* 정적필드의 특징
     - 정적필드는 Heap의 정적영역에 생성됨
     - 생성시점 main 메서드가 실행되기 이전
     - 정적필드의 값은 오직 정적영역에만 존재하고 객체는 그 위치를 참조함
     - 정적필드(Static field)는 전체 애플리케이션에서 유일한 값을 가지고
     - 객체를 생성하지 않아도 읽거나 수정 가능하다. (클래스명.정적필드)
    */
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.m);
        System.out.println(a1.n);

//        정적필드 직접 일기
        System.out.println(A.n);

//        정적필드 수정
        A.n = 6;
        System.out.println(a1.n);
        System.out.println(A.n);

        A a2 = new A();
        System.out.println(a2.n);
        a2.n = 7;
        System.out.println(a2.n);
        System.out.println(a1.n);
        System.out.println(A.n);

    }
}
