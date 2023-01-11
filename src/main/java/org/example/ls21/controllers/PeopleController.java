package org.example.ls21.controllers;

import org.example.ls21.dao.PeopleDAO;
import org.example.ls21.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;




@Validated
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

    @GetMapping("/new")
    public String create(@ModelAttribute("person") Person person) {
        return "people/new";
    }

    @PostMapping
    public String createPostMethod(@ModelAttribute("person")Person person) {
        peopleDAO.addPerson(person);
        return "redirect:/people";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("person", peopleDAO.getPerson(id));
        return "people/edit";
    }

    @PatchMapping("/{id}")
    public String editPatchMethod(@ModelAttribute("person") Person person) {
        peopleDAO.edit(person.getId(), person);
        return "redirect:/people";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        peopleDAO.delete(id);
        return "redirect:/people";
    }
}
