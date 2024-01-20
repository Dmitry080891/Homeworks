package ru.innopolis.java.homework013;
import java.util.Scanner;
import java.util.regex.Pattern;
public class App {
    public static void parseCount(String input) {
        if (input == null || input.isEmpty()) {
            throw new NumberFormatException("Необходимо ввести данные");
        }
        else if (!Pattern.matches("[0-9]+", input)){
            throw new NumberFormatException("Невалидное значение, данные указываются в цифрах");
        }
        else {
            int parsedInteger = Integer.parseInt(input.trim());
            System.out.println("Результат = " + parsedInteger);
        }
    }
    public static void validateCount(){
        System.out.println("Введите целочисленное значение: ");
        Scanner scanner = new Scanner(System.in);
        String validateCount = scanner.nextLine();
        parseCount(validateCount);
    }
    public static void parseNumber(String input) {
        if (input == null || input.isEmpty()) {
            throw new NumberFormatException("Необходимо ввести данные");
        }
        else if (!Pattern.matches("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?", input)){
            throw new NumberFormatException("Невалидное значение, данные указываются в цифрах, целое и дробное числоразделены точкой (.)");
        }
        else {
            double parsedDouble = Double.parseDouble(input.trim());
            System.out.println("Результат = " + parsedDouble);
        }
    }
    public static void validateNumber(){
        System.out.println("Введите дробное число: ");
        Scanner scanner = new Scanner(System.in);
        String validateNumber = scanner.nextLine();
        parseNumber(validateNumber);
    }
    public static void main(String[] args){
        validateNumber ();
        validateCount ();

    }


}
