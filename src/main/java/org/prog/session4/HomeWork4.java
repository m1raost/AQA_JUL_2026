package org.prog.session4;

import java.util.Random;

public class HomeWork4 {
    public static void main(String[] args) {
        // Bubble sort
        Random random = new Random();

        int[] ints = new int[50];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }

        System.out.println("Before sorting:");
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        int hold;
        int pass = 0;

        while (pass < ints.length - 1) {
            for (int i = 0; i < ints.length - 1; i++) {
                if (ints[i] > ints[i + 1]) {
                    hold = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = hold;
                }
            }
            pass++;
        }

        System.out.println("After sorting:");
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}


