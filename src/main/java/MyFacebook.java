import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import endPoints.UserResources;

public class MyFacebook extends Service<MyFacebookConfiguration> {

    public static void main(String[] args) throws Exception {
        new MyFacebook().run(new String[] { "server" });
    }

    @Override
    public void initialize(Bootstrap<MyFacebookConfiguration> facebookServicesConfigurationBootstrap) {

    }

    @Override
    public void run(MyFacebookConfiguration myFacebookConfiguration, Environment environment) throws Exception {
        environment.addResource(new UserResources());
    }
}
