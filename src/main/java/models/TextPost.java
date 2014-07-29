package models;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Property;
import org.joda.time.DateTime;

import java.util.List;

@Entity
public class TextPost extends Post {
    @Property("text")
    private String text;

    public TextPost()
    {

    }
    public TextPost(String byUser, List<String> audience, String text)
    {
        this.text = text;
        this.byUser = byUser;
        this.audience = audience;
        this.timestamp = new DateTime().getMillis();
    }
}
