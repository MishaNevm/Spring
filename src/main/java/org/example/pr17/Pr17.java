package org.example.pr17;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Pr17 {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello-world";
    }
}
