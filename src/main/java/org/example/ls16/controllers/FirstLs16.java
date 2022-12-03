package org.example.ls16.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstLs16 {

    @GetMapping("/hello")
    public String hello (@RequestParam(value = "name",required = false) String name,
                         @RequestParam (value = "surname", required = false) String surname) {
        System.out.println(name + " " + surname);
        return "firstLs16/hello";
    }
    @GetMapping("/goodbye")
    public String goodbye () {
        return "firstLs16/goodbye";
    }
}
