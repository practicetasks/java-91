package t8_lists.example_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        ArrayList<Double> expenses = new ArrayList<>();  // создали список
//        expenses.add(120.47);    // добавили элемент
//        expenses.add(290.24);    // добавили элемент
//        expenses.add(420.78);    // добавили элемент
//
//        expenses.remove(0);
//        expenses.remove(290.24);

//        ArrayList<Integer> nums = new ArrayList<>();
//
//        nums.add(700);
//        nums.add(999);
//        nums.add(333);

//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Java");
//        list.add("Php");
//        list.add("Haskell");
//        list.add("Swift");
//
//        String target = scanner.nextLine();
//
//        if (list.contains(target)) {
//            System.out.println("Элемент найден");
//        } else {
//            System.out.println("Элемент не найден");
//        }

//        String result = "Элемент не найден";
//        for (String language : list) {
//            if (language.equals(target)) {
//                result = "Элемент найден";
//                break;
//            }
//        }
//
//        System.out.println(result);


        ArrayList<String> firstUser = new ArrayList<>();
        firstUser.add("Pop");
        firstUser.add("Hip Hop");
        firstUser.add("Rap");
        firstUser.add("R&b");

        ArrayList<String> secondUser = new ArrayList<>();
        secondUser.add("Rock");
        secondUser.add("Indie");
        secondUser.add("Pop");
        secondUser.add("Jazz");
        secondUser.add("R&b");


//        for (String genre : firstUser) {
//            if (secondUser.contains(genre)) {
//                System.out.println(genre);
//            }
//        }

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(-7);
        nums.add(7);
        nums.add(2);
        nums.add(-12);
        nums.add(-15);

        int result = getPositiveCount(nums);
        System.out.println(result);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        // TODO: создать метод, который принимает список целых чисел и возвращает сумму getSum(...)
    }

    static int getPositiveCount(ArrayList<Integer> nums) {
        int count = 0;
        for (Integer num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }
}
