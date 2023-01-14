package DesignPatternExercises._1_;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Servers {
    private static Servers instance;

    private List<String> listOfServers;
    private Servers(){
        listOfServers=new ArrayList<>();

    }
    public static Servers getInstance(){
        if(instance==null){
            instance=new Servers();
        }
        return instance;
    }
    public boolean addServers(String server){
        if(!listOfServers.contains(server)&&(server.startsWith("http"))||(server.startsWith("https"))){
            listOfServers.add(server);
            return true;
        }
        return false;
    }
    public List<String> httpServers(){
        return listOfServers.stream().filter(x->x.startsWith("http")).collect(Collectors.toList());
    }
    public List<String> httpsServers(){
        return listOfServers.stream().filter(x->x.startsWith("https")).collect(Collectors.toList());

    }
}

