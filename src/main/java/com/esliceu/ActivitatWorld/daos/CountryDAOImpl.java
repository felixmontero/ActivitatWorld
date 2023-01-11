package com.esliceu.ActivitatWorld.daos;

import com.esliceu.ActivitatWorld.models.Country;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class CountryDAOImpl implements CountryDAO{
    JdbcTemplate jdbcTemplate;

    private final RowMapper<Country> countryMapper = (rs, rn) -> {
        Country p = new Country();
        p.setName(rs.getString("name"));
        p.setId(rs.getInt("id"));
        return p;
    };

    @Override
    public void delete(Country country) {

    }

    @Override
    public List<Country> obtain(Country country) {
        return jdbcTemplate.query("select * from country", countryMapper);
    }
}
