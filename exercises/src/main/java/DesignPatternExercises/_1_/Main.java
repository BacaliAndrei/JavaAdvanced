package DesignPatternExercises._1_;

public class Main {
    public static void main(String[] args) {
        Servers server1=Servers.getInstance();
        server1.addServers("https://test.com");
        System.out.println(server1.httpServers());
        System.out.println(server1.httpsServers());
    }
}