package t11_non_access_modifiers.example_4;

import java.util.ArrayList;
import java.util.List;

public class Test {

    static List<String> commands = new ArrayList<>();

    static {
        for (int i = 0; i < 100; i++) {
            commands.add(i + ". command " + i);
        }
    }

    // enum

    public static void main(String[] args) {
        for (String command : commands) {
            System.out.println(command);
        }
    }
}
