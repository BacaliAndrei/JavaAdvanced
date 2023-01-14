package ro.sda.advanced._19_Input_Output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {

        HashMap<Integer, String> ageToNameMap = new HashMap<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("class-exemple\\src\\main\\resources\\data.txt"));

            String line = reader.readLine();

            while (line != null) {
                String[] split = line.split(",");
                ageToNameMap.put(Integer.valueOf(split[0]), split[1]);

                line= reader.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

    }


}
