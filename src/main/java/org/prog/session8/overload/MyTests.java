package org.prog.session8.overload;

public class MyTests {

    private static UserService userService = new UserService();

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
        test10();
    }

    public static void test1() {
        userService.createUser("test1@gmail.com");
        System.out.println("Do the test 1 stuff");
    }

    public static void test2() {
        userService.createUser("test2@gmail.com");
        System.out.println("Do the test 2 stuff");
    }

    public static void test3() {
        userService.createUser("test3@gmail.com");
        System.out.println("Do the test 3 stuff");
    }

    public static void test4() {
        userService.createUser("test4@gmail.com", "UA", 1000, false);
        System.out.println("Do the test 4 stuff");
    }

    public static void test5() {
        userService.createUser("test5@gmail.com");
        System.out.println("Do the test 5 stuff");
    }

    public static void test6() {
        userService.createUser("test6@gmail.com");
        System.out.println("Do the test 6 stuff");
    }

    public static void test7() {
        userService.createUser("test7@gmail.com");
        System.out.println("Do the test 7 stuff");
    }

    public static void test8() {
        userService.createUser("test8@gmail.com", "UK", 0, false);
        System.out.println("Do the test 8 stuff");
    }

    public static void test9() {
        userService.createUser("test9@gmail.com", "IR", 100, false);
        System.out.println("Do the test 9 stuff");
    }

    public static void test10() {
        userService.createUser("test10@gmail.com");
        System.out.println("Do the test 10 stuff");
    }
}
