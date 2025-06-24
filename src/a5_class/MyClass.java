package a5_class;

import java.util.Calendar;
import java.util.Date;

public class MyClass {
    public static void main(String[] args) {
        // 학생클래스의 객체 생성
        Student steve = new Student("steve", 25);
        Student tom = new Student(); // 기본생성자
        Student sam = new Student("sam", 29, "대전", "남", 100, 90, 80);
        System.out.println(steve.name);
        System.out.println(tom.name); //null < 문자열에서 0을 뜻함
        System.out.println(sam.name);
//        객체 생성 이후 개별적으로 필드를 수정할 수 있음.
        tom.name = "Tom";
        tom.age = 21;

//        성적조회
        System.out.println(tom.name + " " + tom.age);
        double sumScoreSam = sam.sumScore(); // 메서드의 호출
        System.out.println(sumScoreSam);
        double averageScoreSam = sam.averageScore();
        System.out.println(averageScoreSam);
//        중요 Sam의 성적을 알고 싶으면 Sam의 정보를 담고있는 객체의 메서드를 호출 해야한다.


        Book harry = new Book("해리포터", "J.K.롤링", "14000원");
        System.out.println();
        String harryInfo = harry.printBookInfo();
        System.out.println(harryInfo);                          System.out.println();


        User kim = new User("kim", "kim12@gamil.com","1234");
        System.out.println(kim.password);
        String newPassword = kim.setPassword("asd"); // 객체 지정 이후 함수를 써야 함
        System.out.println(newPassword);
        System.out.println(kim.password);                     System.out.println();


        Product com = new Product("nb001", "Macbook Pro", 10000, 100);
        //가격 다운
        double newPrice = com.setPrice(9000);
        //재고수량 줄이기
        int newStock = com.setStock(20);
        System.out.println(com.price);
        System.out.println(com.stock);                System.out.println();

        //주문생성
        Order order1 = new Order(100, kim, com, new  Date(2025, 5,24), 1);
//        System.out.println(order1.user.username);
        System.out.println(order1.user.email);
        System.out.println(order1.product.productId);
        System.out.println(order1.orderDate);

//        만약 주문자의 이름을 알고 싶은 경우
        System.out.println(order1.user.username);
//        주문자가 회원인지 아닌지 확인하려면

//        주문한 제품이 재고가 있는 확인하려면
        System.out.println(order1.product.stock);


        /*주문 클래스의 필드인 주문자와 주문제품은 User와 Product 클래스에 강한 의존성을 가지고 있음.
        * 주문자와 주문제품은 반드시 User 클래스와 Product 클래스의 객체여야 함.
        * 이런 관계를 가지고 있는 필드의 경우에는 클래스객체 자체를 필드로 가지도록 주문 클래스를 설계할 필요가 있음
        * public class Order {
            User user; // 주문자       객체를 지정하면서 객체 안에 객체를 사용 가능
            Product product; // 주문제품
            }
        * */

//      지역변수의 초기화
        int a; // main 메서드의 지역변수 a
        a = 10; //< 에러. 스택변수는 초기화 해야만 읽을 수 있음,
        System.out.println(a);



    }
}
