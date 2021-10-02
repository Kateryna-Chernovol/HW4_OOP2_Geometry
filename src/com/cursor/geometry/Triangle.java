package com.cursor.geometry;

import java.util.ArrayList;

public class Triangle extends PlaneShape {
    private boolean triangleExist = false;

    public Triangle(Vertice2D a, Vertice2D b, Vertice2D c) {
        vertices = new ArrayList<>();
        vertices.add(a);
        vertices.add(b);
        vertices.add(c);
        /**
         * Check whether triangle exist or not:
         * a + b> c, a + c> b, b + c> a, (a> 0, b> 0, c> 0),
         */
        double sideA = a.distanceTo(b);
        double sideB = b.distanceTo(c);
        double sideC = c.distanceTo(a);
        if (sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA &&
                sideA > 0 &&
                sideB > 0 &&
                sideC > 0) {
            triangleExist = true;
        } else {
            System.out.println("Incorrect data, triangle doesn`t exist");
        }
    }


    @Override
    public double getArea() {
        if (!triangleExist) {
            System.out.println("Incorrect data, triangle doesn`t exist");
            return 0;
        }

        double hp = getPerimeter() / 2; // ph is halfPerimeter
        Vertice2D a = vertices.get(0);
        Vertice2D b = vertices.get(1);
        Vertice2D c = vertices.get(2);

        return Math.sqrt
                (hp *
                        (hp - a.distanceTo(b)) *
                        (hp - b.distanceTo(c)) *
                        (hp - c.distanceTo(a))
                );
    }

    @Override
    public double getPerimeter() {
        if (!triangleExist) {
            System.out.println("Incorrect data, triangle doesn`t exist");
            return 0;
        }
        Vertice2D a = vertices.get(0);
        Vertice2D b = vertices.get(1);
        Vertice2D c = vertices.get(2);
        return a.distanceTo(b) + a.distanceTo(c) + b.distanceTo(c);
    }
}
