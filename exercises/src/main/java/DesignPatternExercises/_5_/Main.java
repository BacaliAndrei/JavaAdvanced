package DesignPatternExercises._5_;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog.DogBuilder().name("Max")
                .age(5)
                .toys(Arrays.asList("dsa", "sdasda", "2wera"))
                .build();
        System.out.println(dog1);

    }
}
