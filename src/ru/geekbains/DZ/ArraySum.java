package ru.geekbains.DZ;

public class ArraySum {

    private static Integer summa = 0;

    public static void checkSize(String[][] matrix) {
        if (matrix.length !=4) {
            throw new wrongSizeException("Array must be 4 strings only!");
        } else {
            for (int i = 0; i <matrix.length; i++) {
                if (matrix[i].length != 4) {
                throw new wrongSizeException("String %s contains %s members instead of 4!");
            }
            }

        }
    }

    public static int sum(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                try {
                    int addition = Integer.parseInt(matrix[i][j]);
                    summa += addition;
                } catch (NumberFormatException e) {
                    throw new notAnumberException("Not a number!");
                }
            }
        }
        return summa;
    }

}

