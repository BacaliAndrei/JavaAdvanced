package ro.sda.advanced._Input_output;
/**
 * Create a class TravelDestination with the following instance variables: cityName - String,
 * population - long, description - String
 *
 * Create the following methods:
 * - constructor
 * - getters/setters
 *
 * Create a class main with a List of TravelDestination as static member
 * Use static initializer to add elements to the list
 *
 * Use a BufferedWriter which will wrap a FileWriter and write the collection of destinations to a file
 * (separate the values with comma)
 *
 * Hint:
 * -> Do not forget to proper close the bufferReader
 */

public class TravelDestinations {
    private String cityName;
    private long population;
    private String description;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TravelDestinations(String cityName, long population, String description) {
        this.cityName = cityName;
        this.population = population;
        this.description = description;
    }
    @Override
    public String toString() {
        return cityName + " population: " + population + " description: " + description;
    }

}
