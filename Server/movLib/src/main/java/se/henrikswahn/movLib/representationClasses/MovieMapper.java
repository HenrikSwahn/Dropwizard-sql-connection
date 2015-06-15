package se.henrikswahn.movLib.representationClasses;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by henrik on 15/06/15.
 */
public class MovieMapper implements ResultSetMapper<Movie> {

    @Override
    public Movie map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {

        return new Movie(
            resultSet.getString("Name"),
                resultSet.getString("Regi"),
                resultSet.getString("Actor"),
                resultSet.getFloat("Length"),
                resultSet.getString("Description")
        );
    }
}
