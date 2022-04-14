package ru.spbu.arts.java.matrix;

public class Rotation extends Matrix22 {
    private double ugol;
    public Rotation(double a) {
        super(Math.sin(Math.toRadians(a)), Math.cos(Math.toRadians(a)), -Math.cos(Math.toRadians(a)), Math.sin(Math.toRadians(a)));
        this.ugol = a;
    }
    public double getAngle(){
        return ugol;
    }
}