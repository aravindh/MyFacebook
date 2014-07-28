package endPoints;

import Users.UserOperations;
import com.sun.jersey.core.util.StringIgnoreCaseKeyComparator;
import com.yammer.metrics.annotation.Timed;
import models.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("user")
@Produces(value = MediaType.APPLICATION_JSON)
public class LogInResources extends UserOperations{
@Path("/authenticate")
@GET
    @Timed
    public boolean loginAuthentication(@QueryParam("emailId") String emailId, @QueryParam("passwd") String passwd   ) {
    //user.matches()
    return true;
}
    @Path("/create")
    @GET
    @Timed
    public User signup(@QueryParam("emailId") String emailId, @QueryParam("passwd") String passwd, @QueryParam("fname") String fname, @QueryParam("lname") String lname) {
        return userSignUp(emailId, passwd, fname, lname);
    }
}
