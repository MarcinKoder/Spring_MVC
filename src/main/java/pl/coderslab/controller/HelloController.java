package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.time.LocalDateTime;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(@RequestParam String firstName, @RequestParam String lastName) {
        return String.format("Hello %s %s!", firstName, lastName);
    }

    @RequestMapping("/helloView")
    public String helloView(Model model) {
        String color = "green";
        String backgroundColor = "blue";
        if (LocalDateTime.now().getHour() >= 8 && LocalDateTime.now().getHour() <= 20) {
            color = "blue";
            backgroundColor = "green";
        }
        model.addAttribute("color", color);
        model.addAttribute("backgroundColor", backgroundColor);
        return "home";
    }

}

