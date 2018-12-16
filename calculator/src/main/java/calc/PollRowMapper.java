package calc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PollRowMapper implements RowMapper<Poll> {
    @Override
    public Poll mapRow(ResultSet resultSet, int i) throws SQLException {
        int id = resultSet.getInt("id");
        String question = resultSet.getString("question");
        Poll p = new Poll();
        p.setId(id);
        p.setQuestion(question);
        return p;
    }
}
