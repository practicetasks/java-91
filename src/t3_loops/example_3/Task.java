package t3_loops.example_3;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(num - i + " " + i);
        }

    }
}
