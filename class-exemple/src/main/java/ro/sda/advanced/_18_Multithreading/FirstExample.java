package ro.sda.advanced._18_Multithreading;

import com.google.common.collect.Lists;

import java.util.List;

public class FirstExample {

    static final List<Integer> largeCollection = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


    public static void main(String[] args) {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (Integer el : largeCollection) {
                    System.out.println(el);
                }
                System.out.println("------------------------");
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (Integer el : largeCollection) {
                    System.out.println(el);
                }

            }


        };
        t1.start();
        t2.start();
    }
}
