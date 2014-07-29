package Users;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.query.Query;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import config.Mongodb;
import models.LoginCredentials;
import models.User;
import models.UserDetails;

import java.util.List;

public abstract class UserOperations {

    public boolean loginAuthentication(String emailId, String passwd) {
        LoginCredentials login = new LoginCredentials(emailId, passwd);

        try{
            Query<User> query = Mongodb.getInstance().getDatastore().createQuery(User.class).field("loginCredentials").equal(login);
            List<User> users = query.asList();
            System.out.println("authenticated users:"+users);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public User userSignUp(String emailId, String passwd, String fname, String lname) {
        User user = new User(emailId, passwd, fname, lname);
        try {
            System.out.println("*********"+ Mongodb.getInstance().getDatastore().save(user, WriteConcern.NORMAL));
        }
        catch (MongoException e){
            e.printStackTrace();
        }
        return user;
    }

    public List<UserDetails> findFriendsByName(String name){
        List<UserDetails> matchedUsers = null;
        try {
            Mongodb.getInstance();
            Query<UserDetails> query = Mongodb.getInstance().getDatastore().createQuery(UserDetails.class);
            query.or(
                    query.criteria("userDetails.firstName").contains(name),
                    query.criteria("userDetails.lastName").contains(name)
            );
            matchedUsers = query.asList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("matched users:"+matchedUsers);
        return matchedUsers;
    }


}
