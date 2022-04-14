package ru.spbu.arts.java.intro;

public class PrimalityTest {
    public static void main(String[] args){
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(20));
        System.out.println(isPrime(21));
        System.out.println(isPrime(23));
        System.out.println(isPrime(37));
        System.out.println(isPrime(42));
    }
    public static boolean isPrime (float x) {
        if (x == 1) {
            System.out.println("Это единица -_-");
            return false;
        }
        else {
            double xHelp0 = Math.sqrt(x);
            int xHelp = (int) Math.round(xHelp0);
            for (int p = 2; p <= xHelp; p = p + 1)
                if (x % p == 0)
                    return false;
            return true;
        }
    }
}
