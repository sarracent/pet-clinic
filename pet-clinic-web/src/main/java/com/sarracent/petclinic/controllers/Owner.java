package com.sarracent.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class Owner {

    @RequestMapping({"", "/", "/index"})
    public String listOwners(Model model){
        model.addAttribute("title", "List of Owners");
        return "owners/index";
    }
}
