package ru.innopolis.model;

import java.util.UUID;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.regex.Pattern;

import static java.util.UUID.randomUUID;

public class User {
    private String id = String.valueOf(randomUUID());; //0
    private LocalDateTime date; //1
    private String login; //2
    private String password; //3
    private String confirmPassword; //4
    private String lastName; //5
    private String name; //6
    private String patronimic; //7
    private Integer age; //8
    private Boolean isWorker = false; //9

    public User() {
    }

    public User(String id, LocalDateTime date, String login, String password,
                String confirmPassword, String lastName, String name,
                String patronimic, Integer age, Boolean isWorker) {
        this.id = id;
        this.date = date;
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.lastName = lastName;
        this.name = name;
        this.patronimic = patronimic;
        this.age = age;
        this.isWorker = isWorker;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isEmpty()) {
            throw new InputMismatchException("Id пользователя не может быть пустой строкой");
        }
        else { this.id = id;}
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login == null || login.isEmpty()) {
            throw new InputMismatchException("Логин не может быть пустой строкой");
        }
        else if (Pattern.matches("[0-9]+", login)){
            throw new InputMismatchException("Логин не может быть только из цифр, должен содержать буквы," +
                    " цифры, знак подчеркивания");
        }
        else if (Pattern.matches("[а-яА-Яa-zA-Z\s]+", login)){
            throw new InputMismatchException("Логин не может быть только из букв, должен содержать цифры," +
                    " буквы, знак подчеркивания");
        }
        else if (login.length() > 20) {
            throw new InputMismatchException("Длина логина не должна превышать 20 символов");
        }
        else {
        this.login = login;}
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new InputMismatchException("Пароль не может быть пустой строкой");
        }
        else if (Pattern.matches("[0-9]+", password)){
            throw new InputMismatchException("Пароль не   может   быть   только   из   цифр,   содержит   буквы, цифры, знак подчеркивания");
        }
        else if (Pattern.matches("[а-яА-Яa-zA-Z\s]+", password)){
            throw new InputMismatchException("Пароль не   может   быть   только   из   букв,   содержит   цифры, буквы, знак подчеркивания");
        }
        else if (password.length() > 20) {
            throw new InputMismatchException("Длина пароля не должна превышать 20 символов");
        }
        else {
        this.password = password;}
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        if (password == null || password.isEmpty()) {
            throw new InputMismatchException("Пароль не может быть пустой строкой");
        }
        else if (Pattern.matches("[0-9]+", password)){
            throw new InputMismatchException("Пароль не   может   быть   только   из   цифр,   содержит   буквы, цифры, знак подчеркивания");
        }
        else if (Pattern.matches("[а-яА-Яa-zA-Z\s]+", password)){
            throw new InputMismatchException("Пароль не   может   быть   только   из   букв,   содержит   цифры, буквы, знак подчеркивания");
        }
        else if (password.length() > 20) {
            throw new InputMismatchException("Длина пароля не должна превышать 20 символов");
        }
        else if (!password.equals(confirmPassword)){
            throw new InputMismatchException("Пароль и подтверждение пароля должны совпадать");
        }
        this.confirmPassword = confirmPassword;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!Pattern.matches("[а-яА-Яa-zA-Z\s]+", lastName)) {
            throw new InputMismatchException("Фамилия состоит только из букв");
        }
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!Pattern.matches("[а-яА-Яa-zA-Z\s]+", name)) {
            throw new InputMismatchException("Имя состоит только из букв");
        }
        this.name = name;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public void setPatronimic(String patronimic) {
        if (!Pattern.matches("[а-яА-Яa-zA-Z\s]+", patronimic)) {
            throw new InputMismatchException("Отчество состоит только из букв");
        }
        this.patronimic = patronimic;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 0) {
            throw new InputMismatchException ("Возраст не должен быть отрицательным");
        }
        this.age = age;
    }

    public Boolean getWorker() {
        return isWorker;
    }

    public void setWorker(Boolean worker) {
        isWorker = worker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(date, user.date)
                && Objects.equals(login, user.login) && Objects.equals(password, user.password)
                && Objects.equals(confirmPassword, user.confirmPassword) && Objects.equals(lastName, user.lastName)
                && Objects.equals(name, user.name) && Objects.equals(patronimic, user.patronimic)
                && Objects.equals(age, user.age) && Objects.equals(isWorker, user.isWorker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, login, password, confirmPassword, lastName,
                name, patronimic, age, isWorker);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", LocalDateTime=" + date +
                ", login=" + login +
                ", password=" + password +
                ", confirmPassword=" + confirmPassword +
                ", lastName=" + lastName +
                ", name=" + name +
                ", patronimic=" + patronimic +
                ", age=" + age +
                ", isWorker=" + isWorker +
                '}';
    }
}
