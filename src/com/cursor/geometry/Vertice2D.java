package com.cursor.geometry;

public class Vertice2D {
    double x;
    double y;

    public Vertice2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Vertice2D other) {
        return Math.sqrt(
                (this.x - other.x) * (this.x - other.x) +
                        (this.y - other.y) * (this.y - other.y));
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y + ' ';
    }
}
