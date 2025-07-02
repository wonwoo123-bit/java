package a9_inheritance.TypeCasting;

class C {}
class D extends C {}

public class TypeCasting_2 {
    public static void main(String[] args) {
        C value1 = new C(); // 부모클래스 C의 인스턴스
        C value2 = new D(); // 자식클래스 D의 인스턴스를 부모인 C로 업캐스팅
        System.out.println(value1 instanceof C); // true
        System.out.println(value2 instanceof C); // true
        System.out.println(value1 instanceof D); // false
        System.out.println(value2 instanceof D); // true
        // instanceof는 뒤에 적는 클래스의 특징(=속성)을
        // 가지고 있는지 물어보는 키워드
//        반환형은 반드시 Boolean (참/거짓)


//        아래코드는 value1 객체를 D 타입으로 변환해도 되는지 여부를 확인하는데 사용
        if (value1 instanceof D) {
            D d = (D)value1;
            System.out.println("value1을 D로 다운캐스팅");
        }else {
            System.out.println("value1은 D로 다운캐스팅 불가!!");
        }


        if (value2 instanceof D) {
            D d = (D)value2;
            System.out.println("value2를 D로 다운캐스팅");
        }else {
            System.out.println("value2는 D로 다운캐스팅 불가!!");
        }

        // 객체의 실제 타입을 직접적으로 알 수 있는 방법??
//        getName()의 결과는 패키지명.클래스명 형태 (풀네임)
        System.out.println(value1.getClass().getName()); // TypeCasting.C
        System.out.println(value2.getClass().getName()); // TypeCasting.D

        // instnaceof와 getClass.getName의 차이점
        // instanceof는 상속관계를 포함하고 있음
        // getClass.getName은 상속관계를 무시하고 정확히 동일한 클래스만을 리턴
    }
}





