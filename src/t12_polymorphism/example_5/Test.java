package t12_polymorphism.example_5;

public class Test {
    public static void main(String[] args) {
        A a = new C();
        a.display(); // ?
    }
}

class A {
    void display() {
        System.out.println(getName());
    }

    String getName() {
        return "A";
    }
}

class B extends A {
    @Override
    String getName() {
        return "B";
    }
}

class C extends B {
    @Override
    String getName() {
        return super.getName() + "C";
    }
}
