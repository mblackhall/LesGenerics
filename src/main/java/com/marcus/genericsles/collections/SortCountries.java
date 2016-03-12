package com.marcus.genericsles.collections;

import com.marcus.genericsles.model.Country;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author marcus
 */
public class SortCountries {

    public static void main(String[] args) {

        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Zambia"));
        countries.add(new Country("Netherlands"));
        countries.add(new Country("France"));
        countries.add(new Country("Albania"));

     Collections.sort(countries); //why isnt this allowed

//        for(Country country: countries){
//            System.out.println(country.getCountryName());
//        }



    }
}
