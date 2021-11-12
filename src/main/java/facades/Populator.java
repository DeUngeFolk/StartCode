package facades;

import dtos.RenameMeDTO;
import entities.RenameMe;
import utils.EMF_Creator;

import javax.persistence.EntityManagerFactory;

public class Populator {
    public static void populate() {
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        RenameMeFacade renameMeFacade = RenameMeFacade.getFacadeExample(emf);
        RenameMe renameMe1 = new RenameMe("string 1","String 2");

        renameMeFacade.create(new RenameMeDTO(renameMe1));





    }

    public static void main(String[] args) {
        populate();
    }
}
