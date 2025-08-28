package assigment1.c1;

import java.util.ArrayList;
import java.util.List;

// TrapPlaylist class implementing Playlist interface
public class TrapPlaylist implements Playlist {
    private String name;
    private List<Song> songs;

    // Constructor
    public TrapPlaylist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // Getter for name
    @Override
    public String getName() { return name; }

    // Methods to add, remove, and play songs
    @Override
    public void addSong(Song song) { songs.add(song); }

    @Override
    public void removeSong(Song song) { songs.remove(song); }

    @Override
    public void playAllSongs() {
        System.out.println("🎧 Playing Trap Playlist: " + name);
        for (Song s : songs) {
            System.out.println("Playing: " + s);
        }
    }

    // Getter for songs
    @Override
    public List<Song> getSongs() {
        return songs;
    }
}

