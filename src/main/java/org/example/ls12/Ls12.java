package org.example.ls12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ls12 {

    @GetMapping("/hello-world")
    public String sayHello () {
        return "hello_world";
    }
}
