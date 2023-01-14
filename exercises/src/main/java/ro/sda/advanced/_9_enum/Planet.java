package ro.sda.advanced._9_enum;

public class Planet extends HeavenlyBody{

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }

    @Override
    public Boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyType() == BodyType.MOON){
            return super.addSatellite(moon);
        }
        return false;
    }
}