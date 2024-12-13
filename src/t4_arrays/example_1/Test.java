package t4_arrays.example_1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        String[] currencies = {"USD", "EUR", "JPY", "KZT"}; // Массив валют

        Scanner scanner = new Scanner(System.in);

        String userCurrency = scanner.next();
        currencies[2] = userCurrency;

        System.out.println(currencies[2]);
        System.out.println(Arrays.toString(currencies));



    }
}
