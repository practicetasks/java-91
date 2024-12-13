package t8_lists.rem;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();

        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');

        list.get(0);
        list.get(0);

        char symbol = list.remove(0);
        System.out.println(symbol); // c
    }
}
