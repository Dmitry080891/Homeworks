package ru.innopolis.java.homework07;


import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        DiscountProduct[] discountProducts = new DiscountProduct[2];
        products[0] = new Product("Хлеб", 40);
        products[1] = new Product("Молоко", 60);
        products[2] = new Product("888", 78);
        products[3] = new Product("ен", 78);
        products[4] = new Product("Шоколадка", 0);
        discountProducts[0] = new DiscountProduct("Торт", 800, 15, LocalDate.now());
        discountProducts[1] = new DiscountProduct("Кофе растворимый", 432, 50, LocalDate.now());
        for (DiscountProduct printDiscountProduct : discountProducts) {
            System.out.println(printDiscountProduct);
        }
        for (Product printProduct : products) {
            System.out.println(printProduct);
        }

    }
}