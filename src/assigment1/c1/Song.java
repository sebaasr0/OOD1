package assigment1.c1;

// Song class to represent a song with title, artist, duration, and mood
public class Song {
    private String title;
    private String artist;
    private double duration;
    private String mood;

    // Constructor
    public Song(String title, String artist, double duration, String mood) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.mood = mood;
    }

    // Getters
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public double getDuration() { return duration; }
    public String getMood() { return mood; }

    // toString method for easy display
    @Override
    public String toString() {
        return title + " by " + artist + " (" + duration + " mins) [" + mood + "]";
    }
}

