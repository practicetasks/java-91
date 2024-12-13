package t8_lists.example_2;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        ArrayList<Performer> performerList = new ArrayList<>();

        Performer performer = new Performer("Cocteau Twins", 1982);
        performer.addSong(new Song("Heaven or Las Vegas", performer.name));
        performer.addSong(new Song("Cherry Coloured Funk", performer.name));
        performerList.add(performer);

        performer = new Performer("Daft Punk", 1997);
        performer.addSong(new Song("Voyager", performer.name));
        performer.addSong(new Song("Aerodynamic", performer.name));
        performerList.add(performer);

        for (Performer p : performerList) {
            System.out.println(p.name + " ("  + p.debutYear + ")");
            for (Song song : p.songs) {
                System.out.println("- " + song.name);
            }
            System.out.println();
        }
    }
}
