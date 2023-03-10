package com.esliceu.ActivitatWorld.daos;

import com.esliceu.ActivitatWorld.models.Country;

import java.util.List;

public interface CountryDAO {

    void delete(String language);
    List<Country> obtain();

    List<Country> obtainByLanguage(String language);

}
