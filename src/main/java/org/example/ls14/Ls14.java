package org.example.ls14;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ls14 {

    @GetMapping("/hello-world")
    public String sayHello () {
        return "hello_world";
    }
}
