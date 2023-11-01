package ru.innopolis.java.Homework04;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int leftLimit = 45; //     45 = -     60 = <           62 = >
        int rightLimit = 62; //
        int targetStringLength = 106;
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i < 46 || i > 59) && (i <= 60 || i >= 62))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        //String generatedString = ">>-->>>-->>>--><--<<<--<<<--<<"; // проверка всего 6 стрел, по 3 каждой
        System.out.println(generatedString);
        String arrow1 = ">>-->";
        String arrow2 = "<--<<";
        System.out.println(generatedString.split(arrow1, -1).length-1 + generatedString.split(arrow2, -1).length-1);
    }
}
