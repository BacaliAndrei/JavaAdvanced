package ro.sda.advanced._1_inheritance.part_1;

public class Bicycle {
    //fields /attributes/ instance variable
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed +=increment;
    }

}
