package org.example;

import java.util.ArrayList;
import java.util.List;

public class ESystem {
    private List<Order> orders;
    private int nextOrderId;

    public ESystem() {
        orders = new ArrayList<>();
        nextOrderId = 1;
    }

    public Order placeOrder(Cart cart) {
        Order order = new Order(nextOrderId++, cart.getProducts());
        orders.add(order);
        cart.getProducts().clear();
        return order;
    }

    public Order getOrderById(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }
}
