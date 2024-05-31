/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cities;
import Model.Countries;
import Model.States;
import grafos.connection.connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Heber
 */
public class HashTables {
        
    private Map<String, Countries> countriesByIso = new HashMap<>();
    private Map<String, States> statesByIso = new HashMap<>();
    private Map<String, Cities> citiesByIso = new HashMap<>();

    private Map<Integer, Countries> countriesById = new HashMap<>();
    private Map<Integer, States> statesById = new HashMap<>();
    private Map<Integer, Cities> citiesById = new HashMap<>();

    public void addCountry(Countries country) {
        countriesByIso.put(country.getISO(), country);
        countriesById.put(country.getId(), country);
    }

   
    public void addState(States state) {
        statesByIso.put(state.getISO(), state);
        statesById.put(state.getId(), state);

        Countries country = countriesById.get(state.getCountryId());
        if (country != null) {
            country.addState(state);
        }
    }

    public void addCity(Cities city) {
        citiesByIso.put(city.getISO(), city);
        citiesById.put(city.getId(), city);

        States state = statesById.get(city.getStateId());
        if (state != null) {
            state.addCity(city);
        }
    }

    public Countries getCountryByIso(String iso) {
        return countriesByIso.get(iso);
    }

    public States getStateByIso(String iso) {
        return statesByIso.get(iso);
    }

    public Cities getCityByIso(String iso) {
        return citiesByIso.get(iso);
    }

    public Countries getCountryWithStatesAndCitiesByIso(String iso) {
        return countriesByIso.get(iso);
    }
    
    public Countries getCountryById(Integer iso){
        return countriesById.get(iso);
    }
    
    public States getStateById(Integer iso){
        return statesById.get(iso);
    }

    public  void FindHashTable(){
        // Agregar países

        // Búsquedas y demostración de relaciones
        System.out.println(getCountryWithStatesAndCitiesByIso("GT"));
    }
    
    
    
}
