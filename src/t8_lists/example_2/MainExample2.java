package t8_lists.example_2;

import java.util.ArrayList;

public class MainExample2 {
    public static void main(String[] args) {
        ArrayList<Performer> performerList = new ArrayList<>() {{
            add(new Performer("Kanye", 2000) {{

                addSong(new Song("Runaway"));
                addSong(new Song("song2"));
                addSong(new Song("song3"));
            }});

            add(new Performer("Kendrick", 2010) {{
                addSong(new Song("song1"));
                addSong(new Song("song2"));
            }});
        }};

        for (Performer performer : performerList) {
            System.out.println(performer.name + " (" + performer.debutYear + ")");
            for (Song song : performer.songs) {
                System.out.println("- " + song.name);
            }
        }
    }
}
