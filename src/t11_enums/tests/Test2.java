package t11_enums.tests;

enum Planet {
    EARTH(5.97),
    MARS(0.642);

    private double mass;

    private Planet(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Planet.EARTH.getMass());
    }
}
