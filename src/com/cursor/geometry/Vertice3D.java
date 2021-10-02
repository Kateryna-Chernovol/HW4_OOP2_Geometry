package com.cursor.geometry;

public class Vertice3D {
    double x;
    double y;
    double z;

    public Vertice3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distanceTo(Vertice3D other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) +
                Math.pow(this.y - other.y, 2) +
                Math.pow(this.z - other.z, 2));
    }

    @Override
    public String toString() {
        return "" +
                "x = " + x +
                ", y = " + y +
                ", z = " + z +
                ' ';
    }
}
