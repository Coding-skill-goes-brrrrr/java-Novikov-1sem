package ru.spbu.arts.java.exams;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.ArrayList;

public class FilesCollector implements FileVisitor<Path> {

    public List<Path> getAllFiles(){
        return allFiles;
    }

    ArrayList<Path> allFiles = new ArrayList<Path>();
    int errorCount = 0;

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            allFiles.add(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        errorCount++;
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args){
        Path observedDir = Paths.get("C:\\Users\\Default Username\\IdeaProjects\\3_semester\\src");
        try {
            FilesCollector fc = new FilesCollector();
            Files.walkFileTree(observedDir, fc);
            List<Path> allFiles = fc.getAllFiles();
            System.out.println(allFiles);
            //Map<String, List<Path>> allFilesByExtension = fc.getFilesByExtension();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
