package org.example.ls17.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstLs17 {

    @GetMapping("/hello")
    public String hello (@RequestParam(value = "name",required = false) String name,
                         @RequestParam (value = "surname", required = false) String surname,
                         Model model) {
        model.addAttribute("message", name + " " + surname);

        return "firstLs17/hello";
    }
    @GetMapping("/goodbye")
    public String goodbye () {
        return "firstLs17/goodbye";
    }
}
