package org.prog.session6;

//TODO: from these emails, print only valid ones:
// String[] emails = new String[]{"test"};
// only one @
// at least 3 symbols before @
// at least one dot (.) after @
// @ and . must not be next to each other
// at least 5 symbols after @

public class DemoString {

    public static void main(String[] args) {
        String[] emails = new String[]{
                "test@test.com",
                "ab@bcde.com",
                "fgh@.bheg",
                "kkl@@malinator.com",
                "kool.mail.com",
                "some@email.com"
        };

//        String s = "White!";
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        System.out.println(s.length());
//        System.out.println(s.substring(0));
//        System.out.println(s.repeat(5));
//        System.out.println("".isEmpty());
//        System.out.println("      ".isEmpty());
//        System.out.println("      ".isBlank());
//        System.out.println("abcdefg".contains("abc"));
//        System.out.println("abcdefg".contains("cde"));
//        System.out.println("abcdefg".contains("f"));
//        System.out.println("abcdefg".contains("efgh"));
//        System.out.println("Hello World".equals("Hello World"));
//        System.out.println("Hello World!".equals("Hello World"));
//        System.out.println("Hello World".endsWith(" World"));
//        System.out.println("Hello World".startsWith("Hello "));
        System.out.println("Hello World".indexOf("o"));
        System.out.println("Hello World".lastIndexOf("o"));
        String[] strings = "Hello World".split("o");
        System.out.println(strings.length);
        System.out.println("           Hello World                ".trim());
        System.out.println("Hello World".concat("!!!!!"));
        System.out.println("Hello World".replace("l", "L"));
        System.out.println(String.format("Hello %s! Welcome to %s!", "World", "Java"));
    }
}
