package com.mikovic.entities.poliform;

public class Triangle extends Shape implements Sqrt {
    double base;
    public Triangle(double height, double base) {
        super(height);
        this.base =base;
    }

    public void draw() {
        System.out.println("Нарисован треугольник");
    }

    public double getSqrt() {
        return  getSide()*base/2;

    }
    public void inform() {
        System.out.printf("Площадь треугольника =%.2f; \n", getSqrt());
    }
}
