package com.esliceu.ActivitatWorld.models;

public class CountryLanguage {

    private float percentage;
    private String language;
    private boolean oficial;

    public boolean isOficial() {
        return oficial;
    }
    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = this.percentage;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }



    public void setOficial(boolean oficial) {
        this.oficial = oficial;
    }
}
