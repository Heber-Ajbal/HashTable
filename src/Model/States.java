/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heber
 */
public class States {
    private Integer id;
    private Integer countryId; 
    private String name;
    private String ISO;
    List<Cities> cities;

    public States(Integer id, Integer countryId, String name, String ISO) {
        this.id = id;
        this.countryId = countryId;
        this.name = name;
        this.ISO = ISO;
        this.cities = new ArrayList<>();
    }

    public void addCity(Cities city) {
        cities.add(city);
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISO() {
        return ISO;
    }

    public void setISO(String ISO) {
        this.ISO = ISO;
    }

    public List<Cities> getCities() {
        return cities;
    }

    
    @Override
    public String toString() {
        return "States{" + "id=" + id + ", countryId=" + countryId + ", name=" + name + ", ISO=" + ISO + '}';
    }
    
    
}
