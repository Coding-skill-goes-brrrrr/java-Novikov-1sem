package ru.spbu.arts.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> spisok0 = count(7);
        List<String> spisok1 = List.of("1", "2", "4");
        List<String> spisok2 = List.of("---", "+++", "???");
        System.out.println(spisok0);
        printList(spisok1);
        printListWithIndices(spisok1);
        printListWithIndices(summaSpiskov(spisok1, spisok2));
        System.out.println("-----------------------------");
        List<String> list5 = new ArrayList<>(List.of("first", "middle", "last"));
        //сначала чистая функция
        List<String> list5rev = reverseList(list5);
        //проверяем, что list5rev перевернутый, а list5 остался без изменений.
        System.out.println("list5rev = " + list5rev + ", but list5 = " + list5);
        //теперь функция, которая меняет сам список
        reverseListInPlace(list5);
        //проверяем, что список действительно изменился
        System.out.println("list5 = " + list5);
        System.out.println("-----------------------------");
        List<Integer> ints = List.of(11, 22, 33, 55, 66, 88, 100, 3, 4);

        System.out.println("ints = " + ints);
        //функция должна удалить элементы с четными индексами, т.е. оставить только каждое второе число
        System.out.println("ints no even indices = " + filterEvenIndices(ints)); //["22", "55", "88", "3"]
        //функция должна удалить четные числа
        System.out.println("ints without even = " + filterEven(ints)); //["11", "33", "55", "3"]

        // В этой части мы проделаем то же самое, но с функциями, которые изменяют переданные списки.
        // слово mutable означает "изменяемый", потому что в этой части мы будем использовать списки,
        // которые можно изменять.
        System.out.println(" ============= mutable lists =================== ");

        List<Integer> mutableInts = new ArrayList<>(ints);
        mutableFilterEvenIndices(mutableInts);
        System.out.println("ints no even indices = " + mutableInts); //[22, 55, 88, 3]

        mutableInts = new ArrayList<>(ints);
        mutableFilterEven(mutableInts);
        System.out.println("ints without even = " + mutableInts); //[11, 33, 55, 3]
    }

    public static List<Integer> count(int n) {
        List<Integer> vyvod = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            vyvod.add(i);
        return vyvod;
    }

    public static void printList(List<String> vvod) {
        System.out.println("Элементов на экране: " + vvod.size());
        vvod.forEach(System.out::println);
    }

    public static void printListWithIndices(List<String> vvod) {
        System.out.println("Элементов на экране: " + vvod.size());
        vvod.forEach(element -> System.out.println(vvod.indexOf(element) + 1 + ": " + element));
    }

    public static List<String> summaSpiskov(List<String> spisok1, List<String> spisok2) {
        List vyvod = new ArrayList();
        vyvod.addAll(spisok1);
        vyvod.addAll(spisok2);
        return vyvod;
    }

    public static List<String> reverseList(List<String> spisok) {
        List<String> vyvod = new ArrayList<>();
        for (int i = 0; i < spisok.size(); i++)
            vyvod.add(spisok.get(spisok.size() - i - 1));
        return vyvod;
    }

    public static void reverseListInPlace(List<String> spisok) {
        List<String> reversSpiska = reverseList(spisok);
        for (int i = 0; i < reversSpiska.size(); i++) {
            spisok.set(i, reversSpiska.get(i));
        }
    }

    public static List<Integer> filterEvenIndices(List<Integer> spisok) {
        List<Integer> vyvod = new ArrayList<>();
        for (int i = 0; i < spisok.size(); i++)
            if (i % 2 == 1)
                vyvod.add(spisok.get(i));
        return vyvod;
    }

    public static void mutableFilterEvenIndices(List<Integer> spisok) {
        for (int i = 0; i < spisok.size(); i++)
            if (i % 2 == 0)
                spisok.set(i, null);
        for (int i = 0; i < spisok.size(); i++)
            if (spisok.get(i) == null) {
                spisok.remove(i);
                i = 0;
            }
    }

    public static List<Integer> filterEven(List<Integer> spisok) {
        List<Integer> vyvod = new ArrayList<>();
        for (Integer integer : spisok)
            if (integer % 2 == 1)
                vyvod.add(integer);
        return vyvod;
    }

    public static void mutableFilterEven(List<Integer> spisok) {
        for (int i = 0; i < spisok.size(); i++)
            if (spisok.get(i) % 2 == 0)
                spisok.set(i, null);
        for (int i = 0; i < spisok.size(); i++)
            if (spisok.get(i) == null) {
                spisok.remove(i);
                i = 0;
            }
    }

}

