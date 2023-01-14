package ro.sda.advanced._3_interface_VS_abstract;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called!");
    }

    public String getName() {
        return name;
    }

    protected abstract void eat();

    protected abstract void breath();


}
