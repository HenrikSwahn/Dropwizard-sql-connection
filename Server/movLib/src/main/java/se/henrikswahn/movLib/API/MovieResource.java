package se.henrikswahn.movLib.API;

import se.henrikswahn.movLib.dao.MovieDAO;
import se.henrikswahn.movLib.representationClasses.Movie;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by henrik on 15/06/15.
 */

@Path("/movies")
@Produces(MediaType.APPLICATION_JSON)
public class MovieResource {

    MovieDAO movieDao;

    public MovieResource(MovieDAO movieDao) {
        this.movieDao = movieDao;
    }

    @GET
    public List<Movie> getAll() {
        return movieDao.getAll();
    }

    @GET
    @Path("/{name}")
    public Movie get(@PathParam("name") String name) {
        return movieDao.findByName(name);
    }
}
