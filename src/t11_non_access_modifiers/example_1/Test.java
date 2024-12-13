package t11_non_access_modifiers.example_1;

import java.util.Scanner;

import static java.lang.Integer.*;

public class Test {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            switch (menu()) {
                case 1 -> firstCommand();
                case 0 -> {
                    return;
                }
            }
        }
    }

    static int menu() {
        System.out.println("1. Команда 1");
        System.out.println("2. Команда 2");
        System.out.println("3. Команда 3");
        return parseInt(scanner.nextLine());
    }

    static void firstCommand() {
        System.out.println("Запрос значения в первой команде");
        String string = scanner.nextLine();
    }
}


