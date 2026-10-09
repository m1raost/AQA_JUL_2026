package HomeWork10;

//TODO: 1. Write your own exception that extends RuntimeException
//      2. In equals AND hashCode if phone has null color or null model -> throw your exception
//      3. In public static void main - catch your exception

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.color = "Golden";
        apple.model = "IPhone 13 Pro Max";

        Android android = new Android();
        android.color = "Black";
        android.model = "Xiaomi Redmi 8";

        try {
            Apple emptyApple = new Apple();
            System.out.println(emptyApple.equals(apple));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }


        try {
            Android emptyAndroid = new Android();
            System.out.println(emptyAndroid.equals(android));
        } catch (MyException m) {
            System.out.println(m.getMessage());
        }
    }
}
