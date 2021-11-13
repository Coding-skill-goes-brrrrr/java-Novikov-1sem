public class IntroTaskLast5 {
    public static void main(String[] args){
        System.out.println(Digits3(0));
        System.out.println(Digits3(5));
        System.out.println(Digits3(14));
        System.out.println(Digits3(135));
    }
    public static boolean Digits3 (int x){
        return (x % 10 == 5);
    }
}
