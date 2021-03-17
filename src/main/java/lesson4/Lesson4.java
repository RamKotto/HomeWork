// 1. Полностью разобраться с кодом, попробовать переписать с нуля,
// стараясь не подглядывать в методичку.

// 2. Переделать проверку победы, чтобы она не была реализована просто набором условий,
// например, с использованием циклов.

// 3. * Попробовать переписать логику проверки победы,
//  чтобы она работала для поля 5х5 и количества фишек 4.
//  Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;

// 4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.


package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static int SIZE = 5;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искусственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра закончена!");
    }

    // инициализация карты
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // печатаем карту
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // ход человека
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в виде X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));  // while (isCellValid(x, y) == false
        map[y][x] = DOT_X;
    }

    // пределы игрового поля
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    // проверка на победу
    public static boolean checkWin(char symb) {
        // проверка по строкам
        for (int i = 0; i < SIZE; i++) {
            if (map[i][0] == symb && map[i][1] == symb && map[i][2] == symb && map[i][3] == symb) {
                return true;
            } else if (map[i][1] == symb && map[i][2] == symb && map[i][3] == symb && map[i][4] == symb) {
                return true;
            }
        }
        // проверка по столбцам
        for (int j = 0; j < SIZE; j++) {
            if (map[1][j] == symb && map[2][j] == symb && map[3][j] == symb && map[4][j] == symb) {
                return true;
            } else if (map[0][j] == symb && map[1][j] == symb && map[2][j] == symb && map[3][j] == symb) {
                return true;
            }
        }
//         проверка диагоналей  (p.s. я понимаю, что это жутко выглядит, требует доработки)
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb && map[3][3] == symb) {
            return true;
        } else if (map[4][4] == symb && map[1][1] == symb && map[2][2] == symb && map[3][3] == symb) {
            return true;
        } else if (map[0][4] == symb && map[1][3] == symb && map[2][2] == symb&& map[3][1] == symb) {
            return true;
        } else if (map[4][0] == symb && map[1][3] == symb && map[2][2] == symb&& map[3][1] == symb) {
            return true;
        } else if (map[1][0] == symb && map[2][1] == symb && map[3][2] == symb&& map[4][3] == symb) {
            return true;
        } else if (map[0][1] == symb && map[1][2] == symb && map[2][3] == symb&& map[3][4] == symb) {
            return true;
        } else if (map[3][0] == symb && map[2][1] == symb && map[1][2] == symb&& map[0][3] == symb) {
            return true;
        } else if (map[4][1] == symb && map[3][2] == symb && map[2][3] == symb&& map[1][4] == symb) {
            return true;
        }
        return false;
    }

    // если поле заполнено
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    // ход компьютера
    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
}
