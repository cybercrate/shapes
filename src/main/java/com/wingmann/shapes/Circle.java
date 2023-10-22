package com.wingmann.shapes;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void print() {
        System.out.println("""
                      _          _
                     (_)        | |
                  ___ _ _ __ ___| | ___
                 / __| | '__/ __| |/ _ \\
                | (__| | | | (__| |  __/
                 \\___|_|_|  \\___|_|\\___|
                """);
    }

    @Override
    public String toString() {
        return String.format("Circle { radius: %s }", radius);
    }
}
