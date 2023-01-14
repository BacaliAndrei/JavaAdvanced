package ro.sda.advanced._4_polymophism;

public class Main {

    public static void main(String[] args) {

        car myCar=new car("Red",8);
        myCar.accelerate();
        myCar.brake();

        car logan=new Dacia("Gray",4);
        logan.accelerate();
        logan.brake();
        //bcs the reference is type car which is dacia's base class we can access only the methods that are in car class
        //logan.daciaSpecificMethod();

        Volvo volvo=new Volvo("Black",6);
        volvo.accelerate();
        volvo.brake();

        Audi A4=new Audi("Candy blue",6);
        A4.accelerate();
        A4.brake();
    }

}
