package se.henrikswahn.movLib;

import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;
import se.henrikswahn.movLib.API.MovieResource;
import se.henrikswahn.movLib.config.ServerConfig;
import se.henrikswahn.movLib.dao.MovieDAO;

/**
 * Created by henrik on 15/06/15.
 */
public class Main extends Application<ServerConfig> {

    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    @Override
    public String getName() {
        return "hello-World";
    }

    @Override
    public void initialize(Bootstrap<ServerConfig> bootstrap) {
        //Nothing yet
    }
    @Override
    public void run(ServerConfig serverConfig, Environment environment) throws Exception {

        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, serverConfig.getDataSourceFactory(), "postgresql");
        final MovieDAO dao = jdbi.onDemand(MovieDAO.class);
        environment.jersey().register(new MovieResource(dao));

    }
}
