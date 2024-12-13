package t8_lists.example_2;

import java.util.ArrayList;

public class TaskSol1 {
    public static void main(String[] args) {
        ArrayList<Performer> performerList = new ArrayList<>();

        performerList.add(new Performer("Cocteau Twins", 1982) {{
            addSong(new Song("Heaven or Las Vegas"));
            addSong(new Song("Cherry Coloured Funk"));
        }});

        performerList.add(new Performer("Daft Punk", 1997) {{
            addSong(new Song("Voyager"));
            addSong(new Song("Aerodynamic"));
        }});

        for (Performer performer : performerList) {
            System.out.println(performer.name + " (" + performer.debutYear + ")");
            for (Song song : performer.songs) {
                System.out.println("- " + song.name);
            }
            System.out.println();
        }
    }
}
