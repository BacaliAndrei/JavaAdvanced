package ro.sda.advanced._Input_output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<TravelDestinations> destinationsList = new ArrayList<>();

    static {
        destinationsList.add(new TravelDestinations("Bucuresti", 2_000_000, "Micul Paris"));
        destinationsList.add(new TravelDestinations("Paris", 5_000_000, "Original"));
        destinationsList.add(new TravelDestinations("Cluj", 1_500_000, "Only place where you will find Manhatenstur"));
    }

    public static void main(String[] args) {
        BufferedWriter bf = null;
        try {
            bf = new BufferedWriter(new FileWriter("exercises/src/main/resources/outputFile.txt"));

            for (TravelDestinations el : destinationsList) {
                bf.write(el.getCityName() + "," + el.getPopulation() + "," + el.getDescription() + "\n");

            }

        } catch (IOException e) {
            e.printStackTrace();

            System.out.println("In catch block!");

        } finally {
            System.out.println("In finally block!");
            if (bf != null) {
                try {
                    bf.close();
                    System.out.println("Attempting to catch bf");
                } catch (IOException e) {
                    throw new RuntimeException(e);

                }
            }
        }

    }
}
