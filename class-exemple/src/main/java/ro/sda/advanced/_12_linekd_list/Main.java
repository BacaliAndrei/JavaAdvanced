package ro.sda.advanced._12_linekd_list;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> animals=new LinkedList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Horse");
        animals.add("Bird");
        animals.add("lion");


        System.out.println("linked list :"+animals);

        String str=animals.get(1);

        System.out.println("Animal index 1 :"+str);

        animals.set(4,"Goat");

        System.out.println("linked list :"+animals);

    }
}
