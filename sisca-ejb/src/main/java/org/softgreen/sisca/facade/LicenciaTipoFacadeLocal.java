/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.facade;

import java.util.List;
import javax.ejb.Local;
import org.softgreen.sisca.model.LicenciaTipo;

/**
 *
 * @author Carlos-PC
 */
@Local
public interface LicenciaTipoFacadeLocal {

    void create(LicenciaTipo licenciaTipo);

    void edit(LicenciaTipo licenciaTipo);

    void remove(LicenciaTipo licenciaTipo);

    LicenciaTipo find(Object id);

    List<LicenciaTipo> findAll();

    List<LicenciaTipo> findRange(int[] range);

    int count();
    
}
