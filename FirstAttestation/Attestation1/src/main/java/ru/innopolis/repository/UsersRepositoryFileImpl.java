package ru.innopolis.repository;

import ru.innopolis.UserList;
import ru.innopolis.model.User;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class UsersRepositoryFileImpl implements UsersRepository{

    private static final String LIST_PATH = "FirstAttestation/Attestation1/src/main/java/ru/innopolis/UserInfo.txt";
    private final UserList userList;
    public UsersRepositoryFileImpl() {
        this.userList = new UserList(LIST_PATH);
    }
    private User parseUserInfo(String userInfo) {
        String[] inputUserInfo = userInfo.split("\\|");
        return new User(inputUserInfo[0], LocalDateTime.parse(inputUserInfo[1]), inputUserInfo[2], inputUserInfo[3],
                inputUserInfo[4], inputUserInfo[5], inputUserInfo[6],
                inputUserInfo[7], Integer.parseInt(inputUserInfo[8]),
                Boolean.parseBoolean(inputUserInfo[9]));
    }
    private String getUserInfo(User user) {
        return user.getId() + "|" + user.getDate() + "|" + user.getLogin() + "|" + user.getPassword() + "|" +
                user.getConfirmPassword() + "|" + user.getLastName() + "|" + user.getName() + "|" +
                user.getPatronimic() + "|" + user.getAge() + "|" + user.getWorker();
    }
    private void rewriteFile(List<User> users) throws IOException {
        List<String> lines = new ArrayList<>();
        for (User info : users) {
            lines.add(getUserInfo(info));
        }
        userList.writeAllLines(lines);
    }



    @Override
    public void create(User user) throws IOException {
        userList.addUser(getUserInfo(user));
    }
    @Override
    public User findById(String id) throws IOException {
        try {
            List<String> lines = userList.readAllLines();
            for (String line : lines) {
                User user = parseUserInfo(line);
                if (user.getId().equals(id)) {
                    return user;
                }
            }
        } catch (IOException e) {
            throw new IOException("пользователь не найден", e);
        }
        return null;
    }




    @Override
    public List<User> findAll() throws IOException {
        List<User> users = new ArrayList<>();
            List<String> lines = userList.readAllLines();
            for (String line : lines) {
                users.add(parseUserInfo(line));
            }

        return users;
    }

    @Override
    public void update(User user) {
        try {
            List<User> users = findAll();
            boolean found = false;
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getId().equals(user.getId())) {
                    users.set(i, user);
                    found = true;
                    break;
                }
            }
            if (!found) {
                users.add(user);
            }
            rewriteFile(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void deleteById(String id) throws IOException {
        List<User> users = findAll();
        users.removeIf(u -> u.getId().equals(id));
        rewriteFile(users);
    }

    @Override
    public void deleteAll() throws IOException {
        try {
        userList.clearList();
        } catch (IOException e) {
            throw new IOException("Список пуст", e);
        }
    }
}
