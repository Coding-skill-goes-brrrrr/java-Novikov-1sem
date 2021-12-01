import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regulyarnye_vyrazheniya {
    public static void main(String[] args) {
        System.out.println(isEmail_1("abc.aaa"));
        System.out.println(isEmail_1("abc@cba.rt"));
        System.out.println(isEmail_1("abc@cba.rtyui"));
        System.out.println(isEmail_1("1abc@cba.rti"));
        System.out.println("-------------"); //разграничивание вывода функций
        System.out.println(isEmail_2("abc@cba.rt"));
        System.out.println(isEmail_2("abc@cba.rtyui"));
        System.out.println(isEmail_2("1abc@cba.rty"));
        System.out.println("-------------"); //разграничивание вывода функций
        System.out.println(isEmail_3("abc@cba.rt"));
        System.out.println(isEmail_3("a---+bc@cba.rtyui"));
        System.out.println(isEmail_3("1abc**???_{}@cba.rty"));
        System.out.println("-------------"); //разграничивание вывода функций
        timeANDgames("12:32 fff 12:35 ggg 14:32");
        System.out.println("----"); //разграничивание вывода функций внутри заданий
        timeANDgames("12:62 fff 25:35 ggg 24:32");
        System.out.println("----"); //разграничивание вывода функций внутри заданий
        timeANDgames("12:32 14:66");
        System.out.println("-------------"); //разграничивание вывода функций
        zapyatye("Probela pered zapyatoy net,");
        zapyatye("Dva probele pered  , zapyatoy");
        zapyatye("Ochen mnogo                 ,        probelov pered i posle            , zapyatyh, no ne vseh");
        System.out.println("-------------"); //разграничивание вывода функций
        defisy("Tre-kiu, dsddd djjkj dkdkeury fkffe-fghf");
        defisy("sddwwqqd");
        defisy("dede-vlvl lddldl - s;;ss");
        System.out.println("-------------"); //разграничивание вывода функций
        System.out.println(opyatKoty("kot Кот который С КОТОМ за otokoTom"));
        System.out.println(opyatKoty("122 выф ф"));
        System.out.println(opyatKoty("кот который кота закотил cat"));
        System.out.println("-------------"); //разграничивание вывода функций
        System.out.println(snovaKoty("kot Кот который С КОТОМ за otokoTom"));
        System.out.println(snovaKoty("122 выф ф"));
        System.out.println(snovaKoty("кот который кота закотил cat"));
        System.out.println("-------------"); //разграничивание вывода функций
        minusOdin("111 котов 22 часа и -220 эффективности");
        minusOdin("-1 (минус один) должен дать 0 (ноль), как тебе такое, Илон Маск?");
    }

    public static boolean isEmail_1(String n) {
        if (n.matches(("[a-z]+@+[a-z]+\\.+[a-z]{2,4}")))
            return true;
        else
            return false;
    }

    public static boolean isEmail_2(String n) {
        if (n.matches(("[A-Za-z-_\\d]+@+[A-Za-z-_\\d]+\\.+[a-z]{2,4}")))
            return true;
        else
            return false;
    }

    public static boolean isEmail_3(String n) {
        if (n.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"))
            return true;
        else
            return false;
    }

    public static void timeANDgames(String n) {
        Pattern timePattern = Pattern.compile("\\d\\d:\\d\\d");
        Matcher m = timePattern.matcher(n);
        while (m.find()) {
            if (m.group().matches("((0|1)\\d|20|21|22|23):((0|1|2|3|4|5)\\d)"))
                System.out.println(m.group() + "  Точное время!");
            else
                System.out.println(m.group() + "  Так время не выводят >_<");
        }
    }

    public static void zapyatye(String n) {
        System.out.println(n.replaceAll("\\s++,", ","));
        }

    public static void defisy(String n) { System.out.println(n.replaceAll("([a-zA-Zа-яА-Я]+)-([a-zA-Zа-яА-Я]+)","$2-$1")); }

    public static int opyatKoty(String n) {
        int count = 0;
        Pattern p = Pattern.compile("(K|k|К|к)(O|o|О|о)(T|t|Т|т)");
        Matcher m = p.matcher(n);
        while(m.find()) count++;
        return count;
        }

    public static int snovaKoty(String n) {
        int count = 0;
        Pattern p = Pattern.compile("\\b(K|k|К|к)(O|o|О|о)(T|t|Т|т)\\b");
        Matcher m = p.matcher(n);
        while(m.find()) count++;
        return count;
    }

    public static void minusOdin(String n) {
       // System.out.println(n.replaceAll("\\d", toString(Integer.parseInt("(-)?\\d")+1)));
        Pattern wordNumber = Pattern.compile("((-)?)(\\d+)");
        Matcher m = wordNumber.matcher(n);
        StringBuilder sb = new StringBuilder(); //Аналог String, но изменяемый
        while (m.find()) {
            String digits = m.group();
            String replacement =  String.valueOf(Integer.parseInt(digits) + 1);
            m.appendReplacement(sb, replacement);
        }
        m.appendTail(sb);
        String finalText = sb.toString();
        System.out.println(finalText);
    }
    }







