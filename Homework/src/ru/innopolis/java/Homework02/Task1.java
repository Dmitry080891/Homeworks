package ru.innopolis.java.Homework02;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах по Фарингейту: ");
        double tempF = scanner.nextDouble();
        double tempC = (tempF - 32)*5/9;
        System.out.println("Градусы по Цельсию: " + tempC);
    }
}