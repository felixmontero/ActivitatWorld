package com.esliceu.ActivitatWorld.models;

public class CountryLanguage {

    private String countryCode;
    private String name;
    private boolean oficial;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOficial() {
        return oficial;
    }

    public void setOficial(boolean oficial) {
        this.oficial = oficial;
    }
}
