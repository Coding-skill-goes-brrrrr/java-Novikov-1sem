public class ArraysTasks {
    public static void main(String[] args){
        toString(even(10));
        toString(even(1));
        toString(even(14));
    }
    public static int[] even(int n) {
        int[] a; // объявление массива
        a = new int[n];
        for (int i = 0; i < n; i++)
              a[i] = 2*i;
        return a;
        }

    public static void toString(int[] a) {
        for (int j : a) System.out.println(j);

    }
    }

