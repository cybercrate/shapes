package com.wingmann.shapes;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final var shapes = List.of(
                new Circle(6.0),
                new Ellipse(5.4, 7.1),
                new Square(8.8),
                new Rectangle(7.0, 12.2));

        for (var s : shapes) {
            System.out.printf("%s (area = %s, perimeter = %s)%n", s, s.area(), s.perimeter());
        }
    }
}
