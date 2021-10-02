package com.cursor.geometry;

import java.util.ArrayList;

public class Cuboid extends SpaceShape {
    private double cuboidWidth, cuboidHeight, cuboidDepth;

    public Cuboid(Vertice3D a, double cuboidWidth, double cuboidHeight, double cuboidDepth) {
        vertices3D = new ArrayList<>();
        vertices3D.add(a);
        this.cuboidWidth = cuboidWidth;
        this.cuboidHeight = cuboidHeight;
        this.cuboidDepth = cuboidDepth;
    }

    @Override
    public double getArea() {
        return 2 * (cuboidWidth * cuboidHeight + cuboidWidth * cuboidDepth + cuboidHeight * cuboidDepth);
    }

    @Override
    public double getVolume() {
        return cuboidWidth * cuboidHeight * cuboidDepth;
    }
}
