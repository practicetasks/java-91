package t5_methods.hometasks.task_3_solution;

public class Task {
    public static void main(String[] args) {
        displayMonth(12);
        displayMonth(11);
        displayMonth(13);
    }

    static void displayMonth(int month) {
        if (month > 12 || month < 1) {
            System.out.println("Некорректный номер месяца");
        } else {
            String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
            switch (month) {
                case 2 -> System.out.println("В месяце " + months[month - 1] + " 28 либо 29 дней");
                case 4, 6, 9, 11 -> System.out.println("В месяце " + months[month - 1] + " 30 дней");
                default -> System.out.println("В месяце " + months[month - 1] + " 31 день");
            }
        }
    }
}
