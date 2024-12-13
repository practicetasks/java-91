package t11_enums.example_1;

// Пример БЕЗ enum
public class Main {
    public static void main(String[] args) {
//        Event event = new Event("Coachella 2024", Season.WINTER);
        Season season = Season.FALL;
        System.out.println(season);

    }
}


abstract class Amphibian {
    protected String color;

    public Amphibian(String color) {
        this.color = color;
    }

    public abstract void move();

    public String getColor() {
        return color;
    }

    public void eat() {
        System.out.println("Кушаю насекомых");
    }
}
class Frog extends Amphibian {
    public Frog() {
        super("Зеленый");
    }
    @Override
    public void move() {
        System.out.println("Я передвигаюсь по суше прыжками.");
    }
}
class Toad extends Amphibian {
    public Toad() {
        super("Коричневый");
    }

    @Override
    public void move() {
        System.out.println("Я важно хожу.");
    }
}