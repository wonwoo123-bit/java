package a6_array;

import java.awt.desktop.AboutEvent;

public class String1 {
    public static void main(String[] args) {
//        String 클래스는 문자의 시퀀스, 문자열을 나타내는 객체
//        공식적으로 배열로 부르지는 않지만
//        내부적으로 char의 배열 모습을 하고 있음
//        배열과 유사한 특징을 가지지만 원칙적으로 불변성(immutable)을 가짐

//        숫자를 -> 문자열(String)
        int a = 10;
        String str1 = Integer. toString(a);
        System.out.println(str1); // 숫자가 아니라 문자의 10
        double b = 5.5;
        String str2 = Double.toString(b);
        System.out.println(str2);
        boolean c = true;
        String str3 = Boolean.toString(c);
        System.out.println(str3);

//        기본자료형의 래퍼(wrapper)클래스의 특징
//        앞자리가 대문자인 기본자료형 = 기본자료형의 래퍼(wrapper)클래스
//        Integer, Double, Byte, Short, Long, Float, Character, Boolean
//        모든 기본자료형과 1대1로 대응됨
//        불변성을 가진다 (수정불가능)
//        생성자를 사용하지 않고 대신 valueOf() 메서드를 사용하여 객체 생성

//        래퍼클래스의 사용 이유
//        1. 자료구조중에 높은 성능을 나타내는 컬렉션(리스트, 세트, 맵, 트리)들은 모두 객체를 저장하도록
//        설계되어 있기 때문에 기본자료형을 다루기 어려움
//        기본자료형을 래퍼클래스로 감싸서 자료구조에 사용함
//        2.유용한 메서드를 제공 : 타입변환, 비교연산등등 유용한 메서드를 제공
//        별도의 외부메서드없이 내부에 포함된 유용한 메서드를 쉽게 사용 가능
//        3.제네릭(Generics) : class MyClass<T>{}
//        T를 제네릭이라 부르고 T는 모든 객체를 대표하는 키워드임
//        T자리에 어떤 클래스도 사용될 수 있도록 다양성을 추가한 문법

//        문자열 -> 숫자
        int aa = Integer.parseInt(str1);
        System.out.println(aa); // 문자 10을 숫자 10으로 바꿈.
        double bb = Double.parseDouble(str2);
        System.out.println(str2);
        boolean cc = Boolean.parseBoolean(str3);
        System.out.println(str3);

//        valueOf를 이용한 타입변환
//        래퍼클래스의 생성자를 대신함
//        메서드의 반환 결과는 기본자료형이 아닌 래퍼클래스
        Integer aaa = Integer.valueOf(str1);
        System.out.println(aaa);
        Double bbb = Double.valueOf(str2);
        System.out.println(str2);

//        일반적인 계산 목적으로 타입변환을 할 때는 사용x
//        컬렉션(리스트, 세트, 맵, 트리)에 사용 할 목적으로 주로 사용함.
    }
}
