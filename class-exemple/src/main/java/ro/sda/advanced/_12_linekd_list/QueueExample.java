package ro.sda.advanced._12_linekd_list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> myQueue=new LinkedList<>();

        myQueue.offer("person1");
        myQueue.offer("person2");
        myQueue.offer("person3");
        myQueue.offer("person4");
        myQueue.offer("person5");

        System.out.println("My queue is: "+myQueue);

        String element=myQueue.poll();

        System.out.println("First element polled from queue: " +element);

        System.out.println("My queue is: "+myQueue);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        element=myQueue.poll();

        System.out.println("Second element polled from queue: " +element);

        System.out.println("My queue is: "+myQueue);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        element =myQueue.peek();

        System.out.println("First element peeked to queue: " +element);

        System.out.println("My queue is: "+myQueue);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        Queue<String>empty=new LinkedList<>();

        String empltyElement=empty.poll();

        System.out.println(empltyElement);


    }


}
