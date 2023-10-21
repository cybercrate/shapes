package com.wingmann.shapes;

public class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public void print() {
        System.out.println("""
                 ___  __ _ _   _  __ _ _ __ ___
                / __|/ _` | | | |/ _` | '__/ _ \\
                \\__ \\ (_| | |_| | (_| | | |  __/
                |___/\\__, |\\__,_|\\__,_|_|  \\___|
                        | |
                        |_|
                """);
    }

    @Override
    public String toString() {
        return String.format("Square { side: %s }", side);
    }
}
