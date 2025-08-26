package assigment1.c1;

public class Song {
    private String title;
    private String artist;
    private double duration;
    private String mood;

    public Song(String title, String artist, double duration, String mood) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.mood = mood;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public double getDuration() { return duration; }
    public String getMood() { return mood; }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + duration + " mins) [" + mood + "]";
    }
}

