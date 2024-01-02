package ru.innopolis.java.homework09;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PerformanceCar extends Car {
    private List<String> addOns = new ArrayList<>();

    public PerformanceCar() {
    }

    public PerformanceCar(String brand, String model, Integer yearOfManufacture,
                          Integer power, Integer acceleration, Integer suspension,
                          Integer durability, List<String> addOns) {
        super(brand, model, yearOfManufacture, power, acceleration, suspension, durability);
        this.setPower((int) Double.parseDouble(String.valueOf(super.getPower() * 1.5)));
        this.setSuspension((int) Double.parseDouble(String.valueOf(super.getSuspension() * 0.75)));
        this.addOns = addOns;
    }

    public List<String> getAddOns() {
        return addOns;
    }

    public void setAddOns(List<String> addOns) {
        this.addOns = addOns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PerformanceCar that = (PerformanceCar) o;
        return Objects.equals(addOns, that.addOns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), addOns);
    }

    @Override
    public String toString() {
        return "PerformanceCar{" +
                "addOns=" + addOns +
                '}';
    }
}
