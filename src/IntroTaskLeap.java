public class IntroTaskLeap {
    public static void main(String[] args){
        System.out.println(Is_Leap(1200));
        System.out.println(Is_Leap(1449));
        System.out.println(Is_Leap(2004));
        System.out.println(Is_Leap(2005));
    }
    public static boolean Is_Leap (int x){
        if (x % 100 == 0)
            return (x % 400 == 0);
        else
            return (x % 4 == 0);
    }
}
