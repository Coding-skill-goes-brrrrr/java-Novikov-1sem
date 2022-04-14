package ru.spbu.arts.java.arrays;

import java.util.Arrays;
public class MultidimentionalArrays_2 {
    public static void main(String[] args) {

        char[][] c = createTable(20, '.');
        printTable(c);

        System.out.println("============= Заполним строки: ===========");
        fillFirstAndLastLines(c, '#');
        printTable(c);

        System.out.println("============= Заполним столбцы: ==========");
        fillFirstAndLastColumns(c, '#');
        printTable(c);
    }

    public static char[][] createTable(int n, char c) {
        char[][] a;
        a = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = c;
        return a;
    }

    public static void printTable(char[][] a) {
        for (char[] chars : a) {
            StringBuilder stroka = new StringBuilder();
            for (int j = 0; j < a.length; j++)
                stroka.append(chars[j]).append(" ");
            System.out.println(stroka);
        }
    }

    public static char[][] fillFirstAndLastLines(char[][] a, char c) {
        Arrays.fill(a[0], c);
        Arrays.fill(a[a.length-1], c);
        return a;
    }

    public static char[][] fillFirstAndLastColumns(char[][] a, char c) {
        for (int i = 0; i < a.length; i++)
            a[i][0] = c;
        for (int i = 0; i < a.length; i++)
            a[i][a.length-1] = c;
        return a;
    }
}
