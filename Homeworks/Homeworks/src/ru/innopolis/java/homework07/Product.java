package ru.innopolis.java.homework07;
import java.util.Objects;
import java.util.regex.Pattern;
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
    public void setName(String name) throws RuntimeException {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Название продукта неможет быть пустой строкой, оно должно быть");
        }
        else if (!Pattern.matches("[а-яА-Я]+", name)) {
            throw new RuntimeException("Недопустимое имя продукта" + name);
        }
        else if (name.length() <= 2) {
            throw new RuntimeException("Недопустимое имя продукта" + name);
        }
        else {
            this.name = name;
        }
    }
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) throws RuntimeException {
        if (cost <= 0) {
            throw new RuntimeException("Стоимость продукта не может быть <= 0");
        }
        else {
            this.cost = cost;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(cost, product.cost) == 0 && Objects.equals(name, product.name);    }
    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }


    @Override
     public String toString()
    {
     return "Обычный продукт " + getName() + " = " + getCost();
    }
}
