package jdbc;

public class OrderDetail {
    private String orderID;
    private int productID;
    private double unitPrice;
    private int quantity;
    private double discount;

    public OrderDetail() {
    }

    public OrderDetail(String orderID, int productID, double unitPrice, int quantity, double discount) {
        this.orderID = orderID;
        this.productID = productID;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderID='" + orderID + '\'' +
                ", productID=" + productID +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", discount=" + discount +
                '}';
    }
}
