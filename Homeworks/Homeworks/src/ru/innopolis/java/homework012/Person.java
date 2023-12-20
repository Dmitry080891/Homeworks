package ru.innopolis.java.homework012;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Pattern;

public class Person {
    private String lastName;
    private String name;
    private String patronimic;
    private Date birthdate;
    private Long phoneNamber;
    private String sex;
    private Integer age;

    public Person(String lastName, String name, String patronimic, Date birthdate, Long phoneNamber, String sex, Integer age) {
        this.setLastName(lastName);
        this.setName(name);
        this.setPatronimic(patronimic);
        this.setBirthdate(birthdate);
        this.setPhoneNamber(phoneNamber);
        this.setSex(sex);
        this.setAge(age);
    }

    public Person() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            throw new RuntimeException("Фамилия не может быть пустой строкой, она должна быть");
        }
        else if (!Pattern.matches("[а-яА-Я\s]+", lastName)) {
            throw new RuntimeException("Недопустимые параметры ввода");
        }
        else if (lastName.length() <= 2) {
            throw new RuntimeException("Недопустимые параметры ввода");
        }
        else {
             this.lastName = lastName;
    }}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Имя не может быть пустой строкой, оно должно быть");
        }
        else if (!Pattern.matches("[а-яА-Я\s]+", name)) {
            throw new RuntimeException("Недопустимые параметры ввода");
        }
        else if (name.length() <= 2) {
            throw new RuntimeException("Недопустимые параметры ввода");
        }
        else {
            this.name = name;
        }}

    public String getPatronimic() {
        return patronimic;
    }

    public void setPatronimic(String patronimic) {
        if (patronimic == null || patronimic.isEmpty()) {
            throw new RuntimeException("Отчество не может быть пустой строкой, оно должно быть");
        }
        else if (!Pattern.matches("[а-яА-Я\s]+", patronimic)) {
            throw new RuntimeException("Недопустимые параметры ввода");
        }
        else if (patronimic.length() <= 2) {
            throw new RuntimeException("Недопустимые параметры ввода");
        }
        else {
            this.patronimic = patronimic;
        }
    }


 public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        if (birthdate == null) {
            throw new RuntimeException("Дата рождения должна быть");
        }
         this.birthdate = birthdate;
    }

    public Long getPhoneNamber() {
        return phoneNamber;
    }

    public void setPhoneNamber(Long phoneNamber) {
      /*  if (phoneNamber == null || phoneNamber.isEmpty()) {
            throw new RuntimeException("Номер телефона должен быть указан");
        }
        else if (!Pattern.matches("[0-9]+", phoneNamber)) {
            throw new RuntimeException("Недопустимые параметры ввода");
        }*/
         if (phoneNamber.longValue() < 11) {
            throw new RuntimeException("Недопустимые параметры ввода");
        }
        else {this.phoneNamber = phoneNamber;}
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex == null || sex.isEmpty()) {
            throw new RuntimeException("Пол должен быть указан");
        }
        else if (!Pattern.matches("[fm]+", sex)) {
            throw new RuntimeException("Недопустимые параметры ввода");
        }
        else if (sex.length() > 1) {
            throw new RuntimeException("Недопустимые параметры ввода");
        }
        else {
        this.sex = sex;}
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age == null) {
            throw new RuntimeException("Возраст должен быть указан"); }
        this.age = age;
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastName, person.lastName) && Objects.equals(name, person.name) && Objects.equals(patronimic, person.patronimic) && Objects.equals(birthdate, person.birthdate) && Objects.equals(phoneNamber, person.phoneNamber) && Objects.equals(sex, person.sex) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, name, patronimic, birthdate, phoneNamber, sex, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Фамилия: " + lastName + '\'' +
                ", имя: " + name + '\'' +
                ", отчество: " + patronimic + '\'' +
                ", дата рождения: " + birthdate + '\'' +
                ", номер телефона: " + phoneNamber +
                ", пол: " + sex + '\'' +
                ", возраст: " + age +
                '}';
    }
}