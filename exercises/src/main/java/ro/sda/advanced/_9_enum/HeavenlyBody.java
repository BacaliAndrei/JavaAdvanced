package ro.sda.advanced._9_enum;

import java.security.Key;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Create an enum called BodyType which has the following values: STAR, PLANET, MOON, DWARF_PLANET;
 * <p>
 * Create an abstract class HeavenlyBody which would be our base class that every celestial body will implement
 * The class should have the following instance variables:
 * - a Set of HeavenlyBody objects called satellites set
 * - orbitalPeriod which is a double
 * - Key (which is another class, a static nested class in the HeavenlyBody)
 * For this Key class, it should be a nested static class in the HeavenlyBody and should have the following fields:
 * - String name;
 * - BodyType bodyType;
 * The following methods should be also included in the Key class:
 * - a constructor which initialize both fields
 * - getName() - getter for the name
 * - getBodyType() - getter for the bodyType
 * - hashCode() - method should be overridden
 * - equals() - method should be overridden
 * - toString() - should be also overridden
 * <p>
 * The following methods should be also included in the HeavenlyBody class:
 * - a constructor which takes as parameters a name(String), orbitalPeriod(double), and bodyType(BodyType) -
 * creates a new Key by calling Key's constructor and initialize the satellites set with a new HashSet<>();
 * - getKey() - getter for the key
 * - getOrbitalPeriod() - getter for orbitalPeriod
 * - getSatellites() - getter for satellites set (use Collections.unmodifiableSet(this.satellites))
 * - boolean addSatellite(HeavenlyBody moon) - add a new item to the satellites set (return true or false if the operation succeeded)
 * - override equals() - it should only use keys for comparing objects
 * - override hashcode() - it should only use key hashcode method
 * - override toString() - print key name, bodyType and orbitalPeriod
 * - create a static method called makeKey(String name, BodyType bodyType) which returns a new Key created using Key class constructor
 * <p>
 * <p>
 * For each of the types that you support, subclass the HeavenlyBody class
 * so that your program can create objects of the appropriate type.
 * <p>
 * Example:
 * <p>
 * public class Moon extends HeavenlyBody {
 * public Moon(String name, double orbitalPeriod) {
 * super(name, orbitalPeriod, BodyType.MOON);
 * }
 * }
 * <p>
 * NOTE: You can override the addSatellites method in the above example and throw a custom Exception
 * NOTE: For the Planet class override the addSatellites method and check if the satellite received as parameter is a moon, if is not a moon do not add it as a satellite
 * <p>
 * <p>
 * In main create:
 * - a static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem - which will contain all the bodies in the solar system
 * - a static Set<HeavenlyBody> planets - which will contain only planets from the solar system
 * - a static Set<HeavenlyBody> start - which will contain the stars from a solar system
 */

public abstract class HeavenlyBody {

//    private Set<HeavenlyBody> satellites = new HashSet<>();
//    private double orbitalPeriod;
//    private static Key key;
//
//
//    public double getOrbitalPeriod() {
//        return orbitalPeriod;
//    }
//
//    public static Key getKey() {
//        return key;
//    }
//
//    public Set<HeavenlyBody> getSatellitesSet() {
//        return getSatellitesSet();
//    }
//    public Boolean addSatellite(HeavenlyBody moon){
//        return getSatellitesSet().add(moon);
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof HeavenlyBody)) return false;
//        HeavenlyBody that = (HeavenlyBody) o;
//        return Objects.equals(key, that.key);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(key);
//    }
//
//    @Override
//    public String toString() {
//        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
//    }
//
//
//
//    public HeavenlyBody(double orbitalPeriod, String name, BodyType bodyType) {
//        this.orbitalPeriod = orbitalPeriod;
//        this.key = new Key(name, bodyType);
//        this.satellites = new HashSet<>();
//
//
//
//
//    }
//
//
//    static class Key {
//
//        private String name;
//        private BodyType bodyType;
//        private Object key;
//
//
//        public Key(String name, BodyType bodyType) {
//            this.name = name;
//            this.bodyType = bodyType;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public BodyType getBodyType() {
//            return bodyType;
//        }
//
//        @Override
//        public String toString() {
//            return this.name + ": " + this.bodyType;
//        }
//
//    }
//
//}

    private Set<HeavenlyBody> satelliteSet;
    private double orbitalPeriod;
    private Key key;


    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.orbitalPeriod = orbitalPeriod;
        this.key = new Key(name, bodyType);
        this.satelliteSet = new HashSet<>();
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    public Set<HeavenlyBody> getSatelliteSet() {
        return satelliteSet;
    }

    public Boolean addSatellite(HeavenlyBody moon) {
        return satelliteSet.add(moon);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HeavenlyBody)) return false;
        HeavenlyBody that = (HeavenlyBody) o;
        return Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    static class Key {
        private String name;
        private BodyType bodyType;

        public Key(String name, BodyType bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return Objects.equals(name, key.name) && bodyType == key.bodyType;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, bodyType);
        }
    }
}


