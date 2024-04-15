
package com.mycompany.peluqueriacanina.logic;

import com.mycompany.peluqueriacanina.persistence.PeristenceControl;
import java.util.List;

public class Control {
    PeristenceControl controlPersis = new PeristenceControl();

    public void saveItem(String petName, String breed, String color, String obser, String allergies, String specialAtten, String ownerName, String ownPhone) {
        
        Owner owner = new Owner();
        owner.setName(ownerName);
        owner.setOwnerPhone(ownPhone);
        
        
        Pet pet = new Pet();
        pet.setName(petName);
        pet.setBreed(breed);
        pet.setColor(color);
        pet.setAllergies(allergies);
        pet.setSpecial_attention(specialAtten);
        pet.setObservations(obser);
        pet.setOneOwner(owner);
        
        controlPersis.save(owner, pet);
        
        
    }

    public List<Pet> getPets() {
        return controlPersis.getPets();
    }

    public void deletePet(int client_num) {
        
        controlPersis.deletePet(client_num);


    }

    public Pet getPet(int client_num) {
        return controlPersis.getPet(client_num);
    }

    public void editOnlyPet(Pet pet, String petName, String breed, String color, String obser, String allergies, String specialAtten, String ownerName, String ownPhone) {
        
        pet.setName(petName);
        pet.setBreed(breed);
        pet.setColor(color);
        pet.setObservations(obser);
        pet.setSpecial_attention(specialAtten);
        pet.setAllergies(allergies);
        
        controlPersis.editPet(pet);
        
        Owner own = this.findOwner(pet.getOneOwner().getId_owner());
        own.setOwnerPhone(ownPhone);
        own.setOwnerPhone(ownPhone);
        
        this.editOwner(own);
        

    }

    private Owner findOwner(int id_owner) {
        return controlPersis.getOwner(id_owner);
    }

    private void editOwner(Owner own) {
        controlPersis.editOwner(own);
    }
    
    
    
}
