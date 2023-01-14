package ro.sda.advanced._19_Input_Output;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("string 11\n");
        list.add("string 22\n");
        list.add("string 33\n");
        list.add("string 44\n");
        list.add("string 55\n");

        BufferedWriter bf = null;

        try{
            bf = new BufferedWriter(new FileWriter("class-examples/src/main/resources/output-file.txt"));

            for(String el : list){
                bf.write(el);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if(bf != null){

                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

}