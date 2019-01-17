package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/first")
public class FormController {

    @GetMapping("/form")
    public String getForm(){
        return "form.jsp";
    }

    @PostMapping("/form")
    @ResponseBody
    public String postForm(@RequestParam String paramName){
        return paramName;
    }
}
