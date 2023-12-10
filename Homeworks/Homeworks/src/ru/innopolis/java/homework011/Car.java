package ru.innopolis.java.homework011;

import java.util.Objects;

public class Car {
    private String idCar;
    private String brandCar;
    private String colorCar;
    private double mileageCar;
    private double priceCar;

    public Car() {
    }

    public Car(String idCar, String brandCar, String colorCar, double mileageCar, double priceCar) {
        this.idCar = idCar;
        this.brandCar = brandCar;
        this.colorCar = colorCar;
        this.mileageCar = mileageCar;
        this.priceCar = priceCar;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public double getMileageCar() {
        return mileageCar;
    }

    public void setMileageCar(double mileageCar) {
        this.mileageCar = mileageCar;
    }

    public double getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(double priceCar) {
        this.priceCar = priceCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(idCar, car.idCar) && Objects.equals(brandCar, car.brandCar) && Objects.equals(colorCar, car.colorCar) && Objects.equals(mileageCar, car.mileageCar) && Objects.equals(priceCar, car.priceCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCar, brandCar, colorCar, mileageCar, priceCar);
    }

    @Override
    public String toString() {
        return "Car{" +
                "Автомобильный номер " + idCar + '\'' +
                ", марка машины " + brandCar + '\'' +
                ", цвет " + colorCar + '\'' +
                ", пробег " + mileageCar +
                ", цена " + priceCar +
                '}';
    }
}
