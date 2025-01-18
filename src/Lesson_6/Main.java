package Lesson_6;

public class Main {

    public static void main(String[] args) {
        String[][] array = {{"2", "4", "8", "16"}, {"3", "9", "18", "54"}, {"4", "16", "64", "256"}, {"5", "25", "125", "625"}};

        try {
            int result = sumArrayElements(array);
            System.out.println("сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("размер массива не соответствует 4x4");
        } catch (MyArrayDataException e) {
            System.out.println("неверные данные в ячейке: " + e.getRow() + ", " + e.getColumn());
        }
    }

    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}