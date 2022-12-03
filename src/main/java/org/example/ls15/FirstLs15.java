package org.example.ls15;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstLs15 {
    @GetMapping("/hello")
    public String helloWorld() {
        return "firstLs15/hello";
    }
    @GetMapping("/goodbye")
    public String goodBye() {
        return "firstLs15/goodbye";
    }

}
