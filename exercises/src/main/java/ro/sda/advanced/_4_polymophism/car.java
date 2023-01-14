package ro.sda.advanced._4_polymophism;

// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 subclasses for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).
public class car {

    private String color;
    private int cylinders;
    private int numberOfWheels;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public car() {

    }


    public String getColor() {
        return color;
    }

    public int getCylinders() {
        return cylinders;
    }

    public car(String color, int cylinders) {
        this.color = color;
        this.cylinders = cylinders;
        this.numberOfWheels = 4;


    }

    public void accelerate() {
        System.out.println("Car - > accelerate() :");

    }

    public void brake() {
        System.out.println("Car - > decelerate() :");

    }
}

class Dacia extends car {

    public Dacia(String color, int cylinders) {
        super(color, cylinders);
    }

    @Override
    public void accelerate() {

        System.out.println("Dacia accelerate");

    }

    @Override
    public void brake() {

        System.out.println("Dacia decelerate");

    }

    public void daciaSpecificMethod(){
        System.out.println("Do something!");
    }

}
class Volvo extends car {

    public Volvo(String color, int cylinders) {
        super(color, cylinders);
    }

    @Override
    public void accelerate() {

        System.out.println("Volvo accelerate");

    }

    @Override
    public void brake() {

        System.out.println("Volvo decelerate");

    }

}
class Audi extends car {

    public Audi(String color, int cylinders) {
        super(color, cylinders);
    }

    @Override
    public void accelerate() {

        System.out.println("Audi accelerate");

    }

    @Override
    public void brake() {

        System.out.println("Audi decelerate");

    }

}