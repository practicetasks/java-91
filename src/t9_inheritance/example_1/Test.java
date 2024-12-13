package t9_inheritance.example_1;

public class Test {
    public static void main(String[] args) {
        Cappuccino cappuccino = new Cappuccino(50, 80);
        System.out.println(cappuccino.espresso);

//        Cappuccino cappuccino1 = new Cappuccino();
//        System.out.println(cappuccino1.espresso);

    }
}

class Coffee {
    protected double espresso;
    protected double milk;

    public Coffee(double espresso, double milk) {
        this.espresso = espresso;
        this.milk = milk;
    }

    public double mixAndGetVolume() {
        return espresso + milk;
    }
}

class Cappuccino extends Coffee {
    public Cappuccino(double espresso, double milk) {
        super(espresso, milk);
    }
}

