package com.esliceu.ActivitatWorld.daos;

import com.esliceu.ActivitatWorld.models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityDAOImpl implements CityDAO{
    @Autowired
    JdbcTemplate jdbcTemplate;

    private final RowMapper<City> citiesMapper = (rs, rn) -> {
        City city = new City();
        city.setName(rs.getString("Name"));
        //city.setId(rs.getInt("Id"));
        city.setDistrict(rs.getString("District"));
        city.setPopulation(rs.getInt("Population"));
        return city;
    };

    @Override
    public List<City> obtainCities(String code) {
        return jdbcTemplate.query("SELECT Name, District, Population  FROM city WHERE CountryCode = (?)", citiesMapper, code);
    }

    @Override
    public List<City> newCity(String code) {
            return jdbcTemplate.query("select District from city", citiesMapper);
    }
    @Override
    public List<City> obtainDistrits(String code) {
        return jdbcTemplate.query("select Name, District, Population from city WHERE CountryCode = (?) and District != '-'", citiesMapper,code);
    }

    @Override
    public void setCityDAO(String nameCity, String district, Integer population,String code) {
        jdbcTemplate.update("insert into city (Name,District,Population,CountryCode) values (?,?,?,?)",nameCity,district,population,code);
    }
}
