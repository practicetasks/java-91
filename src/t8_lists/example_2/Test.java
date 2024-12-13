package t8_lists.example_2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("St. Chroma", "Tyler, the Creator"));
        songs.add(new Song("Igor Theme", "Tyler, the Creator"));
        songs.add(new Song("Gone Gone/Thank you", "Tyler, the Creator"));
        showSongs(songs);

        // Создайте класс Performer(name, debutYear).
        // Создайте список исполнителей и заполните.
        // Распечатайте каждого исполнителя.

        // TODO 2: Добавьте внутрь исполнителя список песен
    }

    static void showSongs(ArrayList<Song> songs) {
        for (Song song : songs) {
            System.out.println(song.performer + " " + song.name + "\n");
        }
    }
}
