package ro.sda.advanced._3_interface_VS_abstract;

// animal / can fly
// bird
// parrot
public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
        System.out.println("Parrot constructor called!");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying!");
    }
}
