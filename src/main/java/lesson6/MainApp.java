package lesson6;

public class MainApp {
    public static void main(String[] args) {
        // создаем кота #1
        Cat catBarsik = new Cat("Barsik");
        catBarsik.run(150);
        catBarsik.run(250);
        catBarsik.run(-150);
        catBarsik.swim(100);
        Animal.animalCount();
        System.out.println();

        // создаем кота #2
        Cat catKukuruzka = new Cat("Kukuruzka");
        catKukuruzka.run(190);
        catKukuruzka.run(200);
        catKukuruzka.run(-150);
        catKukuruzka.swim(100);
        Animal.animalCount();
        System.out.println();

        // создаем собакена #1
        Dog dogKasatka = new Dog("Kasatka");
        dogKasatka.run(480);
        dogKasatka.run(740);
        dogKasatka.run(-10);
        dogKasatka.swim(15);
        dogKasatka.swim(8);
        dogKasatka.swim(-1);
        Animal.animalCount();
        System.out.println();

        // создаем собакена #2
        Dog dogChernysh = new Dog("Chernysh");
        dogChernysh.run(329);
        dogChernysh.run(501);
        dogChernysh.swim(15);
        dogChernysh.swim(10);
        Animal.animalCount();
        System.out.println();

    }
}
