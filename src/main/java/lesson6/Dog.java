package lesson6;

public class Dog extends Animal{
    private String name;
    private final int canRun = 500;
    private final int canSwim = 10;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    void run(int needRun) {
        if (needRun > canRun) {
            System.out.println(name + " не может бежать так далеко! (предел = 500 метров)");
        } else if (needRun <= canRun && needRun >= 0) {
            System.out.println(name + " пробежал " + needRun + " метров!");
        } else {
            System.out.println("Введите корректное число!");
        }
    }

    @Override
    void swim(int needSwim) {
        if (needSwim > canSwim) {
            System.out.println(name + " не может плыть так далеко! (предел = 10 метров)");
        } else if (needSwim <= canSwim && needSwim >= 0) {
            System.out.println(name + " проплыл " + needSwim + " метров!");
        } else {
            System.out.println("Введите корректное число!");
        }
    }
}
