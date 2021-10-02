package com.cursor.geometry;

import java.util.List;

public class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable{
    /**
     * PlaneShape – base class for all plane (2D) shapes,
     * holds a list of 2D vertices (holding x and y),
     * implements PerimeterMeasurable and AreaMeasurable interfaces
     */
    protected List<Vertice2D> vertices;

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
