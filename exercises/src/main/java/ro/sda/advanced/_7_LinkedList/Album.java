package ro.sda.advanced._7_LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a class Album with the following instance variables: name - String, artist - String, songs - List of Songs
 * <p>
 * Create the following methods:
 * - constructor
 * <p>
 * - getters for name and artist
 * <p>
 * - findSong(title) - iterate through the list of songs and compare title parameter with song name
 * and if the song is found then return the song, otherwise return null
 * <p>
 * - addSong(title, duration) - method used to add a song to the album
 * first check if the song has been already added in album (use findSong method)
 * if song is not already in album then add it
 */
public class Album {

    private String name;
    private String artist;
    private List<Song> listOfSongs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.listOfSongs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public Song findSong(String title) {
        for (Song el : listOfSongs) {
            if (el.getTitle().equals(title)) {
                return el;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration) {
        Song myVar = findSong(title);
       if (myVar==null){
           this.listOfSongs.add(new Song(title,duration));
           return true;
       }
       return false;
    }


}
