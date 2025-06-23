package a5_class;

public class Product {
//    필드
    String productId; //제품아이디 (고유값)
    String productName; //제품명
    double price; //가격 (계산 편의성 때문에 double을 주로 사용)
    int stock; // 재고 수량

    //생성자

    public Product() {
    }

    public Product(String productId, String productName, double price, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

//    메서드
//    가격설정 메서드
    public double setPrice(double newPrice){
        this.price = newPrice;
        return this.price;
    }

//    재고설정
    public int setStock(int newStock){
        this.stock = newStock;
        return this.stock;
    }
}
