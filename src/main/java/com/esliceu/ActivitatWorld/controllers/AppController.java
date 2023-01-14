package com.esliceu.ActivitatWorld.controllers;

import com.esliceu.ActivitatWorld.models.City;
import com.esliceu.ActivitatWorld.models.Country;
import com.esliceu.ActivitatWorld.models.CountryLanguage;
import com.esliceu.ActivitatWorld.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    MyService myservice;

    @GetMapping("/countries")
    public String countries(Model model){
        List<Country> countries = myservice.allCountries();

        model.addAttribute("countries",countries);
        return "countries";
    }



    @GetMapping("/cities/{code}/{name}")
    public String cities(@PathVariable String code,@PathVariable String name, Model model){

        /*Country country = (Country) model.getAttribute("countries");
        String codee = country.getCode();
       */
        List<City> cities = myservice.allCities(code);
        model.addAttribute("country",name);
        model.addAttribute("cities",cities);
        return "cities";
    }

    /*@RequestMapping("/languages/{code}")
    public String languages(@PathVariable String code,Model model){

        List<CountryLanguage> countryLanguages = myservice.getCountryLanguage(code);

        return "languages";
    }*/
}
