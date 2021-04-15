package lesson7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety = false;  // поле сытости

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        System.out.println(name + " try to eat!");
        if (plate.decreaseFood(appetite)) {
            System.out.println("Котик покушал!");
            satiety = true;
        } else {
            System.out.println("Котик не покушал!");
        }
    }

    public void satietyInfo() {
        if (!satiety) {
            System.out.println("Котик " + name + " голоден!");
        } else {
            System.out.println("Котик " + name + " сыт и счастлив!");
        }
    }
}
