package a4_method;

public class Method2 {
    public static void main(String[] args) {
//        리턴형이 있는 함수(=메서드)
//        리턴형은 메서드가 실행 결과로 반환하는 값의 자료형이다.
//        (a+b) * c 를 수행하는 경우, +를 수행하는 함수와 *를 수행하는 함수로
//        나원서 구현한다면, plus함수와 multiply함수가 필요
        int a =3;
        int b =5;
        int c =10;
        int value = plus(a,b); // 함수의 계산결과를 변수에 저장함
        multiply(value, c); // 저장한 계산결과를 다른 함수가 이용할 수 있음

    }

    public static int plus(int a, int b){
        int result = a + b;
        return result;
    }

    public static void multiply(int x, int y){
        int result = x * y;
        System.out.println(result);
    }




}
