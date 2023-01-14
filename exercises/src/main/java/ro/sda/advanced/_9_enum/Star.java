package ro.sda.advanced._9_enum;

public class Star extends HeavenlyBody{

    public Star(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.STAR);
    }
}