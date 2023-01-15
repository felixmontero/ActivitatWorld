package com.esliceu.ActivitatWorld.daos;

import com.esliceu.ActivitatWorld.models.City;

import java.util.List;

public interface CityDAO {

    List<City> obtainCities(String code);

    List<City> newCity(String code);

    List<City> obtainDistrits(String code);

    void setCityDAO(String nameCity, String district, Integer population, String code);
}
