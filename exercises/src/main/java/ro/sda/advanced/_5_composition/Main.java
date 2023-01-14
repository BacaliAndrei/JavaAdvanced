package ro.sda.advanced._5_composition;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("white", "north");
        Wall wall2 = new Wall("pink", "south");
        Wall wall3 = new Wall("white", "east");
        Wall wall4 = new Wall("purple", "north");

        Wall wall5 = new Wall("abc", "abc");

        Ceiling ceiling = new Ceiling("white", 12);

        Bed bed = new Bed(4, "victorian");

        Window window = new Window(5, 5);

        Lamp lamp = new Lamp("minimalist", true);


        Bedroom bedroom = new Bedroom(wall1, wall2, wall3, wall4,ceiling, bed, window, lamp);

        bedroom.turnOffTheLamp();

        bedroom.turnOnTheLamp();


    }

}

