package t9_encapsulation.example_1;

public class Test {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(-500);
        account.setUser("Bob");

        System.out.println(account.getAmount());
        System.out.println(account.getUser());
    }
}
