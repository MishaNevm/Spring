package org.example.ls15;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class SecondLs15 {
    @GetMapping("/exit")
    public String exit (){
        return "secondLs15/exit";
    }
}
