package ru.innopolis.java.homework06;

import java.util.Objects;

public class Product {
    private String name;
    private double cost;
    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("Название продукта неможет быть пустой строкой, оно должно быть");
        }
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost < 0) {
            throw new RuntimeException("Стоимость продукта не можетбыть отрицательным числом");
        }
        this.cost = cost;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(cost, product.cost) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        if (cost < 0) {
            throw new RuntimeException("Стоимость продукта не можетбыть отрицательным числом");
        }
        else if (name == null|| name == "") {
            throw new RuntimeException("азвание продукта неможет быть пустой строкой, оно должно быть");
        }
        else return name + " = " + cost;
    }
}
