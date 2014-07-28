package models;
import com.google.code.morphia.annotations.*;
import org.bson.types.ObjectId;

@Entity
@Indexes(@Index(value = "id"))
public class User {
    @Id
    @Property("id")
    private String id;
    @Embedded
    private LoginCredentials loginCredentials;
    @Embedded
    private UserDetails userDetails;

    public User(String emailId, String passwd, String fname, String lname) {
        this.id = emailId;
        this.loginCredentials = new LoginCredentials(emailId, passwd);
        this.userDetails = new UserDetails(fname, lname);
    }
}

