package com.mikovic.entities.poliform;

public abstract class Shape {
    private double side;

    public abstract void draw();
    public abstract void inform();

    public Shape(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
