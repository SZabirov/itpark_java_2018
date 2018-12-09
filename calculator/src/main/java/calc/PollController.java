package calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PollController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/polls")
    public String polls(Model m) {
        List<String> questions =
                jdbcTemplate.queryForList(
                        "SELECT question from poll",
                        String.class
                );
        String q = questions.get(0);
        m.addAttribute("question", q);
        return "polls_template";
    }
}
