package ru.innopolis.java.homework012;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    public static void main(String[] args) throws ParseException {
        DateFormat birthdate = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Введите количество человек для вноса в БД");
        Scanner scannerCount = new Scanner(System.in);
        int count = scannerCount.nextInt();
        int i = 0;
        System.out.println("Введите: Фамилия Имя Отчество датарождения номертелефона пол возраст; разделяя пробелом");
        while (i < count) {
            Scanner scanner = new Scanner(System.in);
            String personInfo = scanner.nextLine();
            List<Person> personList = new ArrayList<>();
            String[] inputString = personInfo.split("\\s+");
            try {
                        Person newPerson = new Person(
                        inputString[0],
                        inputString[1],
                        inputString[2],
                        birthdate.parse(inputString[3]),
                        Long.parseLong(inputString[4]),
                        inputString[5],
                        Integer.parseInt(inputString[6]));
                personList.add(newPerson);
            } catch (InputMismatchException e) {
                System.out.println("Invalid value");
                scanner.nextLine();
            } finally {
                       i++;
            }
            for (Person printPerson : personList) {
                System.out.println(printPerson);
            }
            }


        }




    }



