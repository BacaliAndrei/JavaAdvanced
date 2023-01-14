package ro.sda.advanced._7_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PlayList {

    private List<Album> albums;

    private Queue<Song> playList;

    public PlayList() {
        albums = new ArrayList<>();
        playList = new LinkedList<>();

    }

    public Album findAlbum(String albumTitle) {

        for (Album el : albums) {
            if (el.getName().equals(albumTitle)) {
                return el;
            }
        }
        return null;

    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public boolean addToPlaylist(String albumTitle, String songTitle) {
        Album album = findAlbum(albumTitle);
        if (album != null) {
            Song song = album.findSong(songTitle);
            if (song != null) {
                playList.offer(song);
                return true;
            }
        }
        System.out.println("Album/song not found ! ");

        return false;

    }

    public void playNextSong() {


        if (!playList.isEmpty()) {
            Song nextSong = playList.poll();
            System.out.println("Song with name " + nextSong.getTitle() +" with duration "+ nextSong.getDuration()+ " is playing");
        }
    }

    public void playEntirePlaylist() {
        while (!playList.isEmpty()) {
            Song nextSong = playList.poll();
            System.out.println("Song with name " + nextSong.getTitle()+" with duration "+ nextSong.getDuration() + " is playing");
        }
    }
}
