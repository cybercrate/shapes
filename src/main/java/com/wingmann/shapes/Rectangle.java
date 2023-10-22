package com.wingmann.shapes;

public class Rectangle implements Shape {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    @Override
    public void print() {
        System.out.println("""
                               _                    _
                              | |                  | |
                 _ __ ___  ___| |_ __ _ _ __   __ _| | ___
                | '__/ _ \\/ __| __/ _` | '_ \\ / _` | |/ _ \\
                | | |  __/ (__| || (_| | | | | (_| | |  __/
                |_|  \\___|\\___|\\__\\__,_|_| |_|\\__, |_|\\___|
                                               __/ |
                                              |___/
                """);
    }

    @Override
    public String toString() {
        return String.format("Rectangle { width: %s, length: %s }", width, length);
    }
}
