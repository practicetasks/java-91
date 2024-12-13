package t3_loops.task_3;

import java.util.Scanner;

public class TEst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = scanner.next();
        while (!password.equals("admin")) {
            System.out.println("Неверный пароль, попробуйте еще раз!");
            password = scanner.next();
        }
        System.out.println("Доступ разрешен");
    }
}
