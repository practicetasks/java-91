package t5_methods.hometasks.task_1;

import java.util.stream.IntStream;

public class Task {
    public static void main(String[] args) {
        isPrime(13);
        isPrime(12);
    }

    static void isPrime(int number) {
        boolean present = IntStream.range(2, number / 2 + 1)
                .filter(i -> number % i == 0)
                .findFirst()
                .isPresent();

        System.out.println(number + " - " + (present ? "не " : "") + "является простым числом");
    }
}
