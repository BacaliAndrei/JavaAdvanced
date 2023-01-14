package DesignPatternExercises._3_;

import DesignPatternExercises._1_.Servers;

public class Main {

    public static void main(String[] args) {

        //ctrld copiaza ce am scris

        Servers servers1 = Servers.getInstance();
        servers1.addServer("http://test.com");
        servers1.addServer("https://designpatterns.com");
        System.out.println(servers1.httploadServer());

    }
}
