package com.esliceu.ActivitatWorld.controllers;

import com.esliceu.ActivitatWorld.models.Country;
import com.esliceu.ActivitatWorld.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    MyService myservice;

    @RequestMapping("/countries")
    public String countries(Model model){
        List<Country> countries = myservice.allCountries();

        model.addAttribute("countries",countries);
        return "countries";
    }
}
