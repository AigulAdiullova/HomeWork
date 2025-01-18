package Lesson_1;

public class Lesson_1 {
    public static void main(String[] args) {
        printThreeWords(); //Задание 1.
        checkSumSign(); //Задание 2.
        printCol(); //Задание 3.
        compareNumbers();//Задание 4.
        boolean temp = check(7, 8); //Задание 5.
        System.out.println(temp);
        checkPositiveNegative(9); //Задание 6.
        boolean t =returnTrueFalse(-17); //Задание 7.
        System.out.println(t);
        printWord("Hello, Igor", 3); //Задание 8.
        System.out.println(checkLeapYear(2000)); //Задание 9.
        int[] replacement = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; //Задание 10.
        replacevalues(replacement);
        linelength(100); //Задание 11.
        int[] replacedigit = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //Задание 12.
        replaced(replacedigit);
        diagonal(5, 5); //Задание 13.
        task(); //Задание 14.
        printArrayInConsole(retLenArr(10, 6));


    }

    private static void printThreeWords() {
        System.out.println("\nЗадание 1.");
        System.out.println("Orange\nBanana\nApple");
    }

    private static void checkSumSign() {
        System.out.println("\nЗадание 2.");
        int a = 5;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    private static void printCol() {
        System.out.println("\nЗадание 3.");
        int value = 101;
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value >= 100)
            System.out.println("Желтый");
        else if (value > 100) System.out.println("Зеленый");
    }

    private static void compareNumbers() {
        System.out.println("\nЗадание 4.");
        int a = 15;
        int b = 15;
        if (a >= b) System.out.println("a>=b");
        else System.out.println("a<b");

    }

    private static boolean check(int a, int b) {
        System.out.println("\nЗадание 5.");
        int с = a + b;
        return (10 <= с) && (с <= 20);
    }

    private static void checkPositiveNegative(int c) {
        System.out.println("\nЗадание 6.");
        if (c >= 0) System.out.println("положительное");
        else System.out.println("отрицательное");
    }

    private static boolean returnTrueFalse(int d) {
        System.out.println("\nЗадание 7.");
        if (d < 0) return true;
        return false;
    }

    private static void printWord(String str, int n){
        System.out.println("\nЗадание 8.");
        for (int i = 1; i <= n; i++)
            System.out.println("[" + i + "]" + str);
    }

    private static boolean checkLeapYear (int year){
        System.out.println("\nЗадание 9.");
        if (year % 400 == 0) return true;
        else if (year % 100 == 0) return false;
        else return year % 4 == 0;
    }

    private static void replacevalues(int[] replacement) {
        System.out.println("\nЗадание 10.");
        for (int i = 0; i < replacement.length; i++) {
            replacement[i] = (replacement[i] > 0)? 0 : 1;
            System.out.print(replacement[i] + " ");
        }
    }

    private static void linelength(int size) {
        System.out.println("\n\nЗадание 11.");
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
    }

    private static void replaced(int [] replacedigit) {
        System.out.println("\n\nЗадание 12.");
        for (int i = 0; i < replacedigit.length; i++) {
            if (replacedigit[i] < 6) replacedigit[i] = replacedigit[i] * 2;
            System.out.print (replacedigit[i]+" ");
        }
    }

    private static void diagonal(int x, int y) {
        System.out.println("\n\nЗадание 13.");
        int[][] arr = new int[x][y];
        for (int i = 0; i < arr.length; i++) {
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][i] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void task() {
        System.out.println("\nЗадание 14.");}

    private static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    private static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}