package t5_methods.task_3;

public class Test {
public static void main(String[] args) {
    showDate(2024, 12, 15);
    showDate(2024, 1, 15);
    showDate(2024, 12, 1);
    showDate(2024, 1, 1);
}

public static void showDate(int year, int month, int day) {
    System.out.println("Дата: " + year + "."
            + (month < 10 ? "0" : "") + month + "."
            + (day < 10 ? "0" : "") + day);
}
}
