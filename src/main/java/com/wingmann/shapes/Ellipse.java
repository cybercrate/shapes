package com.wingmann.shapes;

public class Ellipse extends Shape {
    private final double aRadius;
    private final double bRadius;

    public Ellipse(double aRadius, double bRadius) {
        this.aRadius = aRadius;
        this.bRadius = bRadius;
    }

    @Override
    public double area() {
        return Math.PI * aRadius * bRadius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * aRadius + bRadius * 2;
    }

    @Override
    public String toString() {
        return String.format("Ellipse { a-radius: %s, b-radius: %s }", aRadius, bRadius);
    }
}
