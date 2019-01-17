package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    @RequestMapping("/random")
    @ResponseBody
    public String showRandom(@RequestParam int min, @RequestParam int max) {
        Random random = new Random();
        int randNumber=0;
        randNumber = random.nextInt(100)+1;

        return String.format("Random number is: %s,<br> MIN: %s,<br> MAX: %s.",randNumber,min,max);
    }

}
