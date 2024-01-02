package ru.innopolis.java.homework09;

import java.util.Objects;

public class Car {
    private String brand; //марка
    private String model; //модель
    private Integer  yearOfManufacture; //год выпуска
    private Integer power; //мощность в лошадиных силах
    private Integer acceleration; //ускорение
    private Integer suspension; //подвеска
    private Integer durability; //долговечность

    public Car() {
    }

    public Car(String brand, String model, Integer yearOfManufacture,
               Integer power, Integer acceleration, Integer suspension,
               Integer durability) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.power = power;
        this.acceleration = acceleration;
        this.suspension = suspension;
        this.durability = durability;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(Integer yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Integer acceleration) {
        this.acceleration = acceleration;
    }

    public Integer getSuspension() {
        return suspension;
    }

    public void setSuspension(Integer suspension) {
        this.suspension = suspension;
    }

    public Integer getDurability() {
        return durability;
    }

    public void setDurability(Integer durability) {
        this.durability = durability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model)
                && Objects.equals(yearOfManufacture, car.yearOfManufacture) && Objects.equals(power, car.power)
                && Objects.equals(acceleration, car.acceleration) && Objects.equals(suspension, car.suspension)
                && Objects.equals(durability, car.durability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfManufacture, power, acceleration, suspension, durability);
    }

    @Override
    public String toString() {
        return "Car{" +
                "Марка - " + brand +
                ", модель -" + model +
                ", год выпуска - " + yearOfManufacture +
                ", мощность в лошадинных силах - " + power +
                ", ускорение - " + acceleration +
                ", подвеска - " + suspension +
                ", долговечность - " + durability +
                '}';
    }
}
