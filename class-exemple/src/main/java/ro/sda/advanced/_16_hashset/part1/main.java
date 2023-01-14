package ro.sda.advanced._16_hashset.part1;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        Set<Integer>numbers=new HashSet<>();

        System.out.println(numbers.add(2));
        System.out.println(numbers.add(5));
        System.out.println(numbers.add(6));
        System.out.println(numbers.add(2));

        System.out.println("hashset "+numbers);
        System.out.println(numbers.remove(5));
        System.out.println("hashset "+numbers);

        Set<String>commonNames=new HashSet<>();

        commonNames.add("Ion");
        commonNames.add("Andrei");
        commonNames.add("Ana");
        commonNames.add("Cristi");
        commonNames.add("Maria");
        commonNames.add("Andrei");

        System.out.println(commonNames);
        System.out.println(commonNames.contains("Ana"));

    }
}
