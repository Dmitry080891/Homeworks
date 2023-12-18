package ru.innopolis.java.homework012;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    public static void main(String[] args) throws ParseException {
        DateFormat birthdate = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Введите: Фамилия Имя Отчество датарождения номертелефона пол возраст; разделяя пробелом");
        Scanner scanner = new Scanner(System.in);
        String personInfo = scanner.nextLine();
        List<Person> personList = new ArrayList<>();
        String[] inputString = personInfo.split("\\s+");
                    Person newPerson = new Person(
                    inputString[0],
                    inputString[1],
                    inputString[2],
                    birthdate.parse(inputString[3]),
                    Long.parseLong(inputString[4]),
                    inputString[5],
                    Integer.parseInt(inputString[6]) );
            personList.add(newPerson);


        for (Person printPerson : personList) {
           System.out.println(printPerson);
       }
        }




    }



