package ru.innopolis.java.Homework02;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Ввидите число строк и столбцов в сетке: ");
        int number = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите исходную строку: ");
        String str = scanner2.nextLine();
        String[][] arr = new String[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                arr[i][j] = str;
                System.out.print(arr[i][j]+ " ");            }
            System.out.println();   }
    }    }