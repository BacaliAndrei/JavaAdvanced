package ro.sda.advanced._7_LinkedList;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {

      /*  Song mySong = new Song("BABA YAGA", 4.15);
        System.out.println(mySong);*/


        Album album=new Album("Kostolom","Slaughter of Prevail");
        album.addSong("Demolisher",3.48);
        album.addSong("Bonebreaker",4.25);
        album.addSong("Agony",3.57);
        album.addSong("Bratva",4.50);

        PlayList playList=new PlayList();
        playList.addAlbum(album);

        Album album1=new Album("Misery Sermon","Slaughter of Prevail");
        album1.addSong("Misery Sermon",5.26);
        album1.addSong("King",4.15);
        album1.addSong("666",4.09);
        playList.addAlbum(album1);

        playList.addToPlaylist("Misery Sermon","King");
        playList.addToPlaylist("Kostolom","Demolisher");

        //playList.playNextSong();
        playList.playEntirePlaylist();

    }
}
