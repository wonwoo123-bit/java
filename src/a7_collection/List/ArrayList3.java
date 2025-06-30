package a7_collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {
//        ArrayList 메서드 사용법
        List<Integer> aList1 = new ArrayList<>();
//        1. add(요소추가, 맨 뒤에 추가)
        aList1.add(3);
        aList1.add(4);
        aList1.add(5);
        System.out.println(aList1);

//      2. add(int index, E element) (요소추가, 특정 위치에 추가)
        aList1.add(1,6);
        System.out.println(aList1);

//        3. addAll (또 다른 리스트를 뒤에 추가)
        List<Integer> aList2 = new ArrayList<>();
        aList2.add(1);
        aList2.add(2);
        aList2.addAll(aList1);
        System.out.println(aList2);

//        4. addAll (특정 위치에 리스트 추가)
        List<Integer> aList3 = new ArrayList<>();
        aList3.add(100);
        aList3.add(101);
        aList2.addAll(1,aList3);
        System.out.println(aList2);

//        5. set (수정)
        aList3.set(0,10);
        aList3.set(1,20);
        System.out.println(aList3);

//        6. remove(int index) (해당 인덱스 삭제)
//        aList3.remove(10); // 주의. 정수는 인덱스로 인식함.
        aList3.remove(0);
        System.out.println(aList3);

//        7. remove(Object obj) (해당 오브젝트 삭제)
        aList3.add(0,10);
        System.out.println(aList3);
        aList3.remove(Integer.valueOf(10));
        System.out.println(aList3);

//        8. clear (모두 삭제)
        aList3.clear();
        System.out.println(aList3);

//        9. isEmpty (배열이 비어있는지 확인. 비었으면 true)
        System.out.println(aList3.isEmpty());

//        10. size (리스트의 전체 갯수를 리턴)
        System.out.println(aList2.size());

//        11. get (특정 인덱스의 요소를 읽음)
//        *주의* 배열에서는 array[index] 처럼 읽지만 컬렉션에서는 안됨
//        aList2[index] < 오류임
        System.out.println(aList2.get(0));
        System.out.println(aList2.get(1));
        System.out.println(aList2.get(2));

//        12. toArray (리스트 > 배열로 바꾸는것)
//        주의사항 :
        System.out.println(aList2);
//        int[] array = aList2.toArray();
//        오류원인은 왼쪽은 int[], 오른쪽은 Object[] (toArray() 반환형 Object[])
//        아래 두가지는 사용 가능
        Object[] objArray = aList2.toArray();
        System.out.println(Arrays.toString(objArray));
//        Integer[] intArray = (Integer[]) aList2.toArray();
//        System.out.println(Arrays.toString(intArray));
//        ClassCastException (Object[] > Integer[] 다운캐스팅하면서 발생)

//        어떨게 하면 Integer[]로 변환할수 있을까
        Integer[] intArray = aList2.toArray(new Integer[0]);
        Integer[] intArray2 = aList2.toArray(new Integer[aList2.size()]); // 가능은 하나 잘 안씀
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArray2));
//        new Integer[0]은 0의 크기를 가진 배열을 만드는게 아니라
//        aList2.size()와 같은 배열크기로 만들라는 약속.

//        13. contains (탐색)
        boolean exist = aList2.contains(Integer.valueOf(100));
        System.out.println(exist ? "탐색성공" : "탐색실패");

//        14. iterator (컬렉션 요소를 순차적으로 탐색)
        Iterator<Integer> iterator = aList2.iterator();
//        탐색자는 다음 요소가 존재하면 true, 끝에 도달했으미녀 fales 리턴
//        탐색자는 일조의 자료구조상의 로봇(처음부터 끝까지 탐색하는 기능)
//        자동으로 끝을 알려주기 때문에 while 문에서도 안전함 (무한루프 가능성x)
        while (iterator.hasNext()){
            Integer a = iterator.next();
//            현재 탐색자가 위치한 요소(객체)를 반환하고 자동으로 다음으로 넘어감
//            그러므로 따로 증감식이 필요없음
            System.out.print(a);
        }
        System.out.println();
    }
}
