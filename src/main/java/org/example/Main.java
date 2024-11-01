package org.example;

import sin_solid.*;

public class Main {
    public static void main(String[] args) {
                Product electronicProduct = new Product("Smartphone", 1000.0, "Electronics");
                Product clothingProduct = new Product("T-shirt", 20.0, "Clothing");

                Order order1 = new Order(electronicProduct, 2);
                Order order2 = new Order(clothingProduct, 5);

                electronicProduct.saveToDatabase();
                clothingProduct.saveToDatabase();

                System.out.println("Precio total del pedido 1:");
                order1.printReceipt();

                System.out.println("\nPrecio total del pedido 2:");
                order2.printReceipt();

    }
}