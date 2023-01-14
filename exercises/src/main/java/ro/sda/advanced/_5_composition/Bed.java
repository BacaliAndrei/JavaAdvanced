package ro.sda.advanced._5_composition;

public class Bed {
    private int numberOfPillows;
    private String style;

    public Bed(int numberOfPillows, String style) {
        this.numberOfPillows = numberOfPillows;
        this.style = style;
    }

    public int getNumberOfPillows() {
        return numberOfPillows;
    }

    public String getStyle() {
        return style;
    }
}
