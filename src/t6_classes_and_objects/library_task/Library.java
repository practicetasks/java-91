package t6_classes_and_objects.library_task;

public class Library {
    Book book;

    int maxRentDays = 5;
    int penalty = 5_000;

    void lendBook(Student student, int days) {
        if (student.book != null) {
            System.out.println("У студента " + student.name + " уже есть книга");
            return;
        }

        if (book == null) {
            System.out.println("В библиотеке нет книги");
            return;
        }

        student.book = book;
        student.rentedDays = days;
        book = null;
        System.out.println("Студенту '" + student.name + "' передали книгу с названием '" + student.book.name + "'");
    }

    void acceptBook(Student student) {
        if (student.book == null) {
            System.out.println("У студента " + student.name + " нет книги");
            return;
        }

        if (book != null) {
            System.out.println("В библиотеке уже есть книга");
            return;
        }

        book = student.book;
        book.rentedDays += student.rentedDays;
        book.updateStatus();
        student.book = null;
        System.out.println("Студент '" + student.name + "' вернул книгу с названием '" + book.name + "'");

        if (student.rentedDays > maxRentDays) {
            int num = student.rentedDays - maxRentDays;
            int payment = penalty * num;
            System.out.println("У вас просрочка на дней: " + num);
            System.out.println("Необходимо оплатить " + payment);
        }
        student.rentedDays = 0;
    }
}
