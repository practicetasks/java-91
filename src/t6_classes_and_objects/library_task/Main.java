package t6_classes_and_objects.library_task;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book();
        book.name = "some Book";
        library.book = book;

        Student student = new Student();
        student.name = "Student1";

        library.lendBook(student, 120);
        System.out.println(student.book);
        library.acceptBook(student);
        System.out.println(student.book);
        System.out.println(book.status);
    }
}
