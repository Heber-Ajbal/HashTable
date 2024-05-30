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
public class Countries {
    private Integer id;
    private String name;
    private String ISO;    
    List<States> states;

    public Countries(Integer id, String name, String ISO) {
        this.id = id;
        this.name = name;
        this.ISO = ISO;
        this.states = new ArrayList<>();
    }

    public void addState(States state) {
        states.add(state);
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<States> getStates() {
        return states;
    }
    
    

    @Override
    public String toString() {
        return getName();
    }
    
    
    
}
