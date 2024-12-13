package t8_map.example_3;

public class User {
    int id;
    String name;
    String email;

    User(int i, String n, String e) {
        id = i;
        name = n;
        email = e;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("name: " + name);
        System.out.println("email: " + email);
    }
}
