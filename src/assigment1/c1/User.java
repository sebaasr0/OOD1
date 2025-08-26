package assigment1.c1;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a user of the SpotifyMODIFIED system.
 * A user can create playlists, delete them,
 * and add/remove songs from them.
 */
public class User {
    private String username;
    private List<Playlist> playlists;

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

    /**
     * Create a new playlist of a given type (pop/rock/trap).
     */
    public void createPlaylist(String name, String type) {
        Playlist playlist = null;
        switch(type.toLowerCase()) {
            case "pop": playlist = new PopPlaylist(name); break;
            case "rock": playlist = new RockPlaylist(name); break;
            case "trap": playlist = new TrapPlaylist(name); break;
            default: System.out.println("❌ Unknown playlist type: " + type);
        }
        if (playlist != null) {
            playlists.add(playlist);
            System.out.println("✅ Created " + type + " playlist: " + name);
        }
    }

    /**
     * Delete a playlist
     */
    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
        System.out.println("🗑️ Deleted playlist: " + playlist.getName());
    }

    /**
     * Add a song to a given playlist
     */
    public void addSongToPlaylist(Playlist playlist, Song song) {
        playlist.addSong(song);
        System.out.println("➕ Added " + song.getTitle() + " to " + playlist.getName());
    }

    /**
     * Remove a song from a given playlist
     */
    public void removeSongFromPlaylist(Playlist playlist, Song song) {
        playlist.removeSong(song);
        System.out.println("➖ Removed " + song.getTitle() + " from " + playlist.getName());
    }

    /**
     * Get all playlists for this user
     */
    public List<Playlist> getPlaylists() {
        return playlists;
    }
}
