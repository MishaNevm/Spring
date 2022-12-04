package org.example.pr18;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstPr18 {
    @GetMapping("/calculator")
    public String calculate(@RequestParam(value = "a", required = false) double a,
                            @RequestParam(value = "b", required = false) double b,
                            @RequestParam(value = "operation", required = false) String s,
                            Model model) {
        s = s.toLowerCase();
        switch (s) {
            case "multiplication" -> model.addAttribute("result", a + "*" + b + "=" + (a * b));
            case "addition" -> model.addAttribute("result", a + "+" + b + "=" + (a + b));
            case "subtraction" -> model.addAttribute("result", a + "-" + b + "=" + (a - b));
            case "division" -> model.addAttribute("result", a + "/" + b + "=" + (a / b));
            default -> model.addAttribute("result", "Not format operation");
        }
        return "firstPr18/calculate";
    }

}
