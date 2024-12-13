package t6_classes_and_objects.example_3;

public class Song {
    String name;
    String genre;
    Performer performer;  // null

    void display() {
        System.out.println("Название песни: " + name);
        System.out.println("Жанр: " + genre);
        if (performer != null) {
            System.out.println("Исполнитель: " + performer.name);
        } else {
            System.out.println("Исполнитель: отсутствует");
        }
    }

    // Создайте класс Книга (название, автор)
    // Создайте класс Студент (имя, курс, книга)
    // Создайте объект книги и студента, и передайте студенту книгу
}
