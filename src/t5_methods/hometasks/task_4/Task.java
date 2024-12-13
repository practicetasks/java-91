package t5_methods.hometasks.task_4;

public class Task {
    public static void main(String[] args) {
        findMax(5, 2, 9);
        findMax(8, 5, 6);
    }

    static void findMax(int a, int b, int c) {
        int max = Integer.max(a, Integer.max(b, c));
        System.out.println(max);
    }
}
