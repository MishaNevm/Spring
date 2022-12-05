package org.example.pr19.controllers;

import org.example.pr19.dao.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public class ClientController {

    private final ClientDAO clientDAO;

    @Autowired
    public ClientController(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    @GetMapping()
    public String getClients(Model model) {
        model.addAttribute("clients" ,clientDAO.getClientList());
        return "client/getClients";
    }

    @GetMapping("/id{id}")
    public String getClient (@PathVariable("id") int id, Model model){
        model.addAttribute("client" ,clientDAO.getClient(id));
        return "client/getClient";
    }

}
