package com.mikovic.demomvcspring.controllers;

import com.mikovic.demomvcspring.service.ClientService;
import com.mikovic.demomvcspring.model.Client;
import com.mikovic.demomvcspring.service.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@Controller

public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Client> clients = clientService.findAll();
        model.addAttribute("clients", clients);
        return "index";
    }

    @GetMapping("/client/add")
    public String showMyLoginPage(Model theModel) {
        theModel.addAttribute("client", new Client());
        return "reg-client";
    }

    // Binding Result после @ValidModel !!!
    @PostMapping("/client/add")
    public String processRegistrationForm(@Valid @ModelAttribute("client") Client client, BindingResult theBindingResult, Model theModel) {
        String userName = client.getFirstName();

        if (theBindingResult.hasErrors()) {
            return "reg-client";
        }


        clientService.create(client);

        return "redirect:/";
    }

    @GetMapping("/client/delete{id}")
    public String deleteClient(@PathVariable("id") Integer id) {
        clientService.delete(id);
        return "redirect:/";
    }
}
