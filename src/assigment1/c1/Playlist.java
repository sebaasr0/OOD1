package assigment1.c1;

import java.util.List;


public interface Playlist {


    String getName();


    void addSong(Song song);

    void removeSong(Song song);


    void playAllSongs();


    List<Song> getSongs();
}
