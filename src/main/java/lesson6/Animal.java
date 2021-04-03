package lesson6;

public abstract class Animal {
    private static int count = 0;  // Счетчик животных

    public Animal() {
        count++;
    }

    abstract void run(int needRun);
    abstract void swim(int needSwim);

    public static void animalCount() {
        System.out.println("Количество животных: " + count + "!");
    }
}
