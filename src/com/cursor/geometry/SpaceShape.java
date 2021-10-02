package com.cursor.geometry;

import java.util.List;

public class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    /**
     * base class for all three-dimensional shapes,
     * holds a list of 3D vertices (holding x, y and z),
     * implements AreaMeasurable and VolumeMeasurable interfaces
     */

    protected List<Vertice3D> vertices3D;

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
