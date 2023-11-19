package ru.innopolis.java.homework07;
import java.util.Objects;
import java.util.regex.Pattern;
public class Product {
    private String name;
    private double cost;
    public Product(String name, double cost) { this.name = name; this.cost = cost;  }

    public String getName() {
        if (name == null || name == "") {
            System.out.println("Название продукта неможет быть пустой строкой, оно должно быть");
        } else if (Pattern.matches("[а-яА-Я]+" , name) == false) {
            System.out.println("Недопустимое имя продукта");
        } else if (name.length() <= 2) {
            System.out.println("Недопустимое имя продукта");
        }
        return name;
    }
    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("Название продукта неможет быть пустой строкой, оно должно быть");
        }
        this.name = name;    }
    public double getCost() {
        if (cost <= 0) {
            System.out.println("Стоимость продукта не может быть <= 0" );       }
        return cost;    }

    public void setCost(double cost) {
        if (cost <= 0) {
            System.out.println("Стоимость продукта не может быть <= 0" );       }
        this.cost = cost;    }
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
    public String toString() {

        return "Обычный продукт " + getName() + " = " + getCost();
    }
    /* public String toString() {
        if (cost <= 0) {
            //throw new RuntimeException("Стоимость продукта не может быть <= 0");
            System.out.println("Стоимость продукта не может быть <= 0");
        }
        else if (name == null|| name == "") {
            //throw new RuntimeException("Название продукта неможет быть пустой строкой, оно должно быть");
            System.out.println("Название продукта неможет быть пустой строкой, оно должно быть");
        }
        else if // throw new RuntimeException("Недопустимое имя продукта");
             ((Pattern.matches("[a-zA-Z]+", name) == false) && (name.length() < 2))
                System.out.println("Недопустимое имя продукта");
          return "Обычный продукт " + name + " = " + cost;
    }*/
}
