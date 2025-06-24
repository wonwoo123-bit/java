package a5_class;

public class ConstructorThis {
    public static void main(String[] args) {
        AAA a = new AAA(3,5);
        a.print(); // 0 5
        // 클래스의 필드와 메서드의 지역변수가 같으면 필드를 지역변수로 인식하므로
        // 명시적으로 this를 사용하여 필드를 표시해야 함. (this.필드)
        BBB b1 = new BBB();
        b1.print(); // 1 2 3 4
        BBB b2 = new BBB(10);
        b2.print(); // 10 2 3 4 (m1만 10으로 초기화)
        BBB b3 = new BBB(20, 30);
        b3.print(); // 20 30 3 4
    }
}
class AAA {
    int m;
    int n;
    AAA(int m, int n) {
        m = m; // 대입연산자 왼쪽 m은 필드의 m이 아니라 생성자의 매개변수 m을 의미함
        this.n = n;
    }
    void print() {
        System.out.println(m + " " + n);
    } // 클래스 내부에 필드 생성시에는 무조건 this 써주기
}
class BBB {
    int m1;
    int m2;
    int m3;
    int m4;
    BBB() { // 기본생성자
        this.m1 = 1;
        this.m2 = 2;
        this.m3 = 3;
        this.m4 = 4;
    }
    BBB(int m1) {
        this(); // this 메서드는 자신이 속한 클래스 내부의 다른 생성자를 호출하는 것.
        this.m1 = m1;
    }
    BBB(int m1, int m2) {
        this(m1);
        this.m2 = m2;
    }
    void print() {
        System.out.println(m1 + " " + m2 + " " + m3 + " " + m4);
    }
}