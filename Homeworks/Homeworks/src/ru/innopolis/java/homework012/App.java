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
        System.out.println("Введите: Фамилия Имя Отчество дата рождения (в формате дд.мм.гггг) номертелефона (11 цифр) пол(m либо f) возраст; разделяя пробелом");
        while (i < count) {
            Scanner scanner = new Scanner(System.in);
            String personInfo = scanner.nextLine();
            List<Person> personList = new ArrayList<>();
            String[] inputString = personInfo.split("\\s+");
            try {
                    Person newPerson = new Person();
                    newPerson.setLastName(inputString[0]);
                    newPerson.setName(inputString[1]);
                    newPerson.setPatronimic(inputString[2]);
                    newPerson.setBirthdate(birthdate.parse(inputString[3]));
                    newPerson.setPhoneNamber(Long.parseLong(inputString[4]));
                    newPerson.setSex(inputString[5]);
                    newPerson.setAge(Integer.parseInt(inputString[6]));
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



