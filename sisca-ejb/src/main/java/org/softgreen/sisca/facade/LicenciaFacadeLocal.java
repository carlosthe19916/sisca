/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.facade;

import java.util.List;
import javax.ejb.Local;
import org.softgreen.sisca.model.Licencia;

/**
 *
 * @author Carlos-PC
 */
@Local
public interface LicenciaFacadeLocal {

    void create(Licencia licencia);

    void edit(Licencia licencia);

    void remove(Licencia licencia);

    Licencia find(Object id);

    List<Licencia> findAll();

    List<Licencia> findRange(int[] range);

    int count();
    
}
