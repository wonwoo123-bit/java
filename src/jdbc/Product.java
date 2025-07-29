package jdbc;

public class Product {
    private int productId;
    private String productName;
    private String unitPackaging;
    private double unitPrice;
    private int stock;

    public Product() {
    }

    public Product(int productId, String productName, String unitPackaging, double unitPrice, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.unitPackaging = unitPackaging;
        this.unitPrice = unitPrice;
        this.stock = stock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUnitPackaging() {
        return unitPackaging;
    }

    public void setUnitPackaging(String unitPackaging) {
        this.unitPackaging = unitPackaging;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", unitPackaging='" + unitPackaging + '\'' +
                ", unitPrice=" + unitPrice +
                ", stock=" + stock +
                '}';
    }
}
