package org.prog.session12.map;

// gmail - 123
// FB - 5671254357123
// insta - 5671254357123
// x.com - abcdefg@x.com
public class SocialLogin {
    public String providerId; //gmail / FB / insta / x.com
    public String userId;

    public SocialLogin(String providerId, String userId) {
        this.providerId = providerId;
        this.userId = userId;
    }
}
