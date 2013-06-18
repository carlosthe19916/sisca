/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.facade;

import java.util.List;
import javax.ejb.Local;
import org.softgreen.sisca.model.Vacacion;

/**
 *
 * @author Carlos-PC
 */
@Local
public interface VacacionFacadeLocal {

    void create(Vacacion vacacion);

    void edit(Vacacion vacacion);

    void remove(Vacacion vacacion);

    Vacacion find(Object id);

    List<Vacacion> findAll();

    List<Vacacion> findRange(int[] range);

    int count();
    
}
