package lesson6;

public class Cat extends Animal{
    private String name;
    private final int canRun = 200;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    void run(int needRun) {
        if (needRun > canRun) {
            System.out.println(name + " не может бежать так далеко! (предел = 200 метров)");
        } else if (needRun <= canRun && needRun >= 0) {
            System.out.println(name + " пробежал " + needRun + " метров!");
        } else {
            System.out.println("Введите корректное число!");
        }
    }

    @Override
    void swim(int needSwim) {
        System.out.println("Кошки не умеют плавать!");
    }
}
