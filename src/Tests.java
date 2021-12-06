public class Tests {
    public static void main(String[] args) {
        Matrix22 matrica = new Matrix22(1, 2, 3, 4);
        System.out.println(matrica.trace());
        System.out.println(matrica.determinant());

        System.out.println(matrica); //я честно не знаю, как это работает: IDEA говорит, что "toString() - unnecessary"
        System.out.println(matrica.toString()); //и почему-то эти два варианта равнозначны независимо от знаков между элементами матрицы
        System.out.println("----------------------------");
        matrica.print();
        System.out.println("----------------------------");
        Matrix22 dlya_arifmetiki = new Matrix22(100000, 2, 3, 400);
        matrica.add(dlya_arifmetiki).print();
        System.out.println("----------------------------");
        matrica.mul(dlya_arifmetiki).print();
        System.out.println("----------------------------");
        matrica.pow(2).print();
        System.out.println("----------------------------");
        matrica.pow(4).print();
    }
}