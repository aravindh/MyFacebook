package models;

import Users.Gender;
import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Property;

@Embedded
public class UserDetails {
    @Property
    private String firstName;
    @Property
    private String lastName;
    @Property
    private Gender gender;

    public UserDetails(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
        this.gender = Gender.MALE;
    }

}
