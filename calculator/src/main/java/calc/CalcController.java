package calc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {

    @GetMapping("/")
    public String index() {
        int x = 42 - 7;
        for (int i = 0; i < 100; i++) {
            if (i < x) {
                System.out.println("...");
            }
        }
        return "index";
    }

    @GetMapping("/result")
    public String result(Model m,
                         @RequestParam double num1,
                         @RequestParam String operator,
                         @RequestParam double num2) {
        double res = 0;
        if (operator.equals("+")) {
            res = num1 + num2;
        }
        if (operator.equals("-")) {
            res = num1 - num2;
        }
        m.addAttribute("res", res);
        return "calc_result";
    }
}
