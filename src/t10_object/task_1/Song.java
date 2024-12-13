package t10_object.task_1;

import java.util.Objects;

public class Song {
    public String title;
    public String artist;
    public String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    // переопределите метод equals(Object)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(this.title, song.title)
                && Objects.equals(this.artist, song.artist)
                && Objects.equals(this.songwriter, song.songwriter);
    }

}
