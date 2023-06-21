package com.myapp;

import com.myapp.model.Product;    //import klasy product
import com.myapp.model.ShoppingCart; //import klasy ShoppingCart
import com.myapp.service.ShopService; //import klasy ShopService

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 2500.0);
        Product product2 = new Product("Smartphone", 1500.0);
        Product product3 = new Product("Headphones", 250.0);

        ShoppingCart cart = new ShoppingCart();
        ShopService shopService = new ShopService();

        shopService.addToCart(cart, product1);
        shopService.addToCart(cart, product2);
        shopService.addToCart(cart, product3);

        double totalPrice = shopService.calculateTotalPrice(cart);
        System.out.println("Total Price: " + totalPrice);
    }
}
