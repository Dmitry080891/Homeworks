package ru.innopolis.java.Homework02;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int number1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите второе целое число: ");
        int number2 = scanner2.nextInt();
        int sum = number1 + number2;     System.out.println("Сумма двух целых чисел: " + sum);
        int dif = number1 - number2;     System.out.println("Разница двух целых чисел: " + dif);
        int mult = number1 * number2;    System.out.println("Произведение двух целых чисел: " + mult);
        double avarage = (number1 + number2)/2;     System.out.println("Среднее двух целых чисел: " + avarage);
        int distance = Math.abs(number1 - number2);     System.out.println("Расстояние двух целых чисел: " + distance);
        System.out.println(number1 > number2 ? "Максимальное целое число: "+ number1: "Максимальное целое число: "+ number2);
        System.out.println(number1 < number2 ? "Минимальное целое число: "+ number1: "Минимальное целое число: "+ number2);
    }
}
