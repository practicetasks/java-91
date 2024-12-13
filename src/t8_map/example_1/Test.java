package t8_map.example_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        ArrayList<String> cities = new ArrayList<>();
//        cities.add("Астана");
//        cities.add("Анкара");
//        cities.add("Вена");
//        cities.add("Амстердам");

//        cities.remove();
//        cities.clear();

//        for (int i = 0; i < cities.size(); i++) {
//            if (cities.get(i).equals("Анкара")) {
//                cities.set(i, "Стамбул");
//            }
//        }
//
//        System.out.println(cities);

        // HashMap
//        HashMap<String, String> countries = new HashMap<>();
//        countries.put("Австрия", "Вена");
//        countries.put("Турция", "Анкара");
//        countries.put("Казахстан", "Астана");
//        countries.put("Нидерланды", "Амстердам");
//
//        System.out.print("Введите название страны: ");
//        String userInput = new Scanner(System.in).nextLine();
//        if (countries.containsKey(userInput)) {
//            System.out.println("Столица страны " + userInput + ": " + countries.get(userInput));
//        } else {
//            System.out.println("Страна не найдена");
//        }
//
//
//        HashMap<String, Double> currencyRates = new HashMap<>();
//        currencyRates.put("USD", 488.08);
//        currencyRates.put("RUB", 5.02);
//        currencyRates.put("EUR", 531.16);

//        Scanner scanner = new Scanner(System.in);
//
//        int num = Integer.parseInt(scanner.nextLine());
//        String input = scanner.nextLine();
//        System.out.println("Вы ввели: " + input);
//        System.out.println("Вы ввели: " + num);

        // Введите сумму в тг: ___
        // USD
        // RUB
        // EUR
        // Выберите валюту: ___
        //
        // ... тг в ... составляет: ....


//        for (String value : countries.values()) {
//            System.out.println(value);
//        }
//
//        for (String key : countries.keySet()) {
//            System.out.println(key);
//        }
//
//        for (String key : countries.keySet()) {
//            System.out.println(key + " " + countries.get(key));
//        }
//
//        for (Map.Entry<String, String> entry : countries.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

//        HashMap<String, Double> orders = new HashMap<>();
//        orders.put("Иван И.", 4345.5);
//        orders.put("Ольга С.", 76564.43);
//        orders.put("Александр Т.", 1234.86);
//        orders.put("Александр Р.", 23432.87);
//        orders.put("Екатерина О.", 1034753.6);
//        orders.put("Ярослав В.", 450.0);
//        orders.put("А", null);
//
//        for (double value : orders.values()) {
//            System.out.println(value);
//        }

        HashMap<String, Double> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> minNames = new ArrayList<>();
        Double minScore = null;

        ArrayList<String> maxNames = new ArrayList<>();
        Double maxScore = null;

        double sum = 0;
        while (true) {
            System.out.println("Введите имя студента (или exit для завершения): ");
            String userName = scanner.nextLine();

            if (userName.equals("exit")) {
                break;
            }

            System.out.println("Введите оценку: ");
            double score = Double.parseDouble(scanner.nextLine());

            sum += score;
            if (minScore == null || score < minScore) {
                minNames.add(userName);
                minScore = score;
            }

            if (maxScore == null || score > maxScore) {
                maxNames.add(userName);
                maxScore = score;
            }

            students.put(userName, score);
        }

        for (String name : students.keySet()) {
            Double score = students.get(name);
            System.out.println(name + ": " + score);
        }

        System.out.println("Средний балл: " + sum / students.size());
        System.out.println("Наивысший балл: " + maxScore + " " + maxNames);
        System.out.println("Наименьший балл: " + minScore + " " + minNames);
    }
}
