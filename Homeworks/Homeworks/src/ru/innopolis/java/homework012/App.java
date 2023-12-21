package ru.innopolis.java.homework012;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws ParseException, IOException {
        DateFormat birthdate = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Введите количество человек для вноса в БД");

            Scanner scannerCount = new Scanner(System.in);
            int count = scannerCount.nextInt();
            if (count < 0) {
                throw new InputMismatchException("вносимые люди не могут быть отрицательными");
            }
            int i = 0;
            while (i < count) {
            System.out.println("Введите: Фамилия Имя Отчество дата рождения (в формате дд.мм.гггг) номертелефона (11 цифр) пол(m либо f) возраст; разделяя пробелом");
            Scanner scanner = new Scanner(System.in);
            String personInfo = scanner.nextLine();
            List<Person> personList = new ArrayList<>();
            String[] inputString = personInfo.split("\\s+");
            try {
                    Person newPerson = new Person();
                    newPerson.setLastName(inputString[0]);
                    newPerson.setName(inputString[1]);
                    newPerson.setPatronimic(inputString[2]);
              if (!Pattern.matches("(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).((19|20)\\d\\d)", inputString[3])){
                  throw new InputMismatchException("Дата указывается в интepвaлe oт 1900 дo 2099 года");
              }
                    newPerson.setBirthdate(birthdate.parse(inputString[3]));
                    if (!Pattern.matches("[0-9]+", inputString[4])){
                        throw new InputMismatchException("Номер телефона указывается в цифрах");
                    }
                    newPerson.setPhoneNamber(Long.parseLong(inputString[4]));
                    newPerson.setSex(inputString[5]);
                    if (!Pattern.matches("[0-9]+", inputString[6])){
                        throw new InputMismatchException("Возраст указывается в цифрах");
                    }
                    newPerson.setAge(Integer.parseInt(inputString[6]));
                    personList.add(newPerson);
            } catch (InputMismatchException e) {
                System.out.println("Не правильный ввод");
                System.out.println(e.getMessage());
            } finally {
                       i++;
            }
            for (Person printPerson : personList) {
                System.out.println(printPerson);
            }

                try(FileWriter writer = new FileWriter(inputString[0]))
                {
                    String text = personList.toString();
                    writer.write(text);

                    writer.flush();
                }
                catch(IOException ex){

                    System.out.println(ex.getMessage());
                }
            }
        }
}



