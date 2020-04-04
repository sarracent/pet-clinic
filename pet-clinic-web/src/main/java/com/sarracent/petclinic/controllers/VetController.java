package com.sarracent.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index"})
    public String listVets(Model model){
        model.addAttribute("title", "List of Vets");
        return "vets/index";
    }
}
