package ru.innopolis.java.homework02;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите исходную строку: ");
        String str = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Сколько раз вывести строку? ");
        int number = scanner2.nextInt();
        int i = 0;
        while (i<number) {
            System.out.print(str);
            i++;
        }
    }
}
