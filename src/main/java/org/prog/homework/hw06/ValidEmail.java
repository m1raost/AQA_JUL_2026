package org.prog.session6;

//TODO: from these emails, print only valid ones:
// String[] emails = new String[] {"test"};
// only one @
// at least 3 symbols before @
// at least one dot (.) after @
// @ and . must not be next to each other
// at least 5 symbols after @
//

public class ValidEmail {
    public static void main(String[] args) {
        String[] emails = new String[]{
                "test@test.com", //correct
                "ab@bcde.com", //incorrect
                "fgh@.bheg", //incorrect
                "kkl@@malinator.com", //incorrect
                "kool.mail.com", //incorrect
                "some@email.com"};//correct

        for (int i = 0; i < emails.length; i++) {
            if (!emails[i].contains("@")) {
                continue;
            }
            if (emails[i].indexOf("@") != emails[i].lastIndexOf("@")) {
                continue;
            }
            String[] splittedEmail = emails[i].split("@");

            if (splittedEmail[0].length() < 3) {
                continue;
            }
            if (!splittedEmail[1].contains(".")) {
                continue;
            }
            if (emails[i].indexOf("@") == emails[i].indexOf(".") - 1 || emails[i].indexOf(".") == emails[i].indexOf("@") - 1) {
                continue;
            }
            if (splittedEmail[1].length() < 5) {
                continue;
            }
            System.out.println(emails[i]);

        }
    }
}
