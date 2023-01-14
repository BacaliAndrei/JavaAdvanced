package DesignPatternExercises._4_;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum ServersEnum {

    INSTANCE;
    private List<String> serversList;

    ServersEnum() {
        this.serversList = new ArrayList<>();
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