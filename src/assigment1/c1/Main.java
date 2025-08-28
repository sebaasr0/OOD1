package assigment1.c1;

import java.util.*;

// Main class to demonstrate functionality
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample songs
        System.out.println("Welcome to SpotifyMODIFIED 🎵");
        System.out.println("Options: \n1. View all songs \n2. View by genre \n3. View by mood");
        int choice = sc.nextInt();
        sc.nextLine();

        // User interaction¿
        switch (choice) {
            case 1:
                System.out.println("All songs:");
                for (Song s : MusicLibrary.getAllSongs()) {
                    System.out.println(s);
                }
                break;
            case 2:
                System.out.print("Enter genre (pop/rock/trap): ");
                String genre = sc.nextLine();
                for (Song s : MusicLibrary.getSongsByGenre(genre)) {
                    System.out.println(s);
                }
                break;
            case 3:
                System.out.print("Enter mood (happy/sad): ");
                String mood = sc.nextLine();
                for (Song s : MusicLibrary.getSongsByMood(mood)) {
                    System.out.println(s);
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
