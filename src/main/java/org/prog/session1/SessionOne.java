package org.prog.session1;

public class SessionOne {

    public static void main(String[] args) {
        System.out.println("hello world");

        // == сравнение
        System.out.println("Is 1 == 1 ? " + (1 == 1));
        System.out.println("Is 1 == 2 ? " + (1 == 2));
        // > больше
        System.out.println("Is 1 > 1 ? " + (1 > 1));
        System.out.println("Is 1 > 2 ? " + (1 > 2));
        System.out.println("Is 2 > 1 ? " + (2 > 1));
        // < меньше
        System.out.println("Is 1 < 1 ? " + (1 < 1));
        System.out.println("Is 1 < 2 ? " + (1 < 2));
        System.out.println("Is 2 < 1 ? " + (2 < 1));
        // >= больше либо равно
        System.out.println("Is 1 >= 1 ? " + (1 >= 1));
        System.out.println("Is 1 >= 2 ? " + (1 >= 2));
        System.out.println("Is 2 >= 1 ? " + (2 >= 1));
        // <= меньше либо равно
        System.out.println("Is 1 <= 1 ? " + (1 <= 1));
        System.out.println("Is 1 <= 2 ? " + (1 <= 2));
        System.out.println("Is 2 <= 1 ? " + (2 <= 1));
        // != НЕ равно
        System.out.println("Is 1 != 1 ? " + (1 != 1));
        System.out.println("Is 1 != 2 ? " + (1 != 2));

        boolean b1 = true;
        boolean b2 = false;
        char c1 = 'a'; // 11111111
        byte b11 = 1; // 11111111
        short s1 = 1; //
        int i1 = 1;
        long l1 = 1;
        float f1 = 1;
        double d1 = 1;


        // 00   - 0000
        // 01   - 0001
        // 02   - 0010
        // 03   - 0011 = 1 + 2
        // 04   - 0100
        // 05   - 0101
        // 06   - 0110 =
        // 07   - 0111
        // 08   - 1000
        // 09   - 1001
        // 10  -  1010
        // 11  -  1011
        // 12  -  1100
        // 13  -  1101
        // 14  -  1110
        // 15  -  1111 = 8 + 4 + 2 + 1

        // 1 byte: 11111111 = 64 + 32 + 16 + 8 + 4 + 2 + 1 = 127
        // 2 byte: 1111111111111111 = 64 + 32 + 16 + 8 + 4 + 2 + 1 = 127
        // 4 byte: 1111111111111111 = 64 + 32 + 16 + 8 + 4 + 2 + 1 = 127
        // 8 byte: 1111111111111111 = 64 + 32 + 16 + 8 + 4 + 2 + 1 = 127
        // 128  - 1000 0000
        // 64   - 0100 0000
        // 32   - 0010 0000
        // 16   - 0001 0000
        // 8    - 0000 1000
        // 4    - 0000 0100
        // 2    - 0000 0010
        // 1    - 0000 0001

    }
}

