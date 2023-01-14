package com.esliceu.ActivitatWorld.daos;

import com.esliceu.ActivitatWorld.models.CountryLanguage;

import java.util.List;

public interface CountryLanguageDAO {

    List<CountryLanguage> obtainLanguages(String code);
}
