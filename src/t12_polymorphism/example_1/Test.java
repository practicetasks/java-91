package t12_polymorphism.example_1;

public class Test {
    public static void main(String[] args) {
        // Приведение примитивного типа
        long a = 123123123123122331L;
        int b = (int) a;

        // Приведение ссылочного типа
        Cat cat = new Lion();
        cat.run();
        if (cat instanceof Lion) {
            Lion lion = (Lion) cat;
            lion.roar();
        }



    }
}

// instanceOf
class Doctor {
    void heal(Cat cat) {
        System.out.println(cat.getType() + " здоров");
    }
}

abstract class Cat {
    private final String type;
    private final int speed;

    Cat(String type, int speed) {
        this.type = type;
        this.speed = speed;
    }

    public void run() {
        System.out.println(type + " бежит со скоростью " + speed + " км/ч");
    }

    public String getType() {
        return type;
    }
}

class Lion extends Cat {
    public Lion() {
        super("Лев", 60);
    }

    void roar() {
        System.out.println("Лев кричит");
    }
}

class Tiger extends Cat {
    public Tiger() {
        super("Тигр", 80);
    }
}

class Cheetah extends Cat {
    public Cheetah() {
        super("Гепард", 100);
    }
}

class Panther extends Cat {
    public Panther() {
        super("Пантера", 90);
    }
}


