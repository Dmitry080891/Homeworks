package ru.innopolis.java.homework05;
import java.util.Arrays;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minCount = 0;
        int maxCount = 10;

        tv [] TV = new tv[maxCount];

        for (int i = minCount; i < maxCount; i++) {
            System.out.println("Введите фирму телевизора");
            String name = scanner.nextLine();
            System.out.println("Выбирите номер канала");
            int channelIncluded = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введите уровень громкости от 0 до 100");
            int volumeLevel = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Включен ли телевизор? true или false");
            boolean isTVon = scanner.nextBoolean();
            scanner.nextLine();
            System.out.println(isTVon);
             tv newtv = new tv(name, channelIncluded, volumeLevel, isTVon);

            TV[i] = newtv;
            System.out.println(newtv);
            }
            System.out.println("Введите допустимое значение громкости звука");
            int maxVolume = scanner.nextInt();
            scanner.nextLine();

            for (tv print : TV )
                if ((print.getVolumeLevel() < maxVolume && print.isTVon()) == true) {
                   // Arrays.sort(TV);
                     System.out.println("Включен телевизор " + print.getName() + ", на громкости " + print.getVolumeLevel());

                }


    }
}
