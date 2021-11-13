public class IntroTask3Digits {
    public static void main(String[] args){
        System.out.println(Digits3(99));
        System.out.println(Digits3(100));
        System.out.println(Digits3(999));
        System.out.println(Digits3(1000));
    }
    public static boolean Digits3 (int x){
        return (99 < x) && (x < 1000);
    }
}

