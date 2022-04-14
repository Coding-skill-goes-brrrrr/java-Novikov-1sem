package ru.spbu.arts.java.matrix;

public class Matrix22 {
    double a; //код был написан для int, но специфика задания про наследование вынудила изменить всё на double
    double b;
    double c;
    double d;

    public Matrix22(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Matrix22(double [][] matrix) {
        this.a = matrix[0][0];
        this.b = matrix[0][1];
        this.c = matrix[1][0];
        this.d = matrix[1][1];
    }

    public double determinant() {
        return this.a * this.d - this.b * this.c;
    }

    public double trace() {
        return this.a + this.d;
    }

    public double [][] getMatrix22() {
        double[][] output = new double[2][2];
        output[0][0] = this.a;
        output[0][1] = this.b;
        output[1][0] = this.c;
        output[1][1] = this.d;
        return output;
    }

    public String toString() {
        return String.valueOf(this.a) + ", " + String.valueOf(this.b) + ", " + String.valueOf(this.c) + ", " + String.valueOf(this.d);
    }

    public void print() {
        String a1 = String.valueOf(this.a);
        String b1 = String.valueOf(this.b);
        String c1 = String.valueOf(this.c);
        String d1 = String.valueOf(this.d);
        int dif = Math.abs(a1.length()-c1.length());
        String output1 = a1;
        String output2 = c1;
        if (a1.length() > c1.length()){
            System.out.println(output1 += "  " + String.valueOf(b1));
            for (int i = 0; i < dif; i++)
                output2 += " ";
            System.out.println(output2 += "  " + String.valueOf(d1));
        }
        else if (a1.length() < c1.length()){
                for (int i = 0; i < dif; i++)
                    output1 += " ";
                System.out.println(output1 += "  " + String.valueOf(b1));
                System.out.println(output2 += "  " + String.valueOf(d1));
        }
        else {
            System.out.println(output1 += "  " + String.valueOf(b1));
            System.out.println(output2 += "  " + String.valueOf(d1));
        }
    }

   public Matrix22 add(Matrix22 b){
        return new Matrix22(this.a + b.a, this.b + b.b, this.c + b.c, this.d + b.d);
    }

    public Matrix22 mul(Matrix22 b){
        return new Matrix22(this.a * b.a + this.b * b.c, this.a * b.b + this.b * b.d, this.c * b.a + this.d * b.c, this.c * b.b + this.d * b.d);
    }

    public Matrix22 pow(int n){
        Matrix22 output = new Matrix22(this.a, this.b, this.c, this.d);
        for (int i = 0; i < n-1; i++)
           output = output.mul(new Matrix22(this.a, this.b, this.c, this.d));
        return output;
    }
}

