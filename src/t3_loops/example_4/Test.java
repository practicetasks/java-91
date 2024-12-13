package t3_loops.example_4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String password = scanner.next();
//        while (!password.equals("admin")) {
//            System.out.println("Неправильный пароль, попробуйте еще раз");
//            password = scanner.next();
//        }
//        System.out.println("Доступ разрешен");
//
//        while (true) {
//            String password = scanner.next();
//            if (password.equals("admin")) {
//                System.out.println("Доступ разрешен");
//                break;
//            }
//            System.out.println("Неправильный пароль, попробуйте еще раз");
//        }

        Scanner scanner = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("""
                    1. Американо
                    2. Капучино
                    3. Латте
                    0. Выйти""");
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> System.out.println("Вы выбрали Американо");
                case 2 -> System.out.println("Вы выбрали Капучино");
                case 3 -> System.out.println("Вы выбрали Латте");
                case 0 -> {
                    break loop;
                }
                default -> System.out.println("Некорректный номер");
            }
        }
    }
}
