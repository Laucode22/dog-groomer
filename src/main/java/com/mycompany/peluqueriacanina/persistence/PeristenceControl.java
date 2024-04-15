
package com.mycompany.peluqueriacanina.persistence;

import com.mycompany.peluqueriacanina.logic.Owner;
import com.mycompany.peluqueriacanina.logic.Pet;
import com.mycompany.peluqueriacanina.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PeristenceControl {
    OwnerJpaController ownerJpa = new OwnerJpaController();
    PetJpaController petJpa = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        
        ownerJpa.create(owner);
        petJpa.create(pet);
        
    }

    public List<Pet> getPets() {
       return petJpa.findPetEntities();
    }

    public void deletePet(int num_clietn) {
        try{
            petJpa.destroy(num_clietn);
        }catch(NonexistentEntityException ex){
            Logger.getLogger(PeristenceControl.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public Pet getPet(int client_num) {
        return petJpa.findPet(client_num);
        
    }

    public void editPet(Pet pet) {
        try {
            petJpa.edit(pet);
        } catch (Exception ex) {
            Logger.getLogger(PeristenceControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Owner getOwner(int id_owner) {
        return ownerJpa.findOwner(id_owner);
    }

    public void editOwner(Owner own) {
        try {
            ownerJpa.edit(own);
        } catch (Exception ex) {
            Logger.getLogger(PeristenceControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
