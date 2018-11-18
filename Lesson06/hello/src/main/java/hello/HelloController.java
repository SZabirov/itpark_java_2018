package hello;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping("/chisla")
    public String dvaChisla() {
        return "<html>\n" +
                "\t<head>\n" +
                "\t\t<title>Приветствие</title>\n" +
                "\t</head>\n" +
                "\t<body>\n" +
                "\t\t<p>Введите два числа:</p>\n" +
                "\t\t<form action=\"/sum\">\n" +
                "\t\t\t<input name=\"num1\" type=\"text\">\n" +
                "\t\t\t<input name=\"num2\" type=\"text\">\n" +
                "\t\t\t<input type=\"submit\">\n" +
                "\t\t</form>\n" +
                "\t</body>\n" +
                "</html>";
    }

    @RequestMapping("/sum")
    public String sum(@RequestParam int num1,
                      @RequestParam int num2) {
        return "Сумма = " + (num1 + num2);
    }

    @RequestMapping("/hi")
    public String hi(@RequestParam String username) {
        return "Привет, " + username;
    }

    @RequestMapping("/")
    public String index() {
        return "<html>\n" +
                "\t<head>\n" +
                "\t\t<title>Приветствие</title>\n" +
                "\t</head>\n" +
                "\t<body>\n" +
                "\t\t<h1>Давайте познакомимся</h1>\n" +
                "\t\t<p>Введите имя:</p>\n" +
                "\t\t<form action=\"/hi\">\n" +
                "\t\t\t<input name=\"username\" type=\"text\">\n" +
                "\t\t\t<input type=\"submit\">\n" +
                "\t\t</form>\n" +
                "\t</body>\n" +
                "</html>";
    }
}