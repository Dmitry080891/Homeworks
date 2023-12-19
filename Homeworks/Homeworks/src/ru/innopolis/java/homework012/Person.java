package ru.innopolis.java.homework012;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Person {
    private String lastName;
    private String name;
    private String patronimic;
    private Date birthdate;
    private Long phoneNamber;
    private String sex;
    private Integer age;

    public Person(String lastName, String name, String patronimic, Date birthdate, Long phoneNamber, String sex, Integer age) {
        this.lastName = lastName;
        this.name = name;
        this.patronimic = patronimic;
        this.birthdate = birthdate;
        this.phoneNamber = phoneNamber;
        this.sex = sex;
        this.age = age;
    }

    public Person() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName == " ") {
            throw new RuntimeException("Фамилия должна быть");
        }
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("Имя должно быть");
        } this.name = name;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public void setPatronimic(String patronimic) {
        if (patronimic == null) {
            throw new RuntimeException("Отчество должно быть");
        }
        this.patronimic = patronimic;
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
        if (phoneNamber == null) {
            throw new RuntimeException("Номер телефона должен быть");
        }this.phoneNamber = phoneNamber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex == null) {
            throw new RuntimeException("Пол должен быть указан"); }
        this.sex = sex;
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