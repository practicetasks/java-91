package t5_methods.hometasks.task_2_solution;

public class Task {
    public static void main(String[] args) {
        showDate(2024, 12, 15);
        showDate(2024, 2, 15);
        showDate(2024, 12, 1);
        showDate(2024, 2, 1);
    }

    static void showDate(int year, int month, int day) {
        String monthStr = (month < 10) ? ("0" + month) : (month + "");
        String dayStr = (day < 10) ? ("0" + day) : (day + "");

        System.out.println("Дата: " + year + "." + monthStr + "." + dayStr);
    }
}

