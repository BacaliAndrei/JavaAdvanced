package ro.sda.advanced._7_LinkedList;

/**
 * Create a class Song with the following instance variables: title - String, duration - double
 * <p>
 * Create the following methods:
 * - constructor
 * - getters for both fields
 * - override toString() method
 * <p>
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
 * <p>
 * Create a class Playlist with the following instance variables: albums - List of Albums, playlist - Queue of Songs
 * <p>
 * Create the following methods:
 * - constructor with no-args - initialize the list and the queue
 * <p>
 * - finAlbum(title) - iterate through the list of albums and check if title parameter
 * is equal to current iteration album name, if it is equal return the album, otherwise return null
 * <p>
 * - addAlbum(album) - adds the album to the album list and returns true when the operation succeeded, otherwise false
 * <p>
 * - addToPlaylist(albumTitle, songTitle) - use findAlbum method to check if the albumTitle is in albums list
 * if the albumTitle is present the check if the songTitle is in album using findSong() method
 * if the song is present then added it to playlist queue - return true or false is the operation succeeded
 * <p>
 * - playNextSong() - check if playlist queue is not empty and then play the first song in the queue (use poll() method)
 * <p>
 * - playEntirePlaylist() - iterate through playlist and play all songs
 */

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.title + " " + this.duration;
    }
}
