package ru.spbu.arts.java.lambda;

import ru.spbu.arts.java.oop.ascigraphics.Drawing;

public class InevitableTests {
    public static void main(String[] args) {
        PrintableLetter pl = new PrintableLetter("x", 10);
        pl.print(); //печатает букву x 10 раз

        PrintableString ps = new PrintableString("asdf");
        ps.print(); //печатает asdf

        Printable risunok = new Drawing(3, 3, '.');
        risunok.print();

        Printable lambda = () -> System.out.println("lambda here, lambda there");

        Printable[] vsePodryad = {pl, ps, risunok, lambda};
        for (Printable element : vsePodryad)
            element.print();
    }
}
