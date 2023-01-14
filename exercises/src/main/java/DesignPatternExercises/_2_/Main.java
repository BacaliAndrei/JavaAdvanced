package DesignPatternExercises._2_;

public class Main {

    public static void main(String[] args) {


        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ServersThread serversThread = ServersThread.getInstance();
                System.out.println(serversThread.hashCode());
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ServersThread serversThread2 = ServersThread.getInstance();
                System.out.println(serversThread2.hashCode());
            }
        });
        th1.start();
        th2.start();
    }
}

