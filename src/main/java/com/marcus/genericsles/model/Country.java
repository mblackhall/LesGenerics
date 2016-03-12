package com.marcus.genericsles.model;

/**
 * @author marcusn
 */
public class Country implements Comparable<Country> {

    private String countryName;
    private String currency;
    private long population;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public Country(String countryName, String currency) {
        this(countryName);
        this.currency = currency;
    }

    public Country(String countryName, String currency, long population) {
       this(countryName,currency);
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

   @Override
    public int compareTo(Country o) {
        if (o == null || o.getCountryName() == null) return -1;
        return this.countryName.compareTo(o.countryName);

    }
}
