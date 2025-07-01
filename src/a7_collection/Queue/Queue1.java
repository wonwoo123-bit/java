package a7_collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        /* 큐 (인터페이스)
        - 선입선출 FIFO (=First In First Out)
        - 주로 키 입력 또는 메서드 호출등 이벤트 처리에 사용됨.
        - 먼저 들어온 객체정보를 먼저 사용함
        - 구현체로 LinkedList 또는 PriorityQueue를 많이 사용
        - 자판기 개념임 : 값을 정해놓은 상태에서 시작하기 때문
        */

        Queue<Integer> q1 = new LinkedList<>();
//        LinkedList는 List의 구현체이면서 동시에 Queue의 구현체이기도 함
//        1. add 추가 (Queue의 사이즈가 전부 차서 추가할 수 없으면 에러발생)
        System.out.println("#1");
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println(q1);

//        2. element
        System.out.println("#2");
        System.out.println(q1.element());
        System.out.println(q1.element());
//        FIFO 이므로 가장 먼저 들어간 자료를 읽는다. 그래서 출력시 3이 나옴. (element = 읽어야 하는 자료의 첫번째)

//        3. remove (중요) (element + 삭제 라고 함)
        System.out.println("#3");
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
//        System.out.println(q1.remove()); 값이 비어 출력x
//        remove 사용시 꺼내면서 삭제 / 출력되면 삭제되서 다음 것을 출력하면 사라져있음.

//        안정장치가 있는 메서드들
        Queue<Integer> q2 = new LinkedList<>();
//        4. offer (Q가 다 차도 에러가 발생하지 않고 추가안함)
        System.out.println("#4");
        q2.offer(3);
        q2.offer(4);
        q2.offer(5);
        System.out.println(q2);

//        5.peek 읽기 (빈 큐를 읽어도 에러가 발생하지 않음)
        System.out.println("#5");
        System.out.println(q2.peek());

//      6. poll 꺼내면서 삭제 (큐가 다 비워져도 에러 발생하지 않음)
        System.out.println("#6");
        System.out.println(q2.poll());
        System.out.println(q2.poll());
        System.out.println(q2.poll());
        System.out.println(q2.poll()); // remove 처럼 값이 비면 오류가 나오는것이 아닌 null로 표시됨.


    }
}
