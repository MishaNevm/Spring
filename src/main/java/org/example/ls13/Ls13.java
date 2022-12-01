package org.example.ls13;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ls13 {

    @GetMapping("/hello-world")
    public String sayHello () {
        return "hello_world";
    }
}
