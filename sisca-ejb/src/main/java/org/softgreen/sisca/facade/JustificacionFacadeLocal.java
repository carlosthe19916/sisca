/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.facade;

import java.util.List;
import javax.ejb.Local;
import org.softgreen.sisca.model.Justificacion;

/**
 *
 * @author Carlos-PC
 */
@Local
public interface JustificacionFacadeLocal {

    void create(Justificacion justificacion);

    void edit(Justificacion justificacion);

    void remove(Justificacion justificacion);

    Justificacion find(Object id);

    List<Justificacion> findAll();

    List<Justificacion> findRange(int[] range);

    int count();
    
}
