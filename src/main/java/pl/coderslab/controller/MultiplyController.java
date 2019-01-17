package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;

@Controller
public class MultiplyController {

    @RequestMapping("/multiply")
    public String multiply(Model model, @RequestParam Integer size) {
        size = 10;
        model.addAttribute("size",size);
        return "multiply";
    }
    @RequestMapping("/paramMultiply/{rows}/{cols}")
    public String paramMultiply(Model model, @PathVariable int rows, @PathVariable int cols){
        model.addAttribute("rows",rows);
        model.addAttribute("cols",cols);
        return "multiply";
    }
}
