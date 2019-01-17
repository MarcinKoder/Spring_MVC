package pl.coderslab.controller;

import com.google.api.translate.Translator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

@Controller
public class FreeTimeController {

    @RequestMapping(value = "/time", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String freeTime() {
        StringBuilder sb = new StringBuilder();
        LocalDateTime data = LocalDateTime.now();
        DayOfWeek day = data.getDayOfWeek();
        Translator translator = new Translator();
        sb.append(day).append(" ").append(data.getHour());
        boolean isWolne = Arrays.asList(DayOfWeek.SATURDAY, day == DayOfWeek.SUNDAY).contains(day);
        if (isWolne) {
            return sb.append("<br>Wolne! XD").toString();
        }
        if (data.getHour() > 9 && data.getHour() < 17) {
            return sb.append("<br>Pracuje, nie dzwoń :/").toString();
        }
        return sb.append("<br> Po Pracy :D").toString();

    }
}
