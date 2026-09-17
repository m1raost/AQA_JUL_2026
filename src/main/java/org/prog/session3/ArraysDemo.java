package org.prog.session3;

import java.util.Random;

//TODO: write cycle which will fill another array in reverse.
// example: [10,14,18,20,1] -> [1,20,18,14,10]

public class ArraysDemo {

    public static void main(String[] args) {
        Random random = new Random();

        int[] arr1 = new int[100];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(500);
        }

        int index = -1;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 50) {
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("number we search for not found in arr1");
        } else {
            System.out.println("number we found in arr1 has index " + index);
        }
    }

}
