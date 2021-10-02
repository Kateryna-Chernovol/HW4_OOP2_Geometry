package com.cursor.geometry;

import java.util.ArrayList;

public class Circle extends PlaneShape {
    private double radius;

    public Circle(Vertice2D a, double radius) {
        vertices = new ArrayList<>();
        vertices.add(a);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (radius + radius);
    }
}
