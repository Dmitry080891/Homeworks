package ru.innopolis.java.homework06;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private double cash;
    public Person(String name, double cash) {
        this.name = name;
        this.cash = cash;
    }
    static void Bag(List<? extends Product> products)
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("Имя не может быть пустой строкой");
        }
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        if (cash < 0) {
            throw new RuntimeException("Деньги немогут быть отрицательным числом");
        }
        this.cash = cash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(cash, person.cash) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cash);
    }

    @Override
    public String toString() {
        if (cash < 0) {
            throw new RuntimeException("Деньги немогут быть отрицательным числом");
        }
        else if (name == null|| name == "") {
            throw new RuntimeException("Имя не может быть пустой строкой");
        }
        else return name + " = " + cash;
    }
}
