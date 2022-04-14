public class IntroTaskLeap {
    public static void main(String[] args){
        System.out.println(isLeap(1200));
        System.out.println(isLeap(1449));
        System.out.println(isLeap(2004));
        System.out.println(isLeap(2005));
    }
    public static boolean isLeap (int x){
        if (x % 100 == 0)
            return (x % 400 == 0);
        else
            return (x % 4 == 0);
    }
}
