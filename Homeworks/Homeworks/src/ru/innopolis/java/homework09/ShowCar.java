package ru.innopolis.java.homework09;


import java.util.Objects;

public class ShowCar extends Car{
    private Integer stars = 0;

    public ShowCar() {
    }

    public ShowCar(String brand, String model, Integer yearOfManufacture,
                   Integer power, Integer acceleration, Integer suspension,
                   Integer durability, Integer stars) {
        super(brand, model, yearOfManufacture, power, acceleration, suspension, durability);
        this.stars = stars;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ShowCar showCar = (ShowCar) o;
        return Objects.equals(stars, showCar.stars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stars);
    }

    @Override
    public String toString() {
        return "Looking cool there, bro. ShowCar{" +
                "stars=" + stars +
                '}';
    }
}
