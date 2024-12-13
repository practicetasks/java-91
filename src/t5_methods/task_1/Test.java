package t5_methods.task_1;

public class Test {
    public static void main(String[] args) {
        formatFriendsCount(0);   // У тебя нет друзей
        formatFriendsCount(1);   // У тебя 1 друг
        formatFriendsCount(3);   // У тебя 3 друга
        formatFriendsCount(4);   // У тебя 4 друга
        formatFriendsCount(5);   // У тебя 5 друзей
        formatFriendsCount(6);   // У тебя 6 друзей
        formatFriendsCount(20);  // Ого! сколько у тебя друзей, целых 20
    }

    static void formatFriendsCount(int n) {
        if (n == 0) {
            System.out.println("У тебя нет друзей");
        } else if (n == 1) {
            System.out.println("У тебя 1 друг");
        } else if (n >= 2 && n <= 4) {
            System.out.println("У тебя " + n + " друга");
        } else if (n < 20) {
            System.out.println("У тебя " + n + " друзей");
        } else {
            System.out.println("Ого! сколько у тебя друзей, целых " + n);
        }
    }
}
