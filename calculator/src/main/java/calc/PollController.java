package calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class PollController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/polls")
    public String polls(Model m) {
        PollRowMapper mapper = new PollRowMapper();
        List<Poll> polls =
                jdbcTemplate.query(
                        "SELECT * from poll",
                        mapper
                );
        m.addAttribute("polls", polls);
        return "polls_template";
    }

    @GetMapping("/options")
    public String options(Model m,
                          @RequestParam int id) {
        OptionRowMapper mapper = new OptionRowMapper();
        List<Option> options = jdbcTemplate.query(
                "SELECT * FROM option WHERE poll_id = " + id,
                mapper
        );
        m.addAttribute("options", options);
        return "options_template";
    }

    @GetMapping("/save")
    public String save(@RequestParam int option) {
        jdbcTemplate.update(
                "UPDATE option SET count = count + 1 " +
                        "WHERE id = " + option);
        return "redirect:/polls";
    }

    @GetMapping("/feedback")
    public String feedback() {
        return "feedback";
    }

    @GetMapping("/savefeedback")
    public String savefeedback(@RequestParam String comment) {
        String query = "INSERT INTO feedback(comment) " +
                "VALUES (?)";
        Object[] params = {comment};
        jdbcTemplate.update(query, params);
    //очень-очень плохой вариант
//        String query = "INSERT INTO feedback(comment) " +
//                "VALUES ('" + comment + "')";
//        System.out.println(query);
//        jdbcTemplate.update(query);
        return "/feedback";
    }
}



