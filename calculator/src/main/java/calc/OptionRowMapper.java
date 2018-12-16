package calc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

//будет получать объекты Option из данных строки из таблицы
public class OptionRowMapper implements RowMapper<Option> {

    @Override
    public Option mapRow(ResultSet resultSet, int i) throws SQLException {
        int id = resultSet.getInt("id");
        String text = resultSet.getString("text");
        Option o = new Option();
        o.setId(id);
        o.setText(text);
        return o;
    }
}
