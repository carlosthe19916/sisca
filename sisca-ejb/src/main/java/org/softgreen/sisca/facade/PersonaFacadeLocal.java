/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.facade;

import java.util.List;
import javax.ejb.Local;
import org.softgreen.sisca.model.Persona;

/**
 *
 * @author Carlos-PC
 */
@Local
public interface PersonaFacadeLocal {

    void create(Persona persona);

    void edit(Persona persona);

    void remove(Persona persona);

    Persona find(Object id);

    List<Persona> findAll();

    List<Persona> findRange(int[] range);

    int count();
    
}
