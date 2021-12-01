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
        System.out.println("-------------A lot of tests here-------------");
        int[] a = {1, 4, 5, 10, 20, 100};
        test(a, 5, 2);
        test(a, 1, 0);
        test(a, 100, 5);
        test(a, 42, -1);
        test(a, 120, -1);
        test(a, 0, -1);

        int[] b = {1, 4, 6, 65, 100};
        test(b, 0, -1);
        test(b, 1, 0);
        test(b, 2, -1);
        test(b, 4, 1);
        test(b, 5, -1);
        test(b, 6, 2);
        test(b, 10, -1);
        test(b, 65, 3);
        test(b, 70, -1);
        test(b, 100, 4);
        test(b, 200, -1);

        int[] c = {1, 4, 6, 65, 100, 110};
        test(c, 0, -1);
        test(c, 1, 0);
        test(c, 2, -1);
        test(c, 4, 1);
        test(c, 5, -1);
        test(c, 6, 2);
        test(c, 10, -1);
        test(c, 65, 3);
        test(c, 70, -1);
        test(c, 100, 4);
        test(c, 105, -1);
        test(c, 110, 5);
        test(c, 200, -1);

        test(new int[]{}, 42, -1);
        test(new int[]{42}, 0, -1);
        test(new int[]{42}, 42, 0);
        test(new int[]{42}, 100, -1);

        test(new int[]{10, 20}, 0, -1);
        test(new int[]{10, 20}, 10, 0);
        test(new int[]{10, 20}, 15, -1);
        test(new int[]{10, 20}, 20, 1);
        test(new int[]{10, 20}, 25, -1);
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
    public static int binarySearch(int[] a, int value) {
        //ищем значение от индекса l до индекса r
        // -----------------------
        //      l      m      r
        //      --------
        int l = 0;
        int r = a.length - 1;
        do {
            int m = (l + r) / 2; //середина диапазона
            if (a.length == 0) return -1;
            else if (value == a[r]) return r;
            else if (value == a[l]) return l;
            else if (value > a[m]) l = m;
            else if (value < a[m]) r = m;
            else return m;
            //проверить a[m] и понять, где искать дальше, слева или справа от m
        } while ((r - l) > 1);
        return -1;
    }

    public static void test(int[] a, int value, int correctAnswer) {
        // Looking for 'value' in 'a'
        int actualAnswer = binarySearch(a, value);
        if (actualAnswer == correctAnswer)
            System.out.println("ok");
        else
            System.out.println(
                    "Got " + actualAnswer + " instead of " + correctAnswer
            );
    }
}
