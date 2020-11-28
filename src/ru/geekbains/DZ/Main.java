package ru.geekbains.DZ;

public class Main {

    public static void main(String[] args) {
        String[][] matrix = {
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "v"},
            {"1", "2", "3", "4"}
        };



        ArraySum.checkSize(matrix);
        System.out.println(ArraySum.sum(matrix));
    }

}
