package assigment1.b1;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Playlist> playlists;

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void createPlaylist(String name, String type) {
        Playlist playlist;
        switch (type.toLowerCase()) {
            case "pop":
                playlist = new PopPlaylist(name);
                break;
            case "rock":
                playlist = new RockPlaylist(name);
                break;
            case "jazz":
                playlist = new JazzPlaylist(name);
                break;
            default:
                System.out.println("Invalid playlist type!");
                return;
        }
        playlists.add(playlist);
        System.out.println(type + " playlist " + name + " created.");
    }

    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
        System.out.println("Playlist " + playlist.getName() + " deleted.");
    }

    public void addSongToPlaylist(Playlist playlist, Song song) {
        playlist.addSong(song);
    }

    public void removeSongFromPlaylist(Playlist playlist, Song song) {
        playlist.removeSong(song);
    }
}