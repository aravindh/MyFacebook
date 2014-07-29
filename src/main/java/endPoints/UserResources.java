package endPoints;

import Users.UserOperations;
import com.sun.jersey.core.util.StringIgnoreCaseKeyComparator;
import com.yammer.metrics.annotation.Timed;
import models.TextPost;
import models.User;
import models.UserDetails;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("user")
@Produces(value = MediaType.APPLICATION_JSON)
public class UserResources extends UserOperations{
    @Path("/authenticate")
    @GET
    @Timed
    public boolean loginAuthentication(@QueryParam("emailId") String emailId, @QueryParam("passwd") String passwd   ) {
    return loginAuthentication(emailId, passwd);
    }
    @Path("/create")
    @GET
    @Timed
    public User signup(@QueryParam("emailId") String emailId, @QueryParam("passwd") String passwd, @QueryParam("fname") String fname, @QueryParam("lname") String lname) {
        return userSignUp(emailId, passwd, fname, lname);
    }

    @Path("/searchFriendByName")
    @GET
    @Timed
    public List<UserDetails> searchFriendByName(@QueryParam("name") String name) {
        return findFriendsByName(name);
    }

    @Path("/postText")
    @GET
    @Timed
    public void postText(@QueryParam("text")String text, @QueryParam("byUser")String byUser) {
    }

    @Path("/getNewsFeed")
    @GET
    @Timed
    public List<TextPost> getNewsFeed(@QueryParam("user")String forUser, @QueryParam("from")Long fromTimeStamp, @QueryParam("limit") int limit) {
return null;
    }

    @Path("/forgotPasswd")
    @GET
    @Timed
    public boolean resetPassword(@QueryParam("user")String emailId, @QueryParam("passwd")String passwd) {
        return true;
    }

    @Path("/sendRequest")
    @GET
    @Timed
    public boolean sendFriendRequest(@QueryParam("srcUser")String emailId, @QueryParam("targetUser")String passwd) {
        return true;
    }

    @Path("/acceptRequest")
    @GET
    @Timed
    public boolean acceptFriendRequest(@QueryParam("srcuser")String emailId, @QueryParam("targetUser")String passwd) {
        return true;
    }
}
