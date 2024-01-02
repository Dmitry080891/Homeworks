package ru.innopolis.java.homework09;

import java.util.List;

public class Garage {
    private List<Car> parkedCars;

    public Garage() {
    }

    public Garage(List<Car> parkedCars) {
        this.parkedCars = parkedCars;
    }

    public List<Car> getParkedCars() {
        return parkedCars;
    }

    public void setParkedCars(Car car) {
        this.parkedCars.add(car);
    }
    //public PerformanceCar tuningCar (PerformanceCar performanceCar, String addOns){
   //     switch (addOns){
    //        case ("SportCar"):
      //  }
   // }
}
