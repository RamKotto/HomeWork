package lesson5;

public class VeryMain {



    public static void main(String[] args) {
        forPrintInfo();
        forPersArray();
    }


    // создаем тестовый экземпляр класса, чтобы протестировать работоспособность printInfo()
    public static void forPrintInfo() {
        Employee emp1 = new Employee("Dmitriy Vladimirovich Saraev",
                "developer",
                "hacker-neo@fun.com",
                "89045142245",
                100000,
                30);

        emp1.printInfo();
    }


    // метод для тестирования массива пользователей, и его фильтров.
    public static void forPersArray() {
        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Ivanov Ivan", "janitor", "mega-janitor@gmail.com",
                "8-911-666-11-11", 40_000, 63);
        persArray[1] = new Employee("Petrov Piter", "pathologist", "mega-corpse@gmail.com",
                "8-904-777-77-77", 50_000, 26);
        persArray[2] = new Employee("Igor Grivcev", "fireman", "bright-burn@gmail.com",
                "8-812-555-55-55", 30_000, 32);
        persArray[3] = new Employee("Alexander Golovin", "pilot", "avia-cool@gmail.com",
                "8-921-321-21-21", 300_000, 41);
        persArray[4] = new Employee("Melnikov Pavel", "builder", "another-bric@wall.com",
                "8-911-007-00-00", 60_000, 30);

        // нам необходимо с помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].printInfo();
            }
        }
    }
}
