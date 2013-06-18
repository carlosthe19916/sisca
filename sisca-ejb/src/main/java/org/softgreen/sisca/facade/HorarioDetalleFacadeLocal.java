/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.facade;

import java.util.List;
import javax.ejb.Local;
import org.softgreen.sisca.model.HorarioDetalle;

/**
 *
 * @author Carlos-PC
 */
@Local
public interface HorarioDetalleFacadeLocal {

    void create(HorarioDetalle horarioDetalle);

    void edit(HorarioDetalle horarioDetalle);

    void remove(HorarioDetalle horarioDetalle);

    HorarioDetalle find(Object id);

    List<HorarioDetalle> findAll();

    List<HorarioDetalle> findRange(int[] range);

    int count();
    
}
