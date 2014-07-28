package Users;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import models.LoginCredentials;
import models.User;
import models.UserDetails;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Locale;

public abstract class UserOperations {

    public boolean loginAuthentication(String emailId, String passwd) {
        return true;
    }

    public User userSignUp(String emailId, String passwd, String fname, String lname) {
        User user = new User(emailId, passwd, fname, lname);
        try {
            System.out.println("*********"+Mongodb.getInstance().getDatastore().save(user, WriteConcern.NORMAL));
        }
        catch (MongoException e){
            e.printStackTrace();
        }
        return user;
    }

/*    public List<User> findFriends(String name){

    }*/


}
