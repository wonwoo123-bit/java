package a7_collection.Stack;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        /* 스택 (Stack)
         - 후입선출 (Last In First Out)
         - 카드의 덱(deck)이 가장 마지막 위에 놓여진 카드가 먼저 선택되는 것과
           같은 방식으로 실행된느 자료구조
         - 브라우저의 히스토리저장 또는 재귀함수 처리에 사용됨.
         메서드도 스택에 쌓임

        */
        Stack<Integer> stack = new Stack<>();
        // #1. push 입력
        System.out.println("#1");
        stack.push(2);
        stack.push(5);
        stack.push(3);
        stack.push(7);
        System.out.println(stack);
        // #2. peek 읽기 (q와 달리 제일 마지막꺼부터 읽힘 LIFO)
        System.out.println("#2");
        System.out.println(stack.peek()); // 7
        // #3. search 탐색 및 확인(대기번호확인) LIFO로 인해 역순으로 순서를 확인해줌
        System.out.println("#3");
        System.out.println(stack.search(7)); // 1
        System.out.println(stack.search(3)); // 2
        System.out.println(stack.search(5)); // 3
        System.out.println(stack.search(2)); // 4
        System.out.println(stack.search(9)); // -1 (없는 경우)
        // #4. pop (꺼내고 삭제)
        System.out.println("#4");
        System.out.println(stack.pop()); // 7
        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 5
        System.out.println(stack.pop()); // 2
        System.out.println(stack.size()); // 0
    }
}