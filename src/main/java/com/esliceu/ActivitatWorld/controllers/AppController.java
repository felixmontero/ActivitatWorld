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

import javax.servlet.http.HttpServletRequest;
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

    @GetMapping("/countries/{language}")
    public String countries(@PathVariable String language,Model model){
        List<Country> countries = myservice.allCountriesByLanguage(language);

        model.addAttribute("countries",countries);
        return "countries";
    }

    @PostMapping("/countries/{language}/{code}")
    public String countriesPost(@PathVariable String language,@PathVariable String code,Model model){
        myservice.deleteCountriesByLanguage(code);
        List<Country> countries = myservice.allCountriesByLanguage(language);

        model.addAttribute("countries",countries);
        return "countries";
    }
    @GetMapping("/cities/{code}/{name}")
    public String cities(@PathVariable String code,@PathVariable String name, Model model){

        /*Country country = (Country) model.getAttribute("countries");
        String codee = country.getCode();
       */
        List<City> cities = myservice.allCities(code);
        model.addAttribute("code",code);
        model.addAttribute("country",name);
        model.addAttribute("cities",cities);
        return "cities";
    }
    @GetMapping("/newCity/{code}/{name}")
    public String newCity(@PathVariable String code,@PathVariable String name, Model model){
        List<City> cityDistricts =myservice.getDistricts(code);
        model.addAttribute("code",code);
        model.addAttribute("name",name);
        model.addAttribute("districts", cityDistricts);
        return "newCity";
    }
    @PostMapping("/newCity/{code}")
    public String newCity(@PathVariable String code, Model model, HttpServletRequest req){
        String nameCity = req.getParameter("nameCity");
        String district = req.getParameter("district");
        Integer population = Integer.parseInt(req.getParameter("population"));
       myservice.setCity(nameCity,district,population,code);
        return "newCity";
    }


    @RequestMapping("/languages/{code}/{name}")
    public String languages(@PathVariable String code,@PathVariable String name,Model model){

        List<CountryLanguage> countryLanguages = myservice.getCountryLanguage(code);
        model.addAttribute("country",name);
        model.addAttribute("languages",countryLanguages);
        return "languages";
    }
}
