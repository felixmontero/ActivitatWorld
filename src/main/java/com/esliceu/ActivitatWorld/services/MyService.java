package com.esliceu.ActivitatWorld.services;

import com.esliceu.ActivitatWorld.daos.CountryDAO;
import com.esliceu.ActivitatWorld.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MyService {

    @Autowired
    CountryDAO countryDAO;

    public List<Country> allCountries(){
        System.out.println("DINS SERVICE");
        return countryDAO.obtain();

    }
}
