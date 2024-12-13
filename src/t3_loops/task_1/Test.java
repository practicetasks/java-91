package t3_loops.task_1;

public class Test {
    public static void main(String[] args) {
        System.out.println("Это первый этаж дома, который построил Джек.");
        for (int i = 2; i <= 10; i++) {
            System.out.println("А это " + i + " этаж, он на один выше, чем этаж " + (i-1));
        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            System.out.println(i);
//        }
    }
}
