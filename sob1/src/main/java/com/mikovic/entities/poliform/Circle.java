package com.mikovic.entities.poliform;

public class Circle extends Shape implements Sqrt {


    public void draw() {
      System.out.println("Нарисован круг");
    }

    public void inform() {
        System.out.printf("Площадь круга =%.2f \n", getSqrt());
    }

    public Circle(double diametr){
        super(diametr);
    }


    public double getSqrt() {
        return Math.PI*getSide();
    }
}
