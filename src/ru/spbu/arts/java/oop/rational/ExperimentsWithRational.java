package ru.spbu.arts.java.oop.rational;



public class ExperimentsWithRational {
    public static void main(String[] args) {
        Rational drob0 = new Rational(6,22);
        Rational drob1 = new Rational(1,2);
        Rational drob2 = new Rational(1,6);
        Rational drob3 = new Rational(5,6);
        Rational drob4 = new Rational(14,6);
        Rational drob5 = new Rational(0,0);
        Rational drob6 = new Rational(0,1);
        Rational drob7 = new Rational(1,0);
        Rational drob8 = new Rational(4,1);

        System.out.println(drob1.toString());
        System.out.println(drob5.toString());
        System.out.println(drob6.toString());
        System.out.println(drob7.toString());
        System.out.println(drob8.toString());
        System.out.println("-------------------------");
        System.out.println(drob1.toDouble());
        System.out.println(drob4.toDouble());
        System.out.println(drob8.toDouble());
        System.out.println("-------------------------");
        System.out.println(drob4.simplify().toString());
        System.out.println(drob8.simplify().toString());
        System.out.println(drob3.simplify().toString());
        System.out.println("Суммы");
        drob4.addInPlace(drob3);
        System.out.println(drob4.simplify().toString());
        Rational drob9 = drob1.add(drob3);
        System.out.println(drob9.simplify().toString());
        System.out.println("Разности");
        drob1.subInPlace(drob2);
        System.out.println(drob1.simplify().toString());
        Rational drob10 = drob8.sub(drob2);
        System.out.println(drob10.simplify().toString());
        System.out.println("Умножения");
        drob3.mulInPlace(drob2);
        System.out.println(drob3.simplify().toString());
        Rational drob11 = drob8.mul(drob2);
        System.out.println(drob11.simplify().toString());
        System.out.println("Деления");
        drob2.mulInPlace(drob0);
        System.out.println(drob2.simplify().toString());
        Rational drob12 = drob8.mul(drob0);
        System.out.println(drob12.simplify().toString());
    }

    public static double funbonacci(int n) {
        int matrica = 0;
        return  matrica;
    }

}
