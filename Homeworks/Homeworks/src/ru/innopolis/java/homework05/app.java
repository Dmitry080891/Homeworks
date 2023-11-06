package ru.innopolis.java.homework05;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minCount = 0;
        int maxCount = 2;

        tv [] TV = new tv[maxCount];

        for (int i = minCount; i < maxCount; i++) {
            System.out.println("Введите фирму телевизора");
            String name = scanner.nextLine();
            System.out.println("Выбирите номер канала");
            int channelIncluded = scanner.nextInt();
            System.out.println("Введите уровень громкости от 0 до 100");
            int volumeLevel = scanner.nextInt();
            System.out.println("Включен ли телевизор? true или false");
            boolean isTVon = scanner.nextBoolean();
            //if (isTVon == true) { System.out.println("Включен");}
            //else if (isTVon == false) { System.out.println("Выключен"); }
             tv newtv = new tv(name, channelIncluded, volumeLevel, isTVon);

            TV[TV.length - 1] = newtv;
            System.out.println(newtv);
            }
        /*public static int volume(int [] tv) {
            int maxVolume = 70;

            for (int num : volumeLevel) {
                if (num > maxVolume) {
                    maxVolume = num;
                }
            }
            return maxVolume;
        }*/
    }
}
