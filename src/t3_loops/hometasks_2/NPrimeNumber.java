package t3_loops.hometasks_2;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class NPrimeNumber {
    public static void main(String[] args) {
        IntPredicate isPrime = num -> {
            if (num < 2) return false;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int count = 0; // Счётчик простых чисел
        int number = 2; // Начинаем проверку с 2
        int nthPrime = 0;

        while (count < n) {
            if (isPrime.test(number)) {
                count++; // Увеличиваем счётчик, если число простое
                nthPrime = number; // Обновляем текущее n-ое простое число
            }
            number++; // Переходим к следующему числу
        }

        System.out.println(n + "-ое простое число: " + nthPrime);

    }
}
