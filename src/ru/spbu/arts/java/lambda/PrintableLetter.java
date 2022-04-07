package ru.spbu.arts.java.lambda;

public class PrintableLetter implements Printable{
    String bukva;
    int kolichestvo;
    public PrintableLetter (String bukva, int kolichestvo){
        this.bukva = bukva;
        this.kolichestvo = kolichestvo;
    }
    public void print(){
        for (int i = 0; i < kolichestvo; i++)
            System.out.println(bukva);
    }
}
