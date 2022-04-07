package ru.spbu.arts.java.lambda;
import ru.spbu.arts.java.oop.ascigraphics.Drawing;

public class InevitableTests {
    public static void main(String[] args) {
        PrintableLetter pl = new PrintableLetter("x", 10);
        pl.print(); //печатает букву x 10 раз

        PrintableString ps = new PrintableString("asdf");
        ps.print(); //печатает asdf

        Printable risunok = new Drawing(10,10,'.');
        risunok.print();
    }
}
