public class MultidimentionalArrays {
    public static void main(String[] args){
        int[][] a  = new int[][] {{1, 1, 1, 1},{2, 2, 2},{1, 1, 1, 1, 2, 4, 5, 6},{2, 2, 2}};
        printTable(a);
        int[][] b  = new int[][] {{1455554, 111551, 1, 1},{4555},{1155555444, 1, 111,},{24, 2, 44455554}};
        printTableAligned(b);
    }

    public static int[] even(int n) {
        int[] a;
        a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = 2*i;
        return a;
    }

    public static boolean allSimilar(int[] a) {
        for (int i = 0; i < a.length-1; i++)
            if (a[i] != a[i+1])
                return false;
        return true;
    }

    public static boolean hasSimilar(int[] a) {
        for (int i = 0; i < a.length-1; i++)
            for (int j = i; j < a.length-1; j++)
                if (a[j] == a[j+1])
                    return true;
        return false;
    }

    public static double mean(int[] a) {
        double sum = 0;
        for (int j : a) sum += j;
        return sum/a.length;
    }

    public static void shift(int[] a) {
        int last = a[a.length-1];
        for (int i = a.length-1; i > 0; i--)
            a[i] = a[i-1];
        a[0] = last;
    }


    public static void toString(int[] a) {
        String stroka = "";
        for (int j : a) stroka+=Integer.toString(a[j])+" ";
        System.out.println(stroka);
    }

    public static void printTable(int[][] a) {
        for (int i = 0; i < a.length; i++)
            toString(a[i]);

    }


    public static void printTableAligned(int[][] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i].length > max)
                max = a[i].length;
            //поиск строки с наибольшим количеством элементов
        String[][] output  = new String[a.length][max];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                output[i][j] = Integer.toString(a[i][j]);

            //здесь преобразовать массив в строку и заполнить пустые пространства им -> ""
        for (int i = 0; i < output.length; i++)
            if (output[i].length<max)
                for (int j = output[i].length; j < max; j++)
                    output[i][j] = "";
        //массив преобразован в прямоугольник, спокойно работаем без выхода за массив

        int[] tableOfLengthes = new int[max];
        for (int j = 0; j < max; j++) {
            String maxNum = "";
            for (int i = 0; i < output.length; i++)
                if (output[i][j] != null)
                    if (output[i][j].length() > maxNum.length())
                        maxNum = output[i][j];
            tableOfLengthes[j] = maxNum.length();
        }
        //построили массив самых длинных элементов в столбцах; сверяя вывод с ним, буду расставлять пробелы

        for (int i = 0; i < output.length; i++)
            for (int j = 0; j < output.length; j++)
                if (output[i][j] == null)
                    output[i][j] = " ";
                else {
                    int dlina = output[i][j].length();
                    for (int k = 0; k < (tableOfLengthes[j] - dlina); k++)
                        output[i][j] = " " + output[i][j];
                }
            //преобразовали массив и подготовили его к выводу
        for (int i = 0; i < output.length; i++){
            String eshyoStroka = output[i][0];
            for (int j = 1; j < output.length; j++)
                eshyoStroka += "  " + output[i][j];
            System.out.println(eshyoStroka);
        }
        for (int i = 0; i < tableOfLengthes.length; i++)
            System.out.println(tableOfLengthes[i]);
            }

    }


