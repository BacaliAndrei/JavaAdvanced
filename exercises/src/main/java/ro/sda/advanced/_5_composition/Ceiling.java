package ro.sda.advanced._5_composition;

public class Ceiling {
    private String color;
    private double height;

    public Ceiling(String color, double height) {
        this.color = color;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }
}
