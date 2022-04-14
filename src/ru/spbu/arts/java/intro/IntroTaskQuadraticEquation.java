package ru.spbu.arts.java.intro;

public class IntroTaskQuadraticEquation {
    public static void main(String[] args){
        System.out.println(Equation(0, 0, 0));
        System.out.println(Equation(0, 0, 1));
        System.out.println(Equation(0, 1, 0));
        System.out.println(Equation(0, 3, 1));
        System.out.println(Equation(1, 2, 1));
        System.out.println(Equation(1, -2, 1));
        System.out.println(Equation(4, -1, -3));
        System.out.println(Equation(1, 1, -12));
    }
    public static String Equation (float a, float b, float c){
        if (a == 0)
            if (b == 0)
                if (c == 0)
                    return "Бесконечно много решений";
                else
                    return "Решений нет(";
            else{
                float root = -c/b;
                if (root == 0)
                    return "x = 0";
                else
                    return String.format("x = %.2f", root);
            }
        else{
            float D = b*b-4*a*c;
            if (D < 0)
                return ("Решений нет (по крайней мере, в действительных числах)");
            else if (D == 0)
                return String.format("x = %.2f", -b/(2*a));
            else {
                double sqrt = Math.sqrt(D);
                double x1 = (-b+sqrt)/(2*a);
                double x2 = (-b-sqrt)/(2*a);
                if (x1 > x2)
                    return String.format("x1 = %.2f", x1) + String.format(" и x2 = %.2f", x2);
                else
                    return String.format("x1 = %.2f", x2) + String.format(" и x2 = %.2f", x1);
            }

        }
    }
}
