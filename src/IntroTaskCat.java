public class IntroTaskCat {
    public static void main(String[] args){
        System.out.println(Cats(1));
        System.out.println(Cats(2));
        System.out.println(Cats(4));
        System.out.println(Cats(5));
        System.out.println(Cats(11));
        System.out.println(Cats(21));
        System.out.println(Cats(22));
        System.out.println(Cats(25));
    }
    public static String Cats (int x){
        if ((x % 10 == 1)&&(x != 11))
            return x + " кот";
        else if ((x % 10 >= 2)&&(x % 10 <= 4)&&((x < 5)||(x > 20)))
            return x + " кота";
        else
            return x + " котов";
    }
}
