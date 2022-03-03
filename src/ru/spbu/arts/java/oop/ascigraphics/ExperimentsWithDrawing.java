package ru.spbu.arts.java.oop.ascigraphics;

public class ExperimentsWithDrawing {
    public static void main(String[] args) {
        Drawing risunok1 = new Drawing(10, 10, '.');
        Drawing risunok2 = new Drawing(10, 10, '.');
        Drawing risunok3 = new Drawing(10, 10, '.');
        Drawing risunok4 = new Drawing(10, 10, '.');
        risunok1.print();
        System.out.println("------------------------------");
        risunok1.setPoint(3,1,'Ъ');
        risunok1.print();
        System.out.println("------------------------------");
        risunok1.drawVerticalLine(3,5,8,'A');
        risunok1.print();
        System.out.println("------------------------------");
        risunok1.drawHorizontalLine(3,5,8,'B');
        risunok1.print();
        System.out.println("------------------------------");
        risunok1.drawRectangle(1,1,7,7,'*');
        risunok1.print();
        System.out.println("------------------------------");
        risunok2.drawRectangle(3,3,1,1,'*');
        risunok2.print();
        System.out.println("------------------------------");
        risunok3.drawRectangle(1,4,7,1,'*');
        risunok3.print();
        System.out.println("------------------------------");
        risunok4.drawRectangle(3,3,1,6,'*');
        risunok4.print();
        System.out.println("Нарисовать домик оказалось непосильной задачей: вот Джоконда");
        risunok4.toSummonGigaMonaLisaJokeJokondayeeeee ();
    }
}