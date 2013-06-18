/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.facade;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Carlos-PC
 */
@Local
public interface LocalFacadeLocal {

    void create(org.softgreen.sisca.model.Local local);

    void edit(org.softgreen.sisca.model.Local local);

    void remove(org.softgreen.sisca.model.Local local);

    org.softgreen.sisca.model.Local find(Object id);

    List<org.softgreen.sisca.model.Local> findAll();

    List<org.softgreen.sisca.model.Local> findRange(int[] range);

    int count();
    
}
