package t8_map.example_3;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        ArrayList<User> users = new ArrayList<>();
//        users.add(new User(1, "bob", "bob@mail.com"));
//        users.add(new User(2, "tom", "tom@mail.com"));

        HashMap<Integer, User> userMap = new HashMap<>();
        userMap.put(1, new User(1, "bob", "bob@mail.com"));
        userMap.put(2, new User(2, "tom", "tom@mail.com"));

        User foundUser = findUserById(3, userMap);
        foundUser.display();


        // ООП
    }

    static User findUserById(int userId, HashMap<Integer, User> userMap) {
        return userMap.get(userId);
    }

    static User findUserById(int userId, ArrayList<User> users) {
        for (User user : users) {
            if (user.id == userId) {
                return user;
            }
        }
        return null;
    }
}
