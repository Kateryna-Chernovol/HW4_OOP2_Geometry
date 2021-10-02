package com.cursor.geometry;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------2D Shape----------" + "\n");

        System.out.println("Triangle");
        Triangle triangle = new Triangle(
                new Vertice2D(2, 2),
                new Vertice2D(5, 8),
                new Vertice2D(5, 2));
        System.out.println("Perimeter: " +
                String.format("%.3f", triangle.getPerimeter()) + "\n" + "Area: " +
                String.format("%.3f", triangle.getArea()) + "\n");

        System.out.println("Rectangle");
        Rectangle rectangle = new Rectangle(
                10, 5, new Vertice2D(3, 3));
        System.out.println("Perimeter: " +
                String.format("%.3f", rectangle.getPerimeter()) + "\n" + "Area: " +
                String.format("%.3f", rectangle.getArea()) + "\n");

        System.out.println("Circle");
        Circle circle2D = new Circle(
                new Vertice2D(5, 7),
                9);
        System.out.println("Perimeter: " +
                String.format("%.3f", circle2D.getPerimeter()) + "\n" + "Area: " +
                String.format("%.3f", circle2D.getArea()) + "\n");

        System.out.println("----------3D Shape----------" + "\n");
        System.out.println("Cuboid");
        Cuboid cuboid = new Cuboid(
                new Vertice3D(5, 3, 2),
                5,
                2,
                6);
        System.out.println("Area: " +
                String.format("%.3f", cuboid.getArea()) + "\n" + "Volume: " +
                String.format("%.3f", cuboid.getVolume()) + "\n");

        System.out.println("Sphere");
        Sphere sphere = new Sphere(
                5, new Vertice3D(3, 0, 0));
        System.out.println("Area: " +
                String.format("%.3f", sphere.getArea()) + "\n" + "Volume: " +
                String.format("%.3f", sphere.getVolume()) + "\n");
    }
}
