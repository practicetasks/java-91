package t6_classes_and_objects.library_task;

public class Book {
    String name;

    int rentedDays;
    String status = "NEW";

    void updateStatus() {
        if (rentedDays >= 100 && rentedDays <= 200) {
            status = "USED";
        } else if (rentedDays > 200) {
            status = "OLD";
        }
    }
}
