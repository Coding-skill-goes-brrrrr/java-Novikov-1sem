package ru.spbu.arts.java.lambda;

public class PrintableString {
    String stroka;
    public PrintableString (String stroka){
        this.stroka = stroka;
    }
    public void print(){
        System.out.println(stroka);
    }
}
