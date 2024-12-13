package t5_methods.hometasks.task_3;

public class Task {
    public static void main(String[] args) {
        displayDaysInMonth(1);
        displayDaysInMonth(2);
        displayDaysInMonth(4);
        displayDaysInMonth(14);
    }

    static void displayDaysInMonth(int month) {
        if (month > 12 || month < 1) {
            System.out.println("Некорректный номер месяца");
            return;
        }
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        String name = months[month - 1];
        switch (month) {
            case 2 -> System.out.println("В месяце " + name + " 28 либо 29 дней");
            case 4, 6, 9, 11 -> System.out.println("В месяце " + name + " 30 дней");
            default -> System.out.println("В месяце " + name + " 31 день");
        }
    }
}
