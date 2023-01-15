package com.esliceu.ActivitatWorld.services;

import com.esliceu.ActivitatWorld.daos.CityDAO;
import com.esliceu.ActivitatWorld.daos.CountryDAO;
import com.esliceu.ActivitatWorld.daos.CountryLanguageDAO;
import com.esliceu.ActivitatWorld.models.City;
import com.esliceu.ActivitatWorld.models.Country;
import com.esliceu.ActivitatWorld.models.CountryLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MyService {
 // El servicio se encargará de llamar a los metodos para obtener la información de la bdd
    @Autowired
    CountryDAO countryDAO;
    @Autowired
    CityDAO cityDAO;

    @Autowired
    CountryLanguageDAO countryLanguageDAO;

    public List<Country> allCountries(){
        return countryDAO.obtain();
    }

    public List<City> allCities(String code){
        return cityDAO.obtainCities(code);
    }
    public void newCity(String code){
        cityDAO.newCity(code);
    }

    public List<CountryLanguage> getCountryLanguage(String code){
        return countryLanguageDAO.obtainLanguages(code);
    }

    public List<Country> allCountriesByLanguage(String language) {
        return countryDAO.obtainByLanguage(language);
    }

    public List<City> getDistricts(String code) {
      return cityDAO.obtainDistrits(code);
    }

    public void setCity(String nameCity, String district, Integer population, String code) {
        cityDAO.setCityDAO(nameCity, district, population, code);
    }
}
