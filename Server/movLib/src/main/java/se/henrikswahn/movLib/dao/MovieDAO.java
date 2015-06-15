package se.henrikswahn.movLib.dao;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import se.henrikswahn.movLib.representationClasses.Movie;

import java.util.List;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import se.henrikswahn.movLib.representationClasses.MovieMapper;

/**
 * Created by henrik on 15/06/15.
 */

@RegisterMapper(MovieMapper.class)
public interface MovieDAO {

    @SqlQuery("select * from Movie")
    List<Movie> getAll();

    @SqlQuery("select * from Movie where Name = :name")
    Movie findByName(@Bind("name") String name);
}
