package ru.spbu.arts.java.intro;

public class IntroTaskCat {
    public static void main(String[] args){
        System.out.println(Cats(1));
        System.out.println(Cats(2));
        System.out.println(Cats(4));
        System.out.println(Cats(5));
        System.out.println(Cats(11));
        System.out.println(Cats(21));
        System.out.println(Cats(22));
        System.out.println(Cats(25));
        System.out.println(Cats(111));
        System.out.println(Cats(112));
        System.out.println(Cats(113));
        System.out.println(Cats(114));
    }
    public static String Cats (int x){
        if ((x % 10 == 1)&&(x % 100 != 11))
            return x + " кот";
        else if ((x % 10 >= 2)&&(x % 10 <= 4)&&(x % 100 != 12)&&(x % 100 != 13)&&(x % 100 != 14))
            return x + " кота";
        else
            return x + " котов";
    }
}
