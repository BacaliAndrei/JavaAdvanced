package ro.sda.advanced._15_Enum.part2;

public enum Coffee {
    ESPRESSO(2.1,"Short coffee"),
    LATE(3.5,"Coffee with milk"),
    AMERICANO(3,"Long coffee");

    private double price;
    private String description;

    //private by default , can't be public
    Coffee(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
