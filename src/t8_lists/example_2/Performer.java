package t8_lists.example_2;

import java.util.ArrayList;

public class Performer {
    String name;
    int debutYear;
    ArrayList<Song> songs;

    Performer(String n, int d) {
        name = n;
        debutYear = d;
        songs = new ArrayList<>();
    }

    void addSong(Song song) {
        song.performer = name;
        songs.add(song);
    }
}
