package assigment1.b1;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println(song.getTitle() + " added to playlist " + name);
    }

    public void removeSong(Song song) {
        songs.remove(song);
        System.out.println(song.getTitle() + " removed from playlist " + name);
    }

    public void playAllSongs() {
        System.out.println("Playing all songs in playlist: " + name);
        for (Song song : songs) {
            System.out.println("Playing: " + song.getTitle() + " by " + song.getArtist());
        }
    }
}