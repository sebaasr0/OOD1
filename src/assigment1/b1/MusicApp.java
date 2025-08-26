package assigment1.b1;

import java.util.Scanner;

public class MusicApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User("JohnDoe");

        System.out.println("Welcome to the Music Streaming App!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Playlist");
            System.out.println("2. Delete Playlist");
            System.out.println("3. Add Song to Playlist");
            System.out.println("4. Remove Song from Playlist");
            System.out.println("5. Play All Songs in Playlist");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    System.out.print("Enter playlist type (Pop, Rock, Jazz): ");
                    String playlistType = scanner.nextLine();
                    user.createPlaylist(playlistName, playlistType);
                    break;

                case 2:
                    System.out.println("Available Playlists:");
                    for (int i = 0; i < user.getPlaylists().size(); i++) {
                        System.out.println((i + 1) + ". " + user.getPlaylists().get(i).getName());
                    }
                    System.out.print("Enter playlist number to delete: ");
                    int playlistIndex = scanner.nextInt() - 1;
                    if (playlistIndex >= 0 && playlistIndex < user.getPlaylists().size()) {
                        user.deletePlaylist(user.getPlaylists().get(playlistIndex));
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 3:
                    System.out.println("Available Playlists:");
                    for (int i = 0; i < user.getPlaylists().size(); i++) {
                        System.out.println((i + 1) + ". " + user.getPlaylists().get(i).getName());
                    }
                    System.out.print("Enter playlist number to add song to: ");
                    int addIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    if (addIndex >= 0 && addIndex < user.getPlaylists().size()) {
                        System.out.print("Enter song title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter song artist: ");
                        String artist = scanner.nextLine();
                        System.out.print("Enter song duration (in minutes): ");
                        double duration = scanner.nextDouble();
                        Song song = new Song(title, artist, duration);
                        user.addSongToPlaylist(user.getPlaylists().get(addIndex), song);
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 4:
                    System.out.println("Available Playlists:");
                    for (int i = 0; i < user.getPlaylists().size(); i++) {
                        System.out.println((i + 1) + ". " + user.getPlaylists().get(i).getName());
                    }
                    System.out.print("Enter playlist number to remove song from: ");
                    int removeIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    if (removeIndex >= 0 && removeIndex < user.getPlaylists().size()) {
                        Playlist playlist = user.getPlaylists().get(removeIndex);
                        System.out.println("Songs in Playlist:");
                        for (int i = 0; i < playlist.getSongs().size(); i++) {
                            System.out.println((i + 1) + ". " + playlist.getSongs().get(i).getTitle());
                        }
                        System.out.print("Enter song number to remove: ");
                        int songIndex = scanner.nextInt() - 1;
                        if (songIndex >= 0 && songIndex < playlist.getSongs().size()) {
                            user.removeSongFromPlaylist(playlist, playlist.getSongs().get(songIndex));
                        } else {
                            System.out.println("Invalid choice!");
                        }
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 5:
                    System.out.println("Available Playlists:");
                    for (int i = 0; i < user.getPlaylists().size(); i++) {
                        System.out.println((i + 1) + ". " + user.getPlaylists().get(i).getName());
                    }
                    System.out.print("Enter playlist number to play: ");
                    int playIndex = scanner.nextInt() - 1;
                    if (playIndex >= 0 && playIndex < user.getPlaylists().size()) {
                        user.getPlaylists().get(playIndex).playAllSongs();
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 6:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}