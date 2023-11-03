package ru.innopolis.java.homework04;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String keyboard = "qwertyuiopasdfghjklzxcvbnm";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите одну маленькую букву английского алфавита: ");
        String letter = scanner.nextLine();
        int value = keyboard.indexOf(letter);
        if (value > 0){
            System.out.println("Слева от заданной буквы находится: " + keyboard.charAt(value-1));
        }        else {System.out.println("Слева от заданной буквы находится: " + keyboard.charAt(25));
        }
    }}
