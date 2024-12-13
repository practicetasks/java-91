package t8_lists.hometask;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            String command = scanner.nextLine();

            switch (command) {
                case "0" -> {
                    System.out.println("Выход из программы...");
                    return;
                }
                case "1" -> addTask();
                case "2" -> showTasks();
                case "3" -> deleteTask();
                default -> System.out.println("Некорректная команда, попробуйте снова.");
            }
            System.out.println();
        }
    }

    public static void showMenu() {
        System.out.println("1. Добавить задачу");
        System.out.println("2. Вывести список задач");
        System.out.println("3. Удалить задачу");
        System.out.println("0. Выйти");
        System.out.print("Выберите команду: ");
    }

    public static void addTask() {
        System.out.print("Введите задачу для планирования: ");
        tasks.add(scanner.nextLine());
        System.out.println("Задача была добавлена.");
    }

    public static void showTasks() {
        if (!tasks.isEmpty()) {
            System.out.println("Список запланированных дел:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        } else {
            System.out.println("Нет запланированных дел.");
        }
    }

    public static void deleteTask() {
        if (!tasks.isEmpty()) {
            showTasks();
            System.out.print("Введите номер задачи для удаления: ");
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 1 && index <= tasks.size()) {
                String deletedTask = tasks.remove(index - 1);
                System.out.println("Удалена задача \"" + deletedTask + "\"");
            } else {
                System.out.println("Некорректный номер.");
            }
        } else {
            System.out.println("Нет запланированных дел.");
        }
    }
}
