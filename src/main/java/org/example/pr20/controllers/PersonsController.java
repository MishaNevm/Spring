package org.example.pr20.controllers;


import org.example.pr20.dao.PersonDAO;
import org.example.pr20.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/person")
public class PersonsController {

    private final PersonDAO personDAO;

    @Autowired
    public PersonsController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping()
    public String showAllPerson(Model model) {
        model.addAttribute("persons",personDAO.getPersonList());
        return "person/showAllPerson";
    }

    @GetMapping("/{id}")
    public String showPerson(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", personDAO.getPerson(id));
        return "person/showPerson";
    }

    @GetMapping("/new")
    public String blankNewPerson(@ModelAttribute("person") Person person) {
        return "person/new";
    }
    @PostMapping
    public String addNewPerson(@ModelAttribute("person") Person person) {
        personDAO.addPerson(person);
        return "redirect:/person";
    }

}
