package com.esliceu.ActivitatWorld.daos;

import com.esliceu.ActivitatWorld.models.Country;
import com.esliceu.ActivitatWorld.models.CountryLanguage;
import jdk.javadoc.internal.doclets.toolkit.taglets.SnippetTaglet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class CountryLanguageDAOImpl implements CountryLanguageDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;

    private final RowMapper<CountryLanguage> countryMapper = (rs, rn) -> {
        CountryLanguage p = new CountryLanguage();
        p.setName(rs.getString("Name"));
        p.setCountryCode(rs.getString("Code"));
        p.setOficial(rs.getBoolean("IsOfficial"));
        return p;
    };

    @Override
    public List<CountryLanguage> obtainLanguages(String code) {
        return jdbcTemplate.query("SELECT Name, Code, IsOfficial countrylanguage FROM  WHERE CountryCode = (?)", countryMapper,code);
    }
}
