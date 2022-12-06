package org.example.ls20.controllers;

import org.example.ls20.dao.PeopleDAO;
import org.example.ls20.models.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final PeopleDAO peopleDAO;

    @Autowired
    public PeopleController(PeopleDAO peopleDAO) {
        this.peopleDAO = peopleDAO;
    }

    @GetMapping()
    public String getPeoples(Model model) {
        model.addAttribute("persons", peopleDAO.getPeoples());
        return "people/getPeoples";
    }

    @GetMapping("/{id}")
    public String getPerson(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", peopleDAO.getPerson(id));
        return "people/getPerson";
    }
    @GetMapping ("/new")
    public String create(@ModelAttribute("person") People people){
        return "people/new";
    }
    @PostMapping()
    public String add (@ModelAttribute("person") People people){
        peopleDAO.addPerson(people);
        return "redirect:/people";
    }

}
