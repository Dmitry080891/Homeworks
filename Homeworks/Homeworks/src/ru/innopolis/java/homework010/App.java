package ru.innopolis.java.homework010;
import java.util.*;
import java.util.Arrays;
public class App {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] rndArray = new int[10];
        System.out.println("Массив из 10 случайных чисел в интервале от 1 до 50:");
        for(int i = 0; i < rndArray.length; i++) {
            rndArray[i] = rnd.nextInt((50-1)+1);
            System.out.print(rndArray[i] + "  ");
        }
        System.out.println();
         ByCondition conditionOne = number -> number % 2 == 0 && number != 0;
        System.out.println("Чётные элементы массива: " + Arrays.toString(Sequence.filter(rndArray, conditionOne)));

        ByCondition evenNumbersSumCondition = number -> {
            int sum = 0;
            for (int pos = 0; pos < rndArray.length; pos++) {
                 sum = sum + rndArray[pos];}

            System.out.println("Сумма всех чисел массива: " + sum);
             if (sum % 2 == 0){
                System.out.println("Сумма - четная");
            } else System.out.println("Сумма - нечетная");
            return true;
        };
        int[] sumOfDigitsEvenNumber = Sequence.filter(rndArray, evenNumbersSumCondition);
        //System.out.println("Сумма массива: " +Arrays.toString(sumOfDigitsEvenNumber));
        }
}
