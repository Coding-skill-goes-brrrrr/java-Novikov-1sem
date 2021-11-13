public class PrimalityTest {
    public static void main(String[] args){
        System.out.println(is_prime(1));
        System.out.println(is_prime(2));
        System.out.println(is_prime(3));
        System.out.println(is_prime(4));
        System.out.println(is_prime(20));
        System.out.println(is_prime(21));
        System.out.println(is_prime(23));
        System.out.println(is_prime(37));
        System.out.println(is_prime(42));
    }
    public static boolean is_prime (float x) {
        if (x == 1) {
            System.out.println("Это единица -_-");
            return false;
        }
        else {
            double x_help0 = Math.sqrt(x);
            int x_help = (int) Math.round(x_help0);
            for (int p = 2; p <= x_help; p = p + 1)
                if (x % p == 0)
                    return false;
            return true;
        }
    }
}
