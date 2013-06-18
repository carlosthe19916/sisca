/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.facade;

import java.util.List;
import javax.ejb.Local;
import org.softgreen.sisca.model.TrabajadorHistorialLaboral;

/**
 *
 * @author Carlos-PC
 */
@Local
public interface TrabajadorHistorialLaboralFacadeLocal {

    void create(TrabajadorHistorialLaboral trabajadorHistorialLaboral);

    void edit(TrabajadorHistorialLaboral trabajadorHistorialLaboral);

    void remove(TrabajadorHistorialLaboral trabajadorHistorialLaboral);

    TrabajadorHistorialLaboral find(Object id);

    List<TrabajadorHistorialLaboral> findAll();

    List<TrabajadorHistorialLaboral> findRange(int[] range);

    int count();
    
}
