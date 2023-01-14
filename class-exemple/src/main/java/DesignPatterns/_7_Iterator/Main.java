package DesignPatterns._7_Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String names[] = {"Andrei", "Robert", "Vasile"};
        NameRepository repository = new NameRepository(names);
        Iterator iterator= repository.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
