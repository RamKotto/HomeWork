//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//4. Создать массив из 5 сотрудников.
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.


package lesson5;

// Думал для поля "phone" использовать лонг, но в примере задания отчетливо
// видно, что "phone" это String.
public class Employee {

    private String fullName;
    private String position;
    private String eMail;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String eMail,
                    String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // метод, который выводит информацию об объекте в консоль
    public void printInfo() {
        System.out.println("===================================");
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("e-mail: " + eMail);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    // геттер, возвращающий возраст сотрудника
    public int getAge(){
        return age;
    }
}
