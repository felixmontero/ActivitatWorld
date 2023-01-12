package com.esliceu.ActivitatWorld.daos;

import com.esliceu.ActivitatWorld.models.City;
import com.esliceu.ActivitatWorld.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityDAOImpl implements CityDAO{
    @Autowired
    JdbcTemplate jdbcTemplate;

    private final RowMapper<City> countryMapper = (rs, rn) -> {
        City city = new City();
        city.setName(rs.getString("Name"));
        city.setId(rs.getInt("Id"));
        city.setCountryCode(rs.getString("CountryCode"));
        return city;
    };

    @Override
    public List<City> obtainCities() {
        return null;
    }
}
