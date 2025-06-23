package a5_class;

import java.util.Date;

public class Order {
//    필드
    long orderId; // 주문번호 : 숫자형 아이디 가능(이 경우 long이 주로 사용됨)
    String userEmail; // 주문자
    String productId; // 주문제품
    Date orderDate; //주문일
    double totalAmount; // 주문수량


//    생성자

    public Order() {
    }

    public Order(long orderId, String userEmail, String productId, Date orderDate, double totalAmount) {
        this.orderId = orderId;
        this.userEmail = userEmail;
        this.productId = productId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

//    메서드
//    주문수량 입력
    public double setTotalAmount(double newAmount){
        this.totalAmount = newAmount;
        return this.totalAmount;
    }
}
