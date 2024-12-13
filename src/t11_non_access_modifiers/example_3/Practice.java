package t11_non_access_modifiers.example_3;

public class Practice {
    public static final int MIN_PASSWORD_LENGTH = 8;
    public static final int PHONE_LENGTH = 11;

    public static void validateCredentials(String phone, String password) {
        if (phone.length() != PHONE_LENGTH) {
            System.out.println("Введите номер в формате 7" + "x".repeat(PHONE_LENGTH - 1) + ", где x - любая цифра.");
        }
        if (password.length() < MIN_PASSWORD_LENGTH) {
            System.out.println("Минимальная длина пароля: " + MIN_PASSWORD_LENGTH + "знаков.");
        }
    }
}
