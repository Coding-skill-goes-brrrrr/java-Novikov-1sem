public class ArraysTasks {
    public static void main(String[] args){
        toString(even(5));
        int[] a  = new int[] {1, 1, 1, 1};
        System.out.println(allSimilar(a));
        System.out.println(hasSimilar(a));
        System.out.println(mean(a));
        int[] b  = new int[] {1, 2, 3, 4};
        System.out.println(allSimilar(b));
        System.out.println(hasSimilar(b));
        System.out.println(mean(b));
        toString(copyShift(b));
        int[] c  = new int[] {1, 3, 3, 4};
        System.out.println(allSimilar(c));
        System.out.println(hasSimilar(c));
        System.out.println(mean(c));
        toString(copyShift(c));
    }

    public static int[] even(int n) {
        int[] a;
        a = new int[n];
        for (int i = 0; i < n; i++)
              a[i] = 2*i;
        return a;
        }

    public static boolean allSimilar(int[] a) {
        for (int i = 0; i < a.length-1; i++)
            if (a[i] != a[i+1])
                return false;
        return true;
    }

    public static boolean hasSimilar(int[] a) {
        for (int i = 0; i < a.length-1; i++)
            for (int j = i; j < a.length-1; j++)
               if (a[j] == a[j+1])
                return true;
        return false;
    }

    public static double mean(int[] a) {
        double sum = 0;
        for (int j : a) sum += j;
        return sum/a.length;
    }

    public static void shift(int[] a) {
        int last = a[a.length-1];
        for (int i = a.length-1; i > 0; i--)
            a[i] = a[i-1];
        a[0] = last;
    }

    public static int[] copyShift(int[] a) {
        int[] b  = a;
        shift(b);
        return b;
    }

    public static void toString(int[] a) {
        for (int j : a) System.out.println(j);

    }
    }

