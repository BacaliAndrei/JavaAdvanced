package ro.sda.advanced._3_interface_VS_abstract;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        System.out.println("Dog constructor called!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating!");
    }

    @Override
    public void breath() {
        System.out.println("Dog is alive");
    }
}
