package Users;

import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import models.User;

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
