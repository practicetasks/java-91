package t9_encapsulation.task_1;

public class Car {
    // Приватные поля
    private String make;
    private String model;
    private int year;
    private int speed;

    // Конструктор
    public Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
        this.speed = 0; // Начальная скорость равна 0
    }

    // Геттеры и сеттеры для make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make != null && !make.trim().isEmpty()) {
            this.make = make;
        } else {
            System.out.println("Марка не может быть пустой.\n");
        }
    }

    // Геттеры и сеттеры для model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.trim().isEmpty()) {
            this.model = model;
        } else {
            System.out.println("Модель не может быть пустой.\n");
        }
    }

    // Геттеры и сеттеры для year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1885 && year <= java.time.Year.now().getValue()) {
            this.year = year;
        } else {
            System.out.println("Некорректный год выпуска.\n");
        }
    }

    // Геттер для speed
    public int getSpeed() {
        return speed;
    }

    // Метод для ускорения
    public void accelerate(int increment) {
        if (increment > 0) {
            speed += increment;
            System.out.println("Автомобиль ускорился на " + increment + " км/ч.\n");
        } else {
            System.out.println("Значение ускорения должно быть положительным.\n");
        }
    }

    // Метод для торможения
    public void brake(int decrement) {
        if (decrement > 0) {
            speed -= decrement;
            if (speed < 0) {
                speed = 0;
            }
            System.out.println("Автомобиль замедлился на " + decrement + " км/ч.\n");
        } else {
            System.out.println("Значение замедления должно быть положительным.\n");
        }
    }

    // Метод для вывода информации об автомобиле
    public void printCarInfo() {
        System.out.println("Марка: " + make);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Текущая скорость: " + speed + " км/ч\n");
    }
}

