package ru.spbu.arts.java.oop.time;

public class ExperimentsWithTime {
    public static void main(String[] args) {
        Time vremya1 = new Time(10,0);
        Time vremya2 = new Time(0,5);
        Time vremya3 = new Time(15,50);

        System.out.println(vremya1.show());
        System.out.println(vremya2.show());
        System.out.println(vremya3.show());
        System.out.println("------------------------------");
        System.out.println(vremya1.IsMorning());
        System.out.println(vremya1.IsNight());
        System.out.println(vremya2.IsMorning());
        System.out.println(vremya2.IsNight());
        System.out.println("------------------------------");
        System.out.println(vremya1.sayHello());
        System.out.println(vremya2.sayHello());
        System.out.println(vremya3.sayHello());
        System.out.println("------------------------------");
        vremya1.add(22);
        System.out.println(vremya1.show());
        vremya2.add(55);
        System.out.println(vremya2.show());
        vremya3.add(220);
        System.out.println(vremya3.show());
    }
}
