package org.prog.session4;

import java.util.Random;

public class SortingDemo {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[1000];

        System.out.println("============================");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(1000);
            System.out.println(arr1[i]);
        }
        System.out.println("============================");

        for (int i = 1; i < arr1.length; ) {
            if (i == 0) { //гном у первого горшка - слева смотреть не на что
                i++; //гном магает вправо
            }
            int currentPot = arr1[i];
            int prevPot = arr1[i - 1];
            if (currentPot < prevPot) { //если горшки НЕ в правильном порядке
                //поменять местами
                arr1[i] = prevPot;
                arr1[i - 1] = currentPot;
                //и шагаем назад
                i--;
            } else {
                i++;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
