package t3_loops.hometasks_2;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("start: ");
        int start = scanner.nextInt();

        System.out.print("end: ");
        int end = scanner.nextInt();

        IntPredicate isPrime = num -> {
            if (num < 2) return false;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        } ;

        IntStream.range(start, end).filter(isPrime).forEach(num -> System.out.print(num + " "));
    }
}
