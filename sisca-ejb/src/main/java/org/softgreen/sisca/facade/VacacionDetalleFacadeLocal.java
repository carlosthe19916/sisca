/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.facade;

import java.util.List;
import javax.ejb.Local;
import org.softgreen.sisca.model.VacacionDetalle;

/**
 *
 * @author Carlos-PC
 */
@Local
public interface VacacionDetalleFacadeLocal {

    void create(VacacionDetalle vacacionDetalle);

    void edit(VacacionDetalle vacacionDetalle);

    void remove(VacacionDetalle vacacionDetalle);

    VacacionDetalle find(Object id);

    List<VacacionDetalle> findAll();

    List<VacacionDetalle> findRange(int[] range);

    int count();
    
}
