package t11_non_access_modifiers.example_2;

public class Test {
    public static void main(String[] args) {
//        final String figureOfEarth = "spherical"; // инициализация final-переменной
//        figureOfEarth = "flat"; // попытка изменить значение final-переменной


//        final ArrayList<Integer> list = new ArrayList<>();
//        list.add(123);
//        list.add(23);
//        System.out.println(list);

        final int yearOfBirth = 1995; // объявление final-переменной
        System.out.println("Я родился в " + yearOfBirth + " году.");

    }
}
