package ru.innopolis.java.homework07;


import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Хлеб", 40);
        Product product2 = new Product("Молоко", 60);
        DiscountProduct product3 = new DiscountProduct("Торт", 800, 15, LocalDate.now());
        DiscountProduct product4 = new DiscountProduct("Кофе растворимый", 432, 50, LocalDate.now());
        Product product5 = new Product("888", 78);
        Product product6 = new Product("ен", 78);
        Product product7 = new Product("Шоколадка", 0);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);
        System.out.println(product6);
        System.out.println(product7);

    }
}
