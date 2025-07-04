package a10_interface_abstract.Abstract;

import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        // Calculator
        Addition addition = new Addition();
        addition.displayResult(2,4); // Result : 6.0
        Multiply multiply = new Multiply();
        multiply.displayResult(2,4); // Result : 8.0

        // Shape
        Shape circle = new Circle(5);
        System.out.println(circle.area()); // 78.53981633974483
        Shape rectangle = new Rectangle(4,6);
        System.out.println(rectangle.area()); // 24

        // Payment
        Payment credit = new CreditCard(20000, "A001",
                "1234-5678", "2030-12-31");
        if (credit.processPayment()) {
            // 결제진행 결과여부에 따라 영수증 발행
            System.out.println(credit.getReceipt());
        }
        Payment mobile = new Mobile(50000, "A001",
                "Kakaopay", true);
        if (mobile.processPayment()) {
            System.out.println(mobile.getReceipt());
        }
        Payment cash1 = new Cash(8000, "A001",
                10000);
        if (cash1.processPayment()) {
            System.out.println(cash1.getReceipt());
        }
        Payment cash2 = new Cash(15000, "A001",
                10000);
        if (cash2.processPayment()) {
            System.out.println(cash2.getReceipt());
        }
    }
}







