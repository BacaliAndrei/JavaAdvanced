package ro.sda.advanced._11_array_list;

import ro.sda.advanced._9_composition.Car;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        int[] myArray = new int[10];

        myArray[0] =10;
        myArray[1] =399;
        myArray[2] =1010;


        int[] myOtherArray = new int[]{1, 2, 3, 4};

        for (int el : myArray) {
            System.out.println(el + " ");
        }
        System.out.println("------------------------");

        for (int el : myOtherArray) {
            System.out.println(el + " ");
        }


        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Double> doubleArrayList = new ArrayList<>();

        ArrayList<String> stringArrayList = new ArrayList<>();

        ArrayList<Car> carArrayList = new ArrayList<>();
        list.add(10);
        list.add(99);
        list.add(39);

    }


}
