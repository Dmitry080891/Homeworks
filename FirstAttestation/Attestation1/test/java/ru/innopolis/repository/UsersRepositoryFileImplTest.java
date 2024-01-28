package ru.innopolis.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.innopolis.model.User;

import java.time.LocalDateTime;

import static java.util.UUID.randomUUID;
import static org.junit.jupiter.api.Assertions.*;

class UsersRepositoryFileImplTest {
    private UsersRepository usersRepository;
    @BeforeEach
    void setUp() {

        usersRepository = new UsersRepositoryFileImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void create() {
        User user = new User(String.valueOf(randomUUID()), LocalDateTime.now(),
                "User_1", "password_1", "password_1",
                "Ivanov", "Ivan", "Ivanovich",
                25, true);
        assertDoesNotThrow(() -> usersRepository.create(user));
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void update() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void deleteAll() {
    }
}