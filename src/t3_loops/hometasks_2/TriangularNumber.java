package t3_loops.hometasks_2;

import java.util.Scanner;

public class TriangularNumber {
    public static void main(String[] args) {
        // 5
        // 1 + 2 + 3 + 4 + 5 = ?

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= num; i++) {
            total += i;
            System.out.print(i);
            if (i < num) {
                System.out.print( " + ");
            }
        }

        System.out.println(System.lineSeparator() + total);

        // int, String, double
    }
}

