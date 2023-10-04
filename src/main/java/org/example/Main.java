package org.example;

import  java.util.ArrayList;
import java.util.List;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return  id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}

class Cart {
    private  List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public  List<Product> getProducts() {
        return products;
    }
}