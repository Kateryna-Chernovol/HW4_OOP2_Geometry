package com.cursor.geometry;

import java.util.ArrayList;

public class Rectangle extends PlaneShape {
    private double width;
    private double height;

    public Rectangle(double width, double height, Vertice2D a) {
        vertices = new ArrayList<>();
        vertices.add(a);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}
