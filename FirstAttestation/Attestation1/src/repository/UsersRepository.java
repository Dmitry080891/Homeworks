package repository;

import model.User;

import java.util.List;

public interface UsersRepository {
  void   create(User user); //cоздание   пользователя   и   запись   его   вфайл
  User   findById(String  id); // поиск пользователя в файле поидентификатору
  List<User> findAll(); // выгрузка всех пользователей из файла
  void  update(User   user); //обновление   полей   существующего   вфайле пользователя
  void   deleteById(String   id); //удаление   пользователя   поидентификатору
  void deleteAll();  //удаление всех пользователей
}
