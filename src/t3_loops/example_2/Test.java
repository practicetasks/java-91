package t3_loops.example_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во: ");
        int num = scanner.nextInt();
        String result = "";
        for (int i = 1; i <= num; i++) {
            System.out.print("Введите число ");
            int input = scanner.nextInt();
            result += input + " ";
        }
        System.out.println(result);
    }
}
