package ro.sda.advanced._3_interface_VS_abstract;

public class Bird extends Animal implements CanFly{

    public Bird(String name){
        super(name);
        System.out.println("Bird constructor called!");
    }

    @Override
    public void eat(){
        System.out.println("Bird is eating!");
    }

    @Override
    public void breath() {
        System.out.println("Breathe in , breathe out , repeat");
    }
    @Override
    public void fly(){
        System.out.println("Bird is flapping its wings!");
    }
}
