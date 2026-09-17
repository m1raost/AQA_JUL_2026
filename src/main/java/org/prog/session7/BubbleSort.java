package org.prog.session7;

import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] ints = new int[100];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1000);
            System.out.println(ints[i]);
        }

        // [1,2,3,4,5]
        // [2,3,4,1,5]
        // [2,3,1,4,5]
        // [1,2,3,5,4]
        // [1,2,3,4,5]
        // [1,2,3,4,5]


        boolean iSorted = false;
        while (!iSorted) {
            iSorted = true;
            for (int i = 0; i < ints.length - 1; i++) {
                int currentValue = ints[i];
                int nextValue = ints[i + 1];
                if (currentValue < nextValue) {
                    ints[i] = nextValue;
                    ints[i + 1] = currentValue;
                    iSorted = false;
                }
            }
        }

        System.out.println("==========================================");

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        // [5,3,2,4,1]
        // [3,5,2,4,1]
        // [3,2,5,4,1]
        // [3,2,4,5,1]
        // [3,2,4,1,5]
        // [2,3,4,1,5]
        // [2,3,1,4,5]
        // [2,1,3,4,5]
        // [1,2,3,4,5]
        // [1,2,3,4,5]
    }
}
