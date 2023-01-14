package ro.sda.advanced._5_composition;

public class Wall {
    private String color;
    private String direction;

    public Wall(String color, String direction) {
        this.color = color;
        this.direction = direction;
    }

    public String getColor() {
        return color;
    }

    public String getDirection() {
        return direction;
    }

}
