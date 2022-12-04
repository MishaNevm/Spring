package org.example.ls17.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class SecondLs17 {
    @GetMapping("/exit")
    public String exit (HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("s");
        System.out.println(name);
        return "secondLs17/exit";
    }
}
