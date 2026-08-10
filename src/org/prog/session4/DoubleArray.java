package org.prog.session4;

//TODO: Bubble sort array of random ints (see SortingDemo)
// RU: Сортировка пузырьком
// TIP: while + for
public class DoubleArray {

    public static void main(String[] args) {
        int[][] ints = new int[][]{
                {1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13}
        };

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println(ints[i][j]);
            }
        }
    }
}
