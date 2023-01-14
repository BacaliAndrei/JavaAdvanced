package ro.sda.advanced._7_Interfaces;

public class main {

    public static void main(String[] args) {

        Shape circle = new Circle(10);

        circle.draw();

        System.out.println("Area = " + circle.getArea());

        Shape rectangle = new rectangle(10, 10);

        rectangle.draw();

        System.out.println("Area = " + rectangle.getArea());

    }
}

