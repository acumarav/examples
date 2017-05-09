package org.alext.learning;

import org.alext.learning.model.User;

public class Helpers {

    public static String extractEmailDomainName(User user) {
        String email = user.getEmail();

        int from = email.indexOf('@');
        return email.substring(from, email.length());

    }
}
