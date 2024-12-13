package t4_arrays.task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double[] expenses = {1500.50, 2500.50, 500.00, 0.0, 4750.60, 2500.20, 1200.00};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Расходы за неделю хранятся под индексами от 1 (пн) до 7 (вс).");
        System.out.println("Введите индекс дня, траты за который вы хотите отредактировать:");

        int index = scanner.nextInt();
        if (index >= 1 && index <= expenses.length) {
            System.out.println("Введите новую сумму трат за этот день:");
            double sum = scanner.nextDouble();

            expenses[index - 1] = sum;
            System.out.println(Arrays.toString(expenses));
        } else {
            System.out.println("Некорректный индекс");
        }
    }
}
