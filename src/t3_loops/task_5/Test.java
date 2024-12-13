package t3_loops.task_5;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(1, 101);

        System.out.print("Угадайте число от 1 до 100: ");
        while (true) {
            int num = scanner.nextInt();
            if (num == randomNum) {
                System.out.println("Вы угадали число");
                break;
            } else if (num > randomNum) {
                System.out.print("Ваше число БОЛЬШЕ: ");
            } else {
                System.out.print("Ваше число МЕНЬШЕ: ");
            }
        }
    }
}
