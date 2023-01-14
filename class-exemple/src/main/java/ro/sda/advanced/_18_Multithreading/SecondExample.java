package ro.sda.advanced._18_Multithreading;

import java.util.HashMap;
import java.util.Map;

import static ro.sda.advanced._18_Multithreading.SecondExample.sharedMap;

public class SecondExample {

    static Map<String, String> sharedMap = new HashMap<>();


    static {
        sharedMap.put("key", "something");
    }

    public static void main(String[] args) {

        Thread t1=new Thread(new MyRunnable());
        Thread t2=new Thread(new MyRunnable());
        Thread t3=new Thread(new MyRunnable());

        t1.start();
        t2.start();
        t3.start();

    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {


                if (sharedMap.containsKey("key")) {

                    System.out.println(Thread.currentThread().getName());

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    String val = sharedMap.remove("key");
                    if (val == null) {
                        System.out.println("value for 'key' was null");
                    }

                } else {
                    System.out.println("condition was false");
                }
            }

        }

    static class MyRunnableSyncronyzed implements Runnable {
        @Override
        public void run() {

            synchronized (sharedMap){
                if (sharedMap.containsKey("key")) {

                    System.out.println(Thread.currentThread().getName());

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    String val = sharedMap.remove("key");
                    if (val == null) {
                        System.out.println("value for 'key' was null");
                    }

                } else {
                    System.out.println("condition was false");
                }
            }

        }

    }
}

