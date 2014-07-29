package models;

import Users.Gender;
import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Property;

import java.util.ArrayList;
import java.util.List;

@Embedded
public class UserDetails {
    @Property("firstName")
    private String firstName;
    @Property("lastName")
    private String lastName;
    @Property("gender")
    private Gender gender;
    @Property("friendRequests")
    private List<UserDetails> friendRequests;
    @Property("friends")
    private List<UserDetails> friends;

    public UserDetails(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
        this.gender = Gender.MALE;
        this.friendRequests = new ArrayList<UserDetails>();
        this.friends = new ArrayList<UserDetails>();
    }

    public UserDetails(){

    }
}
