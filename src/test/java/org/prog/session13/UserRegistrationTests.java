package org.prog.session13;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;
import java.util.stream.Stream;

//TODO: Write test that will create a phone with a color. Assert that color is black.

public class UserRegistrationTests {

    @BeforeAll
    public static void setUpClass() {
        System.out.println("==================Strat Browser==================");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("==================Close Browser==================");
    }

    @BeforeEach
    public void setUp() {
        System.out.println(">>>>Go to home page");
    }

    @AfterEach
    public void tearDown() {
        System.out.println(">>>>Delete Cookies and Cache");
    }

    @Test
    public void passingTest() {
        String s1 = "correct user name";
        String s2 = "correct user name";
        String s3 = "correct user name";
        String s4 = "correct user name";
        Assertions.assertEquals(s1, s2, "Expected s1 and s2 to be the same");
        Assertions.assertEquals(s2, s3, "Expected s1 and s3 to be the same");
        Assertions.assertEquals(s3, s4, "Expected s1 and s3 to be the same");
    }

    @Test
    public void failingTest() {
        String s1 = "correct user name";
        String s2 = "some other username";
        Assertions.assertEquals(s1, s2, "Expected s1 and s2 to be the same");
    }

    @Test
    public void brokenTest() {
        String s = null;
        System.out.println(s.length());
    }

    @ParameterizedTest
    @ValueSource(strings = {"aaaaaaaaa1!", "aaaaaaaaA!", "aaaaaaaaaaA1"})
    public void badPassword1(String password) {
        System.out.println("Load page");
        System.out.println("Go to reg form");
        System.out.println("Enter password " + password);
        System.out.println("Registration failed - bad password");
    }

    @ParameterizedTest
    @MethodSource("userRegistration")
    public void badPassword2(String password, String errorMessage) {
        System.out.println("Load page");
        System.out.println("Go to reg form");
        System.out.println("Enter password " + password);
        System.out.println("Registration failed - " + errorMessage);
    }

    public static Stream<Arguments> userRegistration() {
        return Stream.of(
                Arguments.of("aaaaaaaaa1!", "No capital letters!"),
                Arguments.of("aaaaaaaaA!", "No numerics!"),
                Arguments.of("aaaaaaaaaaA1", "No special symbols!")
        );
    }

    @ParameterizedTest
    @MethodSource("yesterdayUsersData")
    public void newUsersTest(int userCount) {
        System.out.println("Load page");
        System.out.println("Go to user count page");
        System.out.println("Check user count is : " + userCount);
    }

    public static Stream<Arguments> yesterdayUsersData() {
        System.out.println("Connect to DB");
        System.out.println("Count actually new users");
        int i = new Random().nextInt(100);
        return Stream.of(Arguments.of(i));
    }
}
