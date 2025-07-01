package a7_collection.Map;

import java.util.HashMap;
import java.util.Map;

// 사용자 클래스
class User{
    String userId; //유일성을 가진 데이터
    String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "userId=" + this.userId + ", name=" + this.name;
    }
}


public class HashMap1 {
    public static void main(String[] args) {
        /* 맵의 특징
         - 사전(dictionary)구조와 유사 (색인을 통해 값을 탐색)
         - 저장방식 : key - value 쌍으로 저장 (List, set은 단일 값 저장방식)

                    Map         List              Set
           저장방식  key-value    단일 값           단일 값
           자료식별  key로 식별    인덱스 값 get(i)  값 그 자체
           중복여부  key 중복x     중복 가능          중복x
                   value 가능
             순서   순서보장 x     순서보장 O        순서보장 x

             '단어(key)'를 찾으면 그에 해당하는 '뜻(value)'가 나오는 구조
             key를 통해 매우 빠르게 검색이 가능함
             구조적으로는 Set와 매우 유사함
             hashmap이 많이 쓰임
        * */
//        <key, value> 키는 문자열, 값은 객체를 넣겠다는 의미
//        Set<User> userSet = new HashSet<>();
//        일반적으로 key에는 Long(순서아이디) 또는 String을 사용함
        Map<String, User> userMap = new HashMap<>();

//        객체생성
        User u1 = new User("user01","Steve"); // userId, name
        User u2 = new User("user02","Tom");
        User u3 = new User("user03","Alice");

//        Map에 User 객체 저장.Key로 userId를 사용
//        Value에는 객체 자체를 저장함
//        put(key, value) put이 add 대신임
//        key의 값은 어떤것이 와도 상관없으나 그 값이 유일성만 띄우면 됨
        userMap.put(u1.userId, u1);
        userMap.put(u2.userId, u2);
        userMap.put(u3.userId, u3);


//        검색
        User user = userMap.get("user02"); // key 입력
        System.out.println(user);

        System.out.println("#반복");
//        단일요소를 저장하는 List, Set은 쉽게 요소를 읽을 수 있지만
//        Map은 <Key, value> 쌍으로 존재하므로 Entry 라는 클래스가 필요
        for (Map.Entry<String,User> data : userMap.entrySet()){
            String key = data.getKey(); // key 읽기
            User u = data.getValue(); // value 읽기
            System.out.println(key + " : " + u);
        }


    }
}
