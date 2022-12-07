package org.example.pr20.controllers;


import org.example.pr20.dao.PidorsDAO;
import org.example.pr20.models.Pidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pidors")
public class PidorsController {

    private final PidorsDAO pidorsDAO;

    @Autowired
    public PidorsController(PidorsDAO pidorsDAO) {
        this.pidorsDAO = pidorsDAO;
    }

    @GetMapping()
    public String getPidors(Model model) {
        if (pidorsDAO.getPidorList().isEmpty()) return "pidor/clearPidorsList";
        model.addAttribute("pidors", pidorsDAO.getPidorList());
        return "pidor/getPidors";
    }
    @GetMapping("/pidor{id}")
    public String getPidor (@PathVariable("id") int id, Model model) {
        model.addAttribute("pidor", pidorsDAO.getPidor(id));
        return "pidor/getPidor";
    }
    @GetMapping("/newpidor")
    public String addPidor (@ModelAttribute("pidor")Pidor pidor) {
        return "pidor/newPidor";
    }
    @PostMapping
    public String add (@ModelAttribute("pidor") Pidor pidor) {
        pidorsDAO.addPidor(pidor);
        return "redirect:/pidors";
    }
}
