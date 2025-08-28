package assigment1.c1;

import java.util.*;

    //HashMap is a data structure that stores key-value pairs. Unique keys
public class MusicLibrary {
    private static Map<String, List<Song>> library = new HashMap<>();

    static {


        // this library is the pop songs data
        library.put("pop", Arrays.asList(
                new Song("Shape of You", "Ed Sheeran", 4.2, "happy"),
                new Song("Fireworks", "Katy Perry", 3.5, "happy"),
                new Song("You Belong with Me", "Taylor Swift", 4.8, "sad"),
                new Song("Levitating", "Dua Lipa", 3.4, "happy"),
                new Song("Drivers License", "Olivia Rodrigo", 4.1, "sad"),
                new Song("Live while we're young", "One Direction", 2.9, "happy"),
                new Song("Best Song Ever", "One Direction", 3.2, "happy"),
                new Song("Kiss you", "One Direction", 3.1, "happy"),
                new Song("Circles", "Post Malone", 3.8, "happy"),
                new Song("Don't Start Now", "Dua Lipa", 3.3, "happy")
        ));

        // this library is the rock songs data
        library.put("rock", Arrays.asList(
                new Song("Bohemian Rhapsody", "Queen", 5.9, "happy"),
                new Song("Smells Like Teen Spirit", "Nirvana", 5.0, "happy"),
                new Song("Hotel California", "Eagles", 6.3, "happy"),
                new Song("Enter Sandman", "Metallica", 5.2, "sad"),
                new Song("Highway to Hell", "AC/DC", 3.9, "happy"),
                new Song("Stairway to Heaven", "Led Zeppelin", 8.0, "happy"),
                new Song("Sweet Child O' Mine", "Guns N' Roses", 5.6, "happy"),
                new Song("Back In Black", "AC/DC", 4.1, "happy"),
                new Song("Livin' on a Prayer", "Bon Jovi", 4.9, "happy"),
                new Song("Wonderwall", "Oasis", 4.2, "sad")
        ));

        //this library is the Argentinian Trap songs data
        library.put("trap", Arrays.asList(
                new Song("She Don't Give a Fo", "Duki", 3.5, "happy"),
                new Song("Loca", "KHEA ft. Duki, Cazzu", 3.7, "happy"),
                new Song("Goteo", "Duki", 3.3, "happy"),
                new Song("BZRP Music Session #50", "Bizarrap & Duki", 4.0, "happy"),
                new Song("Unfollow", "YSY A, Duki, Neo Pistea", 4.5, "sad"),
                new Song("H.I.E.L.O.", "Duki", 3.8, "sad"),
                new Song("Mala Fama", "Duki", 3.6, "happy"),
                new Song("Tumbando el Club", "Duki, KHEA, C.R.O", 3.4, "happy"),
                new Song("Si Te Sentis Sola", "Duki", 4.2, "sad"),
                new Song("A Punta de Espada", "Duki", 3.9, "sad")
        ));
    }

    //All songs from the library by a given genre.
    //Uses HashMap's get() method to quickly find songs based on the genre key.
    public static List<Song> getSongsByGenre(String genre) {
        return library.getOrDefault(genre.toLowerCase(), new ArrayList<>());
    }

    //All songs from the library by a given mood
    //Loops through every value in the HashMap and collects songs matching the mood.
    public static List<Song> getSongsByMood(String mood) {
        List<Song> result = new ArrayList<>();
        for (List<Song> songs : library.values()) {
            for (Song s : songs) {
                if (s.getMood().equalsIgnoreCase(mood)) {
                    result.add(s);
                }
            }
        }
        return result;
    }

    //All songs in the library regardless of genre or mood.
    //Combines all lists from the HashMap into a single list.
    public static List<Song> getAllSongs() {
        List<Song> all = new ArrayList<>();
        for (List<Song> songs : library.values()) {
            all.addAll(songs);
        }
        return all;
    }
}
