package ru.spbu.arts.java.zachyot;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class Zachyotnaya_Rabota {
    public static void main(String[] args) throws Exception{
        String[] stroki = readFileExample();
        int max = 0;
        for (int i = 0; i < stroki.length; i++)
            if (stroki[i].length() > max)
                max = stroki[i].length();
        writeFileExample(stroki, max);
    }

    private static void writeFileExample(String[] stroki, int max) throws Exception {
        try (PrintStream outFile = new PrintStream("numbers_NEW.txt", StandardCharsets.UTF_8)) {
            for (String s : stroki) outFile.println(s.indent(max - s.length()));
            outFile.flush();
        }
    }

    private static String[] readFileExample() throws Exception {
        //заводим переменную типа Path для хранения пути к файлу
//        Path txt = Path.of("texts-examples/read-write-example.txt");
        Path txt = Path.of("numbers", "numbers.txt");
        try (Scanner in = new Scanner(txt, StandardCharsets.UTF_8)) {
            String n = in.next(); // прочитать следующее слово
            String[] stroki = new String[Integer.parseInt(n)];
            int nomer = 0;
            while (in.hasNext()) {
                stroki[nomer] = in.next();
                nomer++;
            }
            return stroki;
        }
    }
}
