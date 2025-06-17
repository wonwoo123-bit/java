package a2_operator;

public class RelationOperator {
    public static void main(String[] args) {
        // 비교연산자 (<, > <=, >=, ==, !=)
        // 특징
        // 반드시 그 결과가 참 또는 거짓으로 나오는 연산자.
        System.out.println(5<2); // false
        System.out.println(5>2); // true
        System.out.println(5<=5); // true
        System.out.println(5>=5); //true
        System.out.println();


        // 변수를 이용한 비교연산자 표현
        int a = 5;
        int b = 2;
        int c = 5;
        System.out.println(a==b); // false
        System.out.println(a!=b); // true
        System.out.println(a==c); // true
        System.out.println(a!=c); // false
        // !(negation, NOT)기호는 == 의 반대임

        // 중요! 참조자료형의 참조비교
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2); // false
        System.out.println(str1 == str1); // true
        // == < 스택영역에서의 값을 비교하는것임.
        // 참조자료형은 스택영역에서 위치값을 저장하기에 문자열이 같아도 false가 나오는것임.
        System.out.println(str1.equals(str2)); // true

        // 리터럴방식의 문자열 생성과 비교
        String str3 = "Hello";
        String str4 = "Hello";
        System.out.println(str3 == str4);

        // 찹조값에 복사 후 비교
        String str5 = new String("안녕");
        String str6 = str5;
        System.out.println(str5==str6);
        System.out.println(str5);
        System.out.println(str6);

    }
}
