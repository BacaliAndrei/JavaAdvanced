package DesignPatternExercises._3_;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServersEager {

    private static ServersEager instance = new ServersEager();
    private List<String> serversList;

    private ServersEager() {
        this.serversList = new ArrayList<>();
    }

    public static ServersEager getInstance() {
        return instance;
    }

    public Boolean addServer(String server) {
        if (serversList.contains(server) && server.startsWith("http") || server.startsWith("https")) {
            serversList.add(server);
            return true;
        } else {
            return false;
        }
    }

    public List<String> httploadServer() {
        //am folosit lambda ca sa colectam si sa o transformam intr o lista inpoi
        //operatii intermediare .stream transforma lista stream
        return serversList.stream().filter(x -> x.startsWith("http")).collect(Collectors.toList());
    }

    public List<String> httpsloadServer() {
        //am folosit lambda ca sa colectam si sa o transformam intr o lista inpoi
        return serversList.stream().filter(x -> x.startsWith("https")).collect(Collectors.toList());
    }
}