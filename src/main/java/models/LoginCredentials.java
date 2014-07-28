package models;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Property;
@Embedded
public class LoginCredentials {
    @Property("mailId")
    private String emailId;
    @Property("passwd")
    private String passwd;

    public LoginCredentials(String emailId, String passwd) {
        this.emailId = emailId;
        this.passwd = passwd;
    }

}
