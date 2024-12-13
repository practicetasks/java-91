package t8_lists.example_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Performer> performerList = new ArrayList<>();

        Performer kanye = new Performer("Kanye", 2000);
        kanye.addSong(new Song("Runaway"));
        kanye.addSong(new Song("song2"));
        kanye.addSong(new Song("song3"));
        performerList.add(kanye);

        Performer kendrick = new Performer("Kendrick", 2010);
        kendrick.addSong(new Song("song1"));
        kendrick.addSong(new Song("song2"));
        performerList.add(kendrick);

//        for (Performer performer : performerList) {
//            System.out.println(performer.name + " (" + performer.debutYear + ")");
//            for (Song song : performer.songs) {
//                System.out.println("- " + song.name);
//            }
//        }

        Performer performerWithMostSongsCount = getPerformerWithMostSongsCount(performerList);
        System.out.println(performerWithMostSongsCount.name);

        // Создать класс Product(name, price)
        // Создать класс Category(name, productList)
        // Создать класс Shop(name, categoryList)
    }

    // TODO: получить объект исполнителя, у которого больше всех песен
    static Performer getPerformerWithMostSongsCount(ArrayList<Performer> performerList) {
        Performer max = null;
        for (Performer performer : performerList) {
            if ((max == null) || performer.songs.size() > max.songs.size()) {
                max = performer;
            }
        }
        return max;
    }
}
