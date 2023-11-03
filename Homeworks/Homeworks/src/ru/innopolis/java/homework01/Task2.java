package ru.innopolis.java.homework01;

import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        Random randomVasya = new Random(); //0 - камень, 1 - ножницы, 2- бумага
        Random randomPetya = new Random();
        int a= randomVasya.nextInt(3);
        int b= randomPetya.nextInt(3);
        System.out.println("Вася показывает фигуру: " + a);
        System.out.println("Петя показывает фигуру: " + b);
        if (a==0 && b==1) {System.out.println("Вася выграл");}
        else if (a==0 && b==2) {System.out.println("Петя выграл");}
        else if (a==1 && b==0) {System.out.println("Петя выграл");}
        else if (a==1 && b==2) {System.out.println("Вася выграл");}
        else if (a==2 && b==0) {System.out.println("Вася выграл");}
        else if (a==2 && b==1) {System.out.println("Петя выграл");}
        else {System.out.println("Ничья");}
    }
}
