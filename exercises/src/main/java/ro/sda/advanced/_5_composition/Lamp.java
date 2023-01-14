package ro.sda.advanced._5_composition;

public class Lamp {
    private String style;
    private boolean isTurnedOn;

    public Lamp(String style, boolean isTurnedOn) {
        this.style = style;
        this.isTurnedOn = isTurnedOn;
    }

    public String getStyle() {
        return style;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void turnOn() {
        isTurnedOn = true;
        System.out.println("Lamp is turned on!");
    }

    public void turnOff() {
        isTurnedOn = false;
        System.out.println("Lamp is turned off!");
    }
}
