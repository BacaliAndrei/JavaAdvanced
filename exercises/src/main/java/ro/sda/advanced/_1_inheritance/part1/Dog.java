package ro.sda.advanced._1_inheritance.part1;

public class Dog extends Animal {
    int eyes;
    int legs;
    int teeth;
    String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int teeth, String coat) {
        super(name, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
    }
}
