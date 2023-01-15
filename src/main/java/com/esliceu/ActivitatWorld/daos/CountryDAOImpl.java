package com.esliceu.ActivitatWorld.daos;

import com.esliceu.ActivitatWorld.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CountryDAOImpl implements CountryDAO{
    @Autowired
    JdbcTemplate jdbcTemplate;

    private final RowMapper<Country> countryMapper = (rs, rn) -> {
        Country p = new Country();
        p.setName(rs.getString("Name"));
        p.setCode(rs.getString("Code"));
        return p;
    };

    @Override
    public void delete(Country country) {

    }

    @Override
    public List<Country> obtain() {
        return jdbcTemplate.query("select Code,Name from country", countryMapper);
    }

    @Override
    public List<Country> obtainByLanguage(String language) {
        return jdbcTemplate.query("SELECT country.Name, country.Code FROM `country` INNER JOIN countrylanguage ON country.code = countrylanguage.CountryCode WHERE countrylanguage.Language = \"" + language + "\"", countryMapper);
    }
}
