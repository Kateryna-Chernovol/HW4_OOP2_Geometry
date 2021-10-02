package com.cursor.geometry;

import java.util.ArrayList;

public class Sphere extends SpaceShape {
    private double radius;

    public Sphere(double radius, Vertice3D a) {
        this.radius = radius;
        vertices3D = new ArrayList<>();
        vertices3D.add(a);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

}
