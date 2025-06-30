package a7_collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
//        배열을 List로 변환하는 법
//        int[] array = {1,2,3,4}; // 기본자료형의 배열은 리스트로 자동으로 변환되지 않는다.
        Integer[] array = {1,2,3,4};
        List<Integer> aList1 = Arrays.asList(array);
//        aList1.add(5);
//        Arrays.asList()로 배열을 리스트로 변환할 때, 기존 배열의 메모리 위치를 그댈 재사용함.
//        원본 배열을 참조하여 그 위 에 List 인터페이스의 껍데기를 씌운 것과 같음.
//        그러므로 배열의 고정크기를 유지하며 View의 역할을 수행함.
//        > 결과적으로 배열의 불변성을 그대로 가지게 됨.
        List<Integer> aList2 = new ArrayList<>(Arrays.asList(array)); // 새로운 메모리에 값 복사하여 만든것임
        aList2.add(5);
        System.out.println(aList2);
//        기존배열의 메모리 위치를 재사용하지 않고 new ArrayList<>()로 새로 생성하는 방식이므로
//        새로운 힙의 메모리 영역을 가짐
//        이 경우 리스트의 특징을 그대로 사용 가능.
//        배열을 리스트로 만들려면 new를 이용해서 새로운 메모리를 만들어 배열의 참조값만 그대로 사용해서 리스트 생성가능

    }
}
