package config;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import models.LoginCredentials;
import models.User;
import models.UserDetails;

import java.net.UnknownHostException;

public class Mongodb {
    private static Mongodb ourInstance = new Mongodb();
    private Datastore datastore;
    private String dbName;
    public static Mongodb getInstance() {
        return ourInstance;
    }

    private Mongodb() {
        try {
            Mongo mongo = new Mongo("localhost");
            Morphia morphia = new Morphia();
            dbName = "MyFacebook";
            morphia.mapPackage("models");
            //morphia.map(User.class).map(LoginCredentials.class);
            //morphia.map(User.class).map(UserDetails.class);
            datastore = morphia.createDatastore(mongo, dbName);
            //datastore.ensureIndexes();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
    public Datastore getDatastore(){
        return datastore;
    }
}
