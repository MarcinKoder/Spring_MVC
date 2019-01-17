package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

    @GetMapping("/setcookie/{value1}/{value2}")
    @ResponseBody
    public String setCookie(HttpServletResponse response,@PathVariable String value1, @PathVariable String value2) {
        StringBuilder sb = new StringBuilder();
        Cookie cookie1 = new Cookie("cookie1", value1);
        Cookie cookie2 = new Cookie("cookie2", value2);
        cookie1.setPath("/");
        cookie2.setPath("/");
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        sb.append(value1).append(value2);
        return sb.toString();
    }

    @RequestMapping("/getcookies")
    @ResponseBody
    public String home(HttpServletRequest request, @CookieValue("cookie1") String c1Value, @CookieValue("cookie2") String c2Value){
        StringBuilder sb = new StringBuilder();
        Cookie cookie1 = WebUtils.getCookie(request, "cookie1");
        Cookie cookie2 = WebUtils.getCookie(request, "cookie2");
        return sb.append("Cookie1: ")
                .append(cookie1.getValue())
                .append("<br>Cookie2: ")
                .append(cookie2.getValue())
                .append("<br>Wartosc cookie1 adnotacja: ")
                .append(c1Value)
                .append("<br> Wartosc cookie2 adnotacja:")
                .append(c2Value).toString();
    }

}
