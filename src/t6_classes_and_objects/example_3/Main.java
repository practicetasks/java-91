package t6_classes_and_objects.example_3;

public class Main {
    public static void main(String[] args) {
        Performer david = new Performer();
        david.name = "David Bowie";
        david.bornYear = 1965;
        david.albumsCount = 9;

        Song song = new Song();
        song.name = "Starman";
        song.genre = "Pop Rock";
        song.performer = david;

        Song secondSong = new Song();
        secondSong.name = "Blackstar";
        secondSong.genre = "Rock";

        song.display();
        secondSong.display();


    }
}
