
package com.mycompany.peluqueriacanina.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int client_num;
    private String name;
    private String breed;
    private String color;
    private String allergies;
    private String special_attention;
    private String observations;
    @OneToOne
    private Owner oneOwner;
    
    public Pet() {
    }
    
    public Pet(int client_num, String name, String breed, String color, String allergies, String special_attention, String observations, Owner oneOwner) {
        this.client_num = client_num;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.allergies = allergies;
        this.special_attention = special_attention;
        this.observations = observations;
        this.oneOwner = oneOwner;
    }

    public int getClient_num() {
        return client_num;
    }

    public void setClient_num(int client_num) {
        this.client_num = client_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getSpecial_attention() {
        return special_attention;
    }

    public void setSpecial_attention(String special_attention) {
        this.special_attention = special_attention;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Owner getOneOwner() {
        return oneOwner;
    }

    public void setOneOwner(Owner oneOwner) {
        this.oneOwner = oneOwner;
    }
    
}
