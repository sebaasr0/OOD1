package assigment1.c1;

import java.util.ArrayList;
import java.util.List;

public class TrapPlaylist implements Playlist {
    private String name;
    private List<Song> songs;

    public TrapPlaylist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    @Override
    public String getName() { return name; }

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

    @Override
    public List<Song> getSongs() {
        return songs;
    }
}

