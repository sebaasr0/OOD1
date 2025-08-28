package assigment1.c1;

import java.util.ArrayList;
import java.util.List;


public class PopPlaylist implements Playlist {
    private String name;
    private List<Song> songs;

    public PopPlaylist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

// Getter
    @Override
    public String getName() { return name; }

// Methods to add, remove, and play songs
    @Override
    public void addSong(Song song) { songs.add(song); }

    @Override
    public void removeSong(Song song) { songs.remove(song); }

    @Override
    public void playAllSongs() {
        System.out.println("🎶 Playing Pop Playlist: " + name);
        for (Song s : songs) {
            System.out.println("Playing: " + s);
        }
    }

    @Override
    public List<Song> getSongs() {
        return songs;
    }
}
