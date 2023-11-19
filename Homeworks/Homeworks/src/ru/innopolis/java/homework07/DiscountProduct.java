package ru.innopolis.java.homework07;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;


public class DiscountProduct extends Product {
    private double discount;
    private LocalDate discountLastDay = LocalDate.now();

    public DiscountProduct(String name, double cost, double discount, LocalDate discountLastDay) {
        super(name, cost);
        this.discount = discount;
        this.discountLastDay = discountLastDay;
    }
    private double totalPrice;
    public double getTotalPrice() {
        double totalPrice = super.getCost() * ((100 - this.discount) /100);
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {

        this.totalPrice = totalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public LocalDate getDiscountLastDay() {
        return discountLastDay;
    }

    public void setDiscountLastDay(LocalDate discountLastDay) {
        this.discountLastDay = discountLastDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DiscountProduct that = (DiscountProduct) o;
        return Double.compare(discount, that.discount) == 0 && Double.compare(totalPrice, that.totalPrice) == 0 && Objects.equals(discountLastDay, that.discountLastDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount, discountLastDay, totalPrice);
    }

    @Override
    public String toString() {
        return "Акционный продукт " + super.getName() +
                " co скидкой " + getDiscount() +
                "%, только сегодня " + getDiscountLastDay() +
                " итоговая цена " + getTotalPrice();
    }
}

