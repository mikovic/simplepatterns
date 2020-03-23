package com.mikovic.entities.poliform;

public class Square extends Shape implements Sqrt {

    public Square(double side) {
        super(side);
    }

    public void draw() {
        System.out.println("Нарисован квадрат");
    }

    public double getSqrt() {
        return getSide()*getSide();
    }
    public void inform() {
        System.out.printf("Площадь квадрата =%.2f; \n", getSqrt());
    }
}
