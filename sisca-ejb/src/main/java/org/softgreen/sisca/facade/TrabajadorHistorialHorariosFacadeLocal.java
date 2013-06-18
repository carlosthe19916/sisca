/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.facade;

import java.util.List;
import javax.ejb.Local;

import org.softgreen.sisca.model.TrabajadorHistorialHorario;

/**
 *
 * @author Carlos-PC
 */
@Local
public interface TrabajadorHistorialHorariosFacadeLocal {

    void create(TrabajadorHistorialHorario trabajadorHistorialHorarios);

    void edit(TrabajadorHistorialHorario trabajadorHistorialHorarios);

    void remove(TrabajadorHistorialHorario trabajadorHistorialHorarios);

    TrabajadorHistorialHorario find(Object id);

    List<TrabajadorHistorialHorario> findAll();

    List<TrabajadorHistorialHorario> findRange(int[] range);

    int count();
    
}
