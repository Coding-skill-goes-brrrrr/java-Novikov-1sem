public class IntroTask3Digits {
    public static void main(String[] args){
        System.out.println(digits3(99));
        System.out.println(digits3(100));
        System.out.println(digits3(999));
        System.out.println(digits3(1000));
    }
    public static boolean digits3 (int x){
        return (99 < x) && (x < 1000);
    }
}

