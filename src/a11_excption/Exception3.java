package a11_excption;
class A{
    void abc(){
        bcd();
    }
    void bcd(){
//        일반적인 예외 처리 코드 try catch
//        산술예외가 발생한 메서드내에서 예외처리를 함
        try {
            System.out.println(3/0);
        }catch (ArithmeticException e){
            System.out.println("산술예외 발생");
        }
    }
}

class B {
    void abc(){
        try {
            bcd();
        }catch (ArithmeticException e) {
            System.out.println("예외전가의 예외를 abc에서 처리");
        }
    }
//    예외전가
    void bcd() throws ArithmeticException{
        System.out.println(3/0); // 여기서 발생한 산술 예외는 throw 처리
    }
}

public class Exception3 {
    public static void main(String[] args) {
//        예외전가 Exception Throw
        B b = new B();
        b.abc();
    }
}
