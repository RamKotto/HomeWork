package lesson2;

public class lesson2 {

    public static void main(String[] args) {

        taskOne();
        System.out.println();

        taskTwo();
        System.out.println();

        taskThree();
        System.out.println();

        taskFour();
        System.out.println();

        taskFive();
        System.out.println();

        int[] myTopArray = {1, 2, 1, 1, 2, 1};
        System.out.println("Task six check:");
        System.out.println(taskSix(myTopArray));
        System.out.println();

        int[] myTopArraySeven = {1, 2, 3, 4, 5};
        int n = -7;
        System.out.println("Task seven check:");
        taskSeven(myTopArraySeven, n);
    }


    public static void taskOne() {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arrayOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        int[] arrayTwo = new int[arrayOne.length];
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == 0) {
                arrayTwo[i] = 1;
            } else {
                arrayTwo[i] = 0;
            }
        }
        // Проверка:
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print("arrayOne[" + i + "] = " + arrayOne[i]);
            System.out.println("     arrayTwo[" + i + "] = " + arrayTwo[i]);
        }
    }


    public static void taskTwo() {
        // 2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] myArray = new int[8];

        for (int i = 0, j = 0; j <= 21; i++, j += 3) {
            myArray[i] = j;
        }
        // Проверка:
        System.out.println("Task two Array check: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }


    public static void taskThree() {
        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] myVeryBestArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < myVeryBestArray.length; i++) {
            if (myVeryBestArray[i] < 6) {
                myVeryBestArray[i] = myVeryBestArray[i] * 2;
            }
        }
        // Проверка:
        System.out.println("Task three Array check: ");
        for (int i = 0; i < myVeryBestArray.length; i++) {
            System.out.print(myVeryBestArray[i] + " ");
        }
    }


    public static void taskFour() {
        // 4. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое)
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int square = 5;
        int[][] table = new int[square][square];

        // Заполняем диагонали единицами:
        for (int i = 0; i < square; i++) {
            table[i][i] = 1;
            table[i][square - i - 1] = 1;
        }

        // Проверка:
        System.out.println("Task four check:");
        for (int i = 0; i < square; i++) {
            for (int j = 0; j < square; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void taskFive() {
        // 5. ** Задать одномерный массив и найти в нем
        // минимальный и максимальный элементы (без помощи интернета);
        int[] myBestArray = {1000, 5, 1, 1425, 10, -539, 12, 0, 188, -2};
        int min = myBestArray[0];
        int max = myBestArray[0];

        for (int i = 0; i < myBestArray.length; i++) {
            if (min >= myBestArray[i]) {
                min = myBestArray[i];
            } else if (max <= myBestArray[i]) {
                max = myBestArray[i];
            }
        }

        // Проверка:
        System.out.println("Task five check:");
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }


    public static boolean taskSix(int[] myTopArray) {
        // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место,
        // в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
        // эти символы в массив не входят.
        int sumMyTopArray = 0;
        int leftPartOfArray = 0;

        // Считаем сумму всех чисел в массиве:
        for (int i = 0; i < myTopArray.length; i++) {
            sumMyTopArray += myTopArray[i];
        }

        // Ищем баланс, между суммой левых и правых чисел массива:
        for (int i = 0; i < myTopArray.length; i++) {
            leftPartOfArray += myTopArray[i];
            if (leftPartOfArray == sumMyTopArray - leftPartOfArray) {
                return true;
            }
        }
        return false;

    }

    public static void taskSeven(int[] myTopArraySeven, int n) {
        int temp;
        int len = myTopArraySeven.length - 1;
        if (n < 0) {
            for (int i = 0; i < -n; i++) {
                temp = myTopArraySeven[0];
                System.arraycopy(myTopArraySeven, 1, myTopArraySeven, 0, len);
                myTopArraySeven[len] = temp;
            }
        } else {
            for (int i = 0; i < n; i++) {
                temp = myTopArraySeven[len];
                System.arraycopy(myTopArraySeven, 0, myTopArraySeven, 1, len);
                myTopArraySeven[0] = temp;
            }
        }
        // Проверка:
        for (int i = 0; i < myTopArraySeven.length; i++) {
            System.out.println("arr[" + i + "] = " + myTopArraySeven[i]);
        }
    }
}
