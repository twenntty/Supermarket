package org.example;

import java.util.List;

public class Order {
    private final int orderId;
    private final List<Product> products;
    private String status;

    public Order(int orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        this.status = "В обробці";
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getStatus() {
        return  status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}