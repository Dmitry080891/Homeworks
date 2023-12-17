package ru.innopolis.java.homework011;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class App {
    public static void main(String[] args) {
        String carCatalog = "a123me|Mercedes|White|0|8300000\n" +
                "b873of|Volga|Black|0|673000\n" +
                "w487mn|Lexus|Grey|76000|900000\n" +
                "p987hj|Volga|Red|610|704340\n" +
                "c987ss|Toyota|White|254000|761000\n" +
                "o983op|Toyota|Black|698000|740000\n" +
                "p146op|BMW|White|271000|850000\n" +
                "u893ii|Toyota|Purple|210900|440000\n" +
                "l097df|Toyota|Black|108000|780000\n" +
                "y876wd|Toyota|Black|160000|1000000";
        List<Car> carList = new ArrayList<>();
        String[] inputStrArray = carCatalog.split("\n");
        int inputStrLength= inputStrArray.length;
    for(String inputStr : inputStrArray) {
        String[] infoCarText = inputStr.split("\\|");
        Car newCar = new Car(infoCarText[0],
                infoCarText[1],
                infoCarText[2],
                Double.parseDouble(infoCarText[3]),
                Double.parseDouble(infoCarText[4])
        );
        carList.add(newCar);
    }
        Consumer<Car> printCatalog = car -> System.out.println(car.toString());
        Consumer<Car> printIdCar = car -> System.out.println(car.getIdCar());
        Predicate<Car> colorOrMileageToFind = car -> car.getMileageCar() == 0 ||
                Objects.equals(car.getColorCar(), "Black");
        System.out.println("Автомобили в базе: ");
        Stream<Car> catalogStream = carList.stream();
        catalogStream
                .forEach(printCatalog);
        System.out.println("Номера автомобилей без пробега или черного цвета: ");
        Stream<Car> colorOrMileageToFindStream = carList.stream();
        colorOrMileageToFindStream
                .filter(colorOrMileageToFind)
                .forEach(printIdCar);
       // 2) Количество уникальных моделей в ценовом диапазоне от n до m тыс.
        System.out.println("Количество уникальных моделей в ценовом диапазоне от 100 тыс. до 1 млн: ");
        Predicate<Car> priceToFind = car -> car.getPriceCar() >= 100000 && car.getPriceCar() <= 1000000;
        Map<String, Long> x = carList.stream()
                .filter(priceToFind)
                .distinct()
                .collect(Collectors.groupingBy(Car::getBrandCar, Collectors.counting()));
        System.out.println(x);

   // 3) Вывести цвет автомобиля с минимальной стоимостью.
        System.out.println("Цвет автомобиля с минимальной стоимостью: ");
        Consumer<Car> printColorMinPrice = car -> System.out.println(car.getColorCar());
        Stream<Car> priceMinStream = carList.stream();
        priceMinStream
                .min(Comparator.comparingDouble(Car::getPriceCar))
                .ifPresent(printColorMinPrice);

     //   4) Среднюю стоимость искомой модели modelToFind
        System.out.println("Средняя стоимость искомой модели Toyota: ");
        Predicate<Car> brandToFind = car ->  Objects.equals(car.getBrandCar(), "Toyota");
        Stream<Car> midlePriceBrandStream = carList.stream();
        Double average = midlePriceBrandStream
                .filter(brandToFind)
                .collect(Collectors.averagingDouble(Car::getPriceCar));
        System.out.println(average);
    }
}
