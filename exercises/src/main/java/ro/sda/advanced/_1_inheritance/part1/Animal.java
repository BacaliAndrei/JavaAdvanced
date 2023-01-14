package ro.sda.advanced._1_inheritance.part1;

public class Animal {

    String name;

    int size;

    int weight;

    public Animal(String name, int size, int weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }


    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public void eat() {

        System.out.println("Animal.eat() called");
    }


}
