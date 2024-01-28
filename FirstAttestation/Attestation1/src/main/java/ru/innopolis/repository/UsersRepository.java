package ru.innopolis.repository;

import ru.innopolis.model.User;

import java.io.IOException;
import java.util.List;

public interface UsersRepository {
  void create(User user) throws IOException; //cоздание   пользователя   и   запись   его   вфайл
  User findById(String id) throws IOException; // поиск пользователя в файле поидентификатору
  List<User> findAll() throws IOException; // выгрузка всех пользователей из файла
  void update(User user); //обновление   полей   существующего   вфайле пользователя
  void deleteById(String id) throws IOException; //удаление   пользователя   поидентификатору
  void deleteAll() throws IOException;  //удаление всех пользователей
}
