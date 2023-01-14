package ro.sda.advanced._7_Interfaces;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle!");
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }
}
