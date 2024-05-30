/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Heber
 */
public class Cities {
    private Integer id;
    private Integer stateId;
    private String name;
    private String ISO;

    public Cities(Integer id, Integer stateId, String name, String ISO) {
        this.id = id;
        this.stateId = stateId;
        this.name = name;
        this.ISO = ISO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
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

    @Override
    public String toString() {
        return "Cities{" + "id=" + id + ", stateId=" + stateId + ", name=" + name + ", ISO=" + ISO + '}';
    }
    
    
}
