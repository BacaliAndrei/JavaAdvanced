package DesignPatterns._3_Factory;

public class FactoryPatternDEmo {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Shape shape1 = factory.crate("Circle");
        shape1.draw();
        Shape shape2 = factory.crate("Rectangle");
        shape2.draw();
        Shape shape3 = factory.crate("Square");
        shape3.draw();
    }
}
