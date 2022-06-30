package ru.spbu.arts.java.exams;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;

public class Visitor implements FileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Переход в каталог " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Просмотр файла " + file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Просмотр не удался: Файл " + file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Выход из каталога " + dir);
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) {
        Path observedDir = Paths.get("C:\\Users\\Default Username\\IdeaProjects\\3_semester\\src");
        try {
            Files.walkFileTree(observedDir, new Visitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

