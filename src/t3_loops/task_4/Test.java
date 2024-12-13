package t3_loops.task_4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Американо");
            System.out.println("2. Капучино");
            System.out.println("3. Латте");
            System.out.println("0. Выйти");
            String drinks = scanner.next();
            switch (drinks) {
                case "0" -> {
                    return;
                }
                case "1" -> System.out.println("Вы выбрали Американо");
                case "2" -> System.out.println("Вы выбрали Капучино");
                case "3" -> System.out.println("Вы выбрали Латте");
                default -> System.out.println("Некорректный номер");
            }
        }
    }
}
