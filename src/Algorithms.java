public class Algorithms {
    public static void main(String[] args) {
        System.out.println("-----------Задание 1-----------");
        boolean[] test1  = sieveOfEratosthenes(30);
        for (int i = 0; i < test1.length; i++) System.out.println(i + " - " + test1[i]);
        System.out.println("-----------Задание 2-----------");
        int[] test2  = primes(30);
        for (int j : test2) System.out.println(j);
        System.out.println("-----------Задание 3-----------");
        int[][] test3_1  = primeFactors(3677677);
        for (int[] ints : test3_1) {
            System.out.println(ints[0] + "^" + ints[1]);
        }
        System.out.println("-------------");
        int[][] test3_2  = primeFactors(1980);
        for (int[] ints : test3_2) {
            System.out.println(ints[0] + "^" + ints[1]);
        }
        }

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] prime;
        prime = new boolean[n+1];
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i < n+1; i++) prime[i] = true;
        for (int i = 2; i < n/2+1; i++)
            if (prime[i])
                for (int j = i+1; j < n+1; j++)
                    if (j % i == 0)
                        prime[j] = false;
        return prime;
    }

    public static int[] primes(int n) {
        int[] prime;
        boolean[] blank  = sieveOfEratosthenes(n);
        int count = 0;
        for (boolean b : blank) if (b) count++;
        prime = new int[count];
        count = 0;
        for (int i = 0; i < blank.length; i++)
            if (blank[i]){
                prime[count] = i;
                count++;
            }
        return prime;
    }

    public static int[][] primeFactors(int n) {
        int[] prime = primes((int) Math.sqrt (n));
        int[][] factors;
        factors = new int[prime.length+1][2];
        for (int i = 0; i < factors.length-1; i++) {
            factors[i][0] = prime[i];
            factors[i][1] = 0;
        }
        for (int i = 0; i < factors.length-1; i++) {
            while (n % factors[i][0] == 0) {
                ++factors[i][1];
                n = n/factors[i][0];
            }
        }
        if (n != 1) {
            factors[factors.length - 1][0] = n;
            factors[factors.length - 1][1] = 1;
        }
        int count = 0;
        for (int[] factor : factors)
            if (factor[1] != 0)
                count++;
        int[][] output;
        output = new int[count][2];
        int j = 0;
        for (int[] factor : factors)
            if (factor[1] != 0)
                count++;
        for (int[] factor : factors)
            if (factor[1] != 0) {
                output[j] = factor;
                j++;
            }
        return output;
    }
}
