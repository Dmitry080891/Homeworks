package ru.innopolis.java.Homework01;

import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите минимальное значение: ");
        int start = scanner.nextInt();
        System.out.print("Введите максимальное значение: ");
        int end = scanner.nextInt();
        Random random = new Random();
        System.out.print("Вывод четырех случайных чисел: ");
        for (int i = 0; i < 4; i++) {
            System.out.print((random.nextInt(end-start)+start) + " ");
        }
        System.exit(0); //Завершает текущую виртуальную машину, не обязательный
    }
}