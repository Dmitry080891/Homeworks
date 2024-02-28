package ru.innopolis;

import ru.innopolis.model.User;
import ru.innopolis.repository.UsersRepository;
import ru.innopolis.repository.UsersRepositoryFileImpl;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        UsersRepository usersRepository = new UsersRepositoryFileImpl();
            for (int i = 0; i < 5; i++) {
            User user = new User();
            usersRepository.create(user);
            System.out.println("Создан пользователь: " + user);
        }

        // Выгрузка и отображение всех пользователей
        List<User> allUsers = usersRepository.findAll();
        System.out.println("Все пользователи: ");
        allUsers.forEach(System.out::println);

        // Демонстрация других функций (поиск, обновление, удаление) с использованием первого пользователя
        if (!allUsers.isEmpty()) {
            User firstUser = allUsers.get(0);

            // Поиск первого пользователя
            User foundUser = usersRepository.findById(firstUser.getId());
            System.out.println("Найден пользователь: " + foundUser);

            // Обновление пользователя
            firstUser.setLogin("updated" + firstUser.getLogin());
            usersRepository.update(firstUser);
            System.out.println("Обновленный пользователь: " + usersRepository.findById(firstUser.getId()));

            // Удаление пользователя
            usersRepository.deleteById(firstUser.getId());
            System.out.println("Пользователи после удаления первого пользователя:");
            usersRepository.findAll().forEach(System.out::println);
        }

        // Удаление всех пользователей
        usersRepository.deleteAll();
        System.out.println("Пользователи после полного удаления:");
        usersRepository.findAll().forEach(System.out::println);
    }

}