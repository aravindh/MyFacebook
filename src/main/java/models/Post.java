package models;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Property;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.List;

/**
 * Created by aravindh on 30-07-2014.
 */
public abstract class Post {
    @Id
    protected String id;
    @Property("byUser")
    protected String byUser;
    @Property("audience")
    protected List<String> audience;
    @Property("timestamp")
    protected Long timestamp;
}

