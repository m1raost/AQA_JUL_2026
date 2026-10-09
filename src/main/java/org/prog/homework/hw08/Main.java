package org.prog.HomeWork8;

//TODO: For class Android and Apple, add color, model;
//TODO: add equals and hashcode for both

//TODO: compare green android vs white apple
//TODO: compare green android vs another green android
//TODO: compare white apple vs another white apple
//TODO: compare golden apple vs another white apple
//TODO: compare black android vs green android

public class Main {

    public static void unlock(IPhone phone) {
        phone.unlock();
    }

    public static void main(String[] args) {

        Apple apple = new Apple();
        Android android = new Android();

        Android greenAndroid = new Android();
        greenAndroid.color = "green";
        greenAndroid.model = "Xiaomi Redmi 8";

        Android blackAndroid = new Android();
        blackAndroid.color = "black";
        blackAndroid.model = "Samsung Galaxy 7";

        Apple whiteApple = new Apple();
        whiteApple.color = "white";
        whiteApple.model = "IPhone 13 pro";

        Apple goldenApple = new Apple();
        goldenApple.color = "golden";
        goldenApple.model = "IPhone 10 Pro Max";


        System.out.println(greenAndroid.equals(whiteApple));
        System.out.println(greenAndroid.equals(greenAndroid));
        System.out.println(whiteApple.equals(whiteApple));
        System.out.println(goldenApple.equals(whiteApple));
        System.out.println(blackAndroid.equals(greenAndroid));


        unlock(apple);
        unlock(android);

    }


}
