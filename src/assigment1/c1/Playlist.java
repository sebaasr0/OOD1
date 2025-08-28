package assigment1.c1;

import java.util.List;

// Playlist interface
public interface Playlist {

// Getter for name
    String getName();

// Methods to add, remove, and play songs
    void addSong(Song song);

    void removeSong(Song song);

// Play all songs in the playlist
    void playAllSongs();


    List<Song> getSongs();
}
