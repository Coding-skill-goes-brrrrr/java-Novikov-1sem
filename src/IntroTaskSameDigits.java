public class IntroTaskSameDigits {
    public static void main(String[] args){
        System.out.println(Digits3(1));
        System.out.println(Digits3(22));
        System.out.println(Digits3(144));
        System.out.println(Digits3(135898));
    }
    public static boolean Digits3 (int x){
        return (x % 10 == x / 10 % 10);
    }
}

