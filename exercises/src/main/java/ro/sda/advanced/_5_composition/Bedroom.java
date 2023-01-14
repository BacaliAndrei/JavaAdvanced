package ro.sda.advanced._5_composition;

public class Bedroom {
    private Wall wall1, wall2, wall3, wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Window window;
    private Lamp lamp;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Window window, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.window = window;
        this.lamp = lamp;


    }

    public void turnOnTheLamp() {
        lamp.turnOn();
        System.out.println("Method turnOfTheLamp() from the Bedroom class is called.");
    }

    public void turnOffTheLamp() {
        lamp.turnOff();
        System.out.println("Method turnOffTheLamp() from the Bedroom class is called.");
    }


}
