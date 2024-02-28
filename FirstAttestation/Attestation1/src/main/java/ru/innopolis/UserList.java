package ru.innopolis;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class UserList {
    private final Path pathUserList;

    public UserList(String fileName) {
        this.pathUserList = Paths.get(fileName);
    }

    public List<String> readAllLines() throws IOException {
        if (!Files.exists(pathUserList)) {
            Files.createFile(pathUserList);
        }
        return Files.readAllLines(pathUserList);
    }

    public void writeAllLines(List<String> lines) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(pathUserList)) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    public void addUser(String line) throws IOException {
        try (BufferedWriter add = Files.newBufferedWriter(pathUserList, StandardOpenOption.APPEND)) {
            add.write(line);
            add.newLine();
        }
    }

    public void clearList() throws IOException {
        writeAllLines(new ArrayList<>());
    }


}
