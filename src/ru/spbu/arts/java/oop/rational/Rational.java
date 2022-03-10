package ru.spbu.arts.java.oop.rational;

public class Rational {
    static Rational ZERO = new Rational(0);
    static Rational ONE = new Rational(1);

    private int n;
    private int d;

    public Rational (int n, int d){
        this.n = n;
        this.d = d;
    }

    public Rational (int n){
        this.n = n;
        this.d = 1;
    }

    public String toString(){
        if (this.d == 0)
            return "Невозможно...";
        else if (this.d == 1)
            return Integer.toString(this.n);
        else if (this.n == 0)
            return "0";
        else return Integer.toString(this.n)+'/'+Integer.toString(this.d);
    }

    public double toDouble(){
        return (double) this.n/(double) this.d;
    }

    public int pomosch(int a, int b) {
        if (b==0) return a;
        return pomosch(b,a%b);
    }

    public Rational simplify(){
        int a = this.n/pomosch(this.n,this.d);
        int b = this.d/pomosch(this.n,this.d);
        Rational ans = new Rational(a,b);
        return ans;
    }

    public Rational add(Rational a){
        int n = a.n * this.d + this.n * a.d;
        int d = a.d * this.d;
        Rational ans = new Rational(n,d);
        return ans;
    }

    public void addInPlace(Rational a){
        this.n = a.n * this.d + this.n * a.d;
        this.d *= a.d;
    }

    public Rational sub(Rational a){
        int n = this.n * a.d - a.n * this.d;
        int d = a.d * this.d;
        Rational ans = new Rational(n,d);
        return ans;
    }

    public void subInPlace(Rational a){
        this.n = this.n * a.d - a.n * this.d;
        this.d *= a.d;
    }

    public Rational mul(Rational a){
        int n = this.n * a.n;
        int d = a.d * this.d;
        Rational ans = new Rational(n,d);
        return ans;
    }

    public void mulInPlace(Rational a){
        this.n *= a.n;
        this.d *= a.d;
    }

    public Rational div(Rational a){
        int n = this.n * a.d;
        int d = a.n * this.d;
        Rational ans = new Rational(n,d);
        return ans;
    }

    public void divInPlace(Rational a){
        this.n *= a.d;
        this.d *= a.n;
    }

    public int getChislitel(){
        return this.n ;
    }
    public int getZnamenatel(){
        return this.d ;
    }

}
