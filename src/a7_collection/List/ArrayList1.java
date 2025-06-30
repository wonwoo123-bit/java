package a7_collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
//        List 리스트
//        컬렉션중에 가장 많이 사용되는 클래스(=실제로는 인터페이스)
//        *중요* 모든 컬렉션은 "객체"만 저장할 수 있음
//        기본자료형은 반드시 래퍼클래스의 객체로 변환되어 저장한다.
//        사용시에는 오토박싱, 오토언박싱 기능이 동작해서 타입변환은 자동으로 발생

//        배열의 단점
//        추가와 삭제가 안됨
        String[] array = new String[]{"A","B","C","D"};
        System.out.println(array.length);
        array[2] = null;
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
//        배열은 요소(엘리먼트)를 삭제해도 메모리 공간은 남고 사이즈도 그대로임

//        리스트
//        1. 생성자가 List가 아니라 자식클래스인 ArrayList (사실은 구현체)
//        2. 컬렉션은 자료형의 명시를 <String>과 같은 방식으로 표현함 (제네릭 문법)
        List<String> aList = new ArrayList<>();
//        List의 구현체 aList를 만들기위해 ArrayList 클래스를 이용한다는 뜻
//        List의 자식클래스인 ArrayList, LinkedList, Vector 사용 가능
//        <String>은 저장되는 요소가 문자열임을 명시하는 문법 (=제네릭)
        System.out.println(aList.size()); // length가 아니라 List는 size를 사용함.
//        .add 이용해 값을 추가, .remove 이용해 값을 삭제 (삭제할 경우 삭제할 값을 넣으면 됨)
        aList.add("A");
        aList.add("B");
        aList.add("C");
        aList.add("D");
        System.out.println(aList.size());
        System.out.println(aList);
        aList.remove("C"); // 인덱스가 아니라 값을 전달하면 찾아서 삭제해줌
        System.out.println(aList.size());
        System.out.println(aList);

//        리터럴방식으로 배열을 한번에 생성 및 저장을 수행하는 것처럼
//        ArrayList를 아래처럼 생성할 수 있음
        List<String> stringList = new ArrayList<>(Arrays.asList("A","B","C","D"));
        System.out.println(stringList.size());
        System.out.println(stringList);
        stringList.add("E");
        System.out.println(stringList);
    }
}