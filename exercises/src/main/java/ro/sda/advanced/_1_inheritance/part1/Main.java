package ro.sda.advanced._1_inheritance.part1;

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Max", 123, 25, 2, 4, 20, "Black");
        Animal myDog2 = new Dog("Max", 123, 25, 2, 4, 20, "Black");

        myDog.eat();
        System.out.println("-----------------------------");
        myDog2.eat();
    }
}
