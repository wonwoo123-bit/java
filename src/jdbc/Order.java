package jdbc;

import java.time.LocalDate;

public class Order {
    private String orderId;
    private String customerId;
    private String employeeId;
    private LocalDate orderDate;
    private LocalDate requestDate;
    private LocalDate shipDate;

    public Order() {
    }

    public Order(String orderId, String customerId, String employeeId, LocalDate orderDate, LocalDate requestDate, LocalDate shipDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.orderDate = orderDate;
        this.requestDate = requestDate;
        this.shipDate = shipDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public LocalDate getShipDate() {
        return shipDate;
    }

    public void setShipDate(LocalDate shipDate) {
        this.shipDate = shipDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", orderDate=" + orderDate +
                ", requestDate=" + requestDate +
                ", shipDate=" + shipDate +
                '}';
    }
}
