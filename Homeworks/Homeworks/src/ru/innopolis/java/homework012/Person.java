package ru.innopolis.java.homework012;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Person {
    private String lastName;
    private String name;
    private String fatherName;
    private Date birthdate;
   /* private Date birthdate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }*/
    private Long phoneNamber;
    private String sex;
    private Integer age;

    public Person(String lastName, String name, String fatherName, Date birthdate, Long phoneNamber, String sex, Integer age) {
        this.lastName = lastName;
        this.name = name;
        this.fatherName = fatherName;
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
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Long getPhoneNamber() {
        return phoneNamber;
    }

    public void setPhoneNamber(Long phoneNamber) {
        this.phoneNamber = phoneNamber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastName, person.lastName) && Objects.equals(name, person.name) && Objects.equals(fatherName, person.fatherName) && Objects.equals(birthdate, person.birthdate) && Objects.equals(phoneNamber, person.phoneNamber) && Objects.equals(sex, person.sex) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, name, fatherName, birthdate, phoneNamber, sex, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", phoneNamber=" + phoneNamber +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}