package lesson1;

public class lesson1 {

    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main():
    public static void main(String[] args) {

        variablesTypes();

        System.out.println("task №3: " + task3(5, 5, 5, 5));

        System.out.println(twoNumbers(8, 8));
        System.out.println(twoNumbers(21, 18));
        System.out.println(twoNumbers(19, 1));

        checkNumber(5);
        checkNumber(0);
        checkNumber(-10);

        System.out.println(trueOrFalse(10));
        System.out.println(trueOrFalse(0));
        System.out.println(trueOrFalse(-2));

        helloName("Mike");
        helloName("Mishutka");

        leapYear(1990);
        leapYear(2000);
        leapYear(1993);
    }

    // 2. Создать переменные всех пройденных типов данных и инициализировать их значения:
    public static void variablesTypes() {
        byte valByte;  // создаем переменную
        valByte = 125;  // инициализируем значение
        System.out.println("byte example: " + valByte);

        short valShort;  // создаем переменную
        valShort = 30_000;  // инициализируем значение
        System.out.println("short example: " + valShort);

        int valInt;  // создаем переменную
        valInt = 1_000_000_000;  // инициализируем значение
        System.out.println("int example: " + valInt);

        long valLong;  // создаем переменную
        valLong = 100_000_000_000L;  // инициализируем значение
        System.out.println("long example: " + valLong);

        float valFloat;  // создаем переменную
        valFloat = 3.68F;  // инициализируем значение
        System.out.println("float example: " + valFloat);

        double valDouble;  // создаем переменную
        valDouble = 32.5983;  // инициализируем значение
        System.out.println("double example: " + valDouble);

        char valChar;  // создаем переменную
        valChar = 15657;  // инициализируем значение
        System.out.println("char example: " + valChar);

        boolean isActive;  // создаем переменную
        isActive = true;  // инициализируем значение
        System.out.println("boolean example: " + isActive);

        String str;  // создаем переменную
        str = "A new string";  // инициализируем значение
        System.out.println("String example: " + str);
    }

    // 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float task3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // 4. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    public static boolean twoNumbers(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void checkNumber(int a) {
        if(a < 0){
            System.out.println("Число является отрицательным! Вы ввели: " + a);
        } else {
            System.out.println("Число является положительным! Вы ввели: " + a);
        }
    }

    // 6. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное,
    // и вернуть false если положительное.
    public static boolean trueOrFalse(int a) {
        if(a < 0) {
            System.out.println("Вы ввели число: " + a);
            return true;
        } else {
            System.out.println("Вы ввели число: " + a);
            return false;
        }
    }

    // 7. Написать метод, которому в качестве параметра передается строка,
    // обозначающая имя. Метод должен вывести в консоль сообщение
    // «Привет, указанное_имя!».
    public static void helloName(String str) {
        System.out.println("Привет, " + str + "!");
    }

    // 8. * Написать метод, который определяет, является ли год високосным,
    // и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го,
    // при этом каждый 400-й – високосный.
    public static void leapYear(int year) {
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Год: " + year + " является високосным!");
        } else {
            System.out.println("Год: " + year + " НЕ является високосным!");
        }
    }
}
