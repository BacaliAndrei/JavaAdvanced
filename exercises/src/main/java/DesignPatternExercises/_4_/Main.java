package DesignPatternExercises._4_;

public class Main {public static void main(String[] args) {

    //ctrld copiaza ce am scris

    ServersEnum servers1 = ServersEnum.INSTANCE;
    servers1.addServer("http://test.com");
    servers1.addServer("https://designpatterns.com");
    System.out.println(servers1.httploadServer());

}
}
